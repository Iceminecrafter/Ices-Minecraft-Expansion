package com.iceminecrafter.IME.tileentity;

import com.iceminecrafter.IME.blocks.MFCSmelter;
import com.iceminecrafter.IME.handler.MFCSmelterRecipes;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityMFCSmelter extends TileEntity implements ISidedInventory {

	private static final int[] slotsTop = new int[] { 0 };
	private static final int[] slotsBottom = new int[] { 2, 1 };
	private static final int[] slotsSides = new int[] { 1 };

	private ItemStack[] smelterItemStacks = new ItemStack[3];

	public int smelterBurnTime;
	public int currentBurnTime;
	public int smelterCookTime;

	private String smelterName;

	public void smelterName(String string){
		this.smelterName = string;
	}
	
	@Override
	public int getSizeInventory() {
		return this.smelterItemStacks.length;
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return this.smelterItemStacks[slot];
	}

	@Override
	public ItemStack decrStackSize(int par1, int par2) {
		if (this.smelterItemStacks[par1] != null) {
			ItemStack itemstack;
			if (this.smelterItemStacks[par1].stackSize <= par2) {
				itemstack = this.smelterItemStacks[par1];
				this.smelterItemStacks[par1] = null;
				return itemstack;
			} else {
				itemstack = this.smelterItemStacks[par1].splitStack(par2);

				if (this.smelterItemStacks[par1].stackSize == 0) {
					this.smelterItemStacks[par1] = null;
				}
				return itemstack;
			}
		} else {
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
		if (this.smelterItemStacks[slot] != null) {
			ItemStack itemstack = this.smelterItemStacks[slot];
			this.smelterItemStacks[slot] = null;
			return itemstack;
		} else {
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack itemstack) {
		this.smelterItemStacks[slot] = itemstack;

		if (itemstack != null && itemstack.stackSize > this.getInventoryStackLimit()) {
			itemstack.stackSize = this.getInventoryStackLimit();
		}

	}

	@Override
	public String getInventoryName() {
		return this.hasCustomInventoryName() ? this.smelterName : "Smelter";
	}

	@Override
	public boolean hasCustomInventoryName() {
		return this.smelterName != null && this.smelterName.length() > 0;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	public void readFromNBT(NBTTagCompound tagCompound) {
		super.readFromNBT(tagCompound);
		NBTTagList tagList = tagCompound.getTagList("Items", 10);
		this.smelterItemStacks = new ItemStack[this.getSizeInventory()];

		for (int i = 0; i < tagList.tagCount(); ++i) {
			NBTTagCompound tabCompound1 = tagList.getCompoundTagAt(i);
			byte byte0 = tabCompound1.getByte("Slot");

			if (byte0 >= 0 && byte0 < this.smelterItemStacks.length) {
				this.smelterItemStacks[byte0] = ItemStack.loadItemStackFromNBT(tabCompound1);
			}
		}

		this.smelterBurnTime = tagCompound.getShort("BurnTime");
		this.smelterCookTime = tagCompound.getShort("CookTime");
		this.currentBurnTime = getItemBurnTime(this.smelterItemStacks[1]);

		if (tagCompound.hasKey("CustomName", 8)) {
			this.smelterName = tagCompound.getString("CustomName");
		}
	}

	public void writeToNBT(NBTTagCompound tagCompound) {
		super.writeToNBT(tagCompound);
		tagCompound.setShort("BurnTime", (short) this.smelterBurnTime);
		tagCompound.setShort("CookTime", (short) this.smelterBurnTime);
		NBTTagList tagList = new NBTTagList();

		for (int i = 0; i < this.smelterItemStacks.length; ++i) {
			if (this.smelterItemStacks[i] != null) {
				NBTTagCompound tagCompound1 = new NBTTagCompound();
				tagCompound1.setByte("Slot", (byte) i);
				this.smelterItemStacks[i].writeToNBT(tagCompound1);
				tagList.appendTag(tagCompound1);
			}
		}

		tagCompound.setTag("Items", tagList);

		if (this.hasCustomInventoryName()) {
			tagCompound.setString("CustomName", this.smelterName);
		}
	}

	@SideOnly(Side.CLIENT)
	public int getCookProgressScaled(int par1) {
		return this.smelterCookTime * par1 / 200;
	}

	@SideOnly(Side.CLIENT)
	public int getBurnTimeRemainingScaled(int par1) {
		if (this.currentBurnTime == 0) {
			this.currentBurnTime = 200;
		}

		return this.smelterBurnTime * par1 / this.currentBurnTime;
	}

	public boolean isBurning() {
		return this.smelterBurnTime > 0;
	}

	public void updateEntity() {
		boolean flag = this.smelterBurnTime > 0;
		boolean flag1 = false;

		if (this.smelterBurnTime > 0) {
			--this.smelterBurnTime;
		}

		if (!this.worldObj.isRemote) {
			if (this.smelterBurnTime == 0 && this.canSmelt()) {
				this.currentBurnTime = this.smelterBurnTime = getItemBurnTime(this.smelterItemStacks[1]);

				if (this.smelterBurnTime > 0) {
					flag1 = true;
					if (this.smelterItemStacks[1] != null) {
						--this.smelterItemStacks[1].stackSize;

						if (this.smelterItemStacks[1].stackSize == 0) {
							this.smelterItemStacks[1] = smelterItemStacks[1].getItem().getContainerItem(this.smelterItemStacks[1]);
						}
					}
				}
			}

			if (this.isBurning() && this.canSmelt()) {
				++this.smelterCookTime;
				if (this.smelterCookTime == 200) {
					this.smelterCookTime = 0;
					this.smeltItem();
					flag1 = true;
				}
			} else {
				this.smelterCookTime = 0;
			}
		}

		if (flag != this.smelterBurnTime > 0) {
			flag1 = true;
			MFCSmelter.updateBlockState(this.smelterBurnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
		}

		if (flag1) {
			this.markDirty();
		}
	}

	private boolean canSmelt() {
		if (this.smelterItemStacks[0] == null) {
			return false;
		} else {
			ItemStack itemstack = MFCSmelterRecipes.smelting().getSmeltingResult(this.smelterItemStacks[0]);
			if (itemstack == null) return false;
			if (this.smelterItemStacks[2] == null) return true;
			if (!this.smelterItemStacks[2].isItemEqual(itemstack)) return false;
			int result = smelterItemStacks[2].stackSize + itemstack.stackSize;
			return result <= getInventoryStackLimit() && result <= this.smelterItemStacks[2].getMaxStackSize();
		}
	}

	public void smeltItem() {
		if (this.canSmelt()) {
			ItemStack itemstack = MFCSmelterRecipes.smelting().getSmeltingResult(this.smelterItemStacks[0]);

			if (this.smelterItemStacks[2] == null) {
				this.smelterItemStacks[2] = itemstack.copy();
			} else if (this.smelterItemStacks[2].getItem() == itemstack.getItem()) {
				this.smelterItemStacks[2].stackSize += itemstack.stackSize;
			}
			
			--this.smelterItemStacks[0].stackSize;
			
			if(this.smelterItemStacks[0].stackSize == 0){
				this.smelterItemStacks[0] = null;
				}

		}
	}
	
    public static int getItemBurnTime(ItemStack itemstack)
    {
        if (itemstack == null)
        {
            return 0;
        }
        else
        {
            Item item = itemstack.getItem();

            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air)
            {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.wooden_slab)
                {
                    return 150;
                }

                if (block.getMaterial() == Material.wood)
                {
                    return 300;
                }

                if (block == Blocks.coal_block)
                {
                    return 16000;
                }
            }

            if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemHoe && ((ItemHoe)item).getToolMaterialName().equals("WOOD")) return 200;
            if (item == Items.stick) return 100;
            if (item == Items.coal) return 1600;
            if (item == Items.lava_bucket) return 20000;
            if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
            if (item == Items.blaze_rod) return 2400;
            return GameRegistry.getFuelValue(itemstack);
        }
    }

	public static boolean isItemFuel(ItemStack itemstack){
		return getItemBurnTime(itemstack) > 0;
	}
	
	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : player.getDistanceSq((double) this.xCoord + 0.5D, (double) this.yCoord + 0.5D, (double) this.zCoord + 0.5D) <= 64.0D;
	}

	@Override
	public void openInventory() {

	}

	@Override
	public void closeInventory() {

	}

	@Override
	public boolean isItemValidForSlot(int par1, ItemStack itemstack) {
		return par1 == 2 ? false : (par1 == 1 ? isItemFuel(itemstack) : true);
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int par1) {
		return par1 == 0 ? slotsBottom : (par1 == 1 ? slotsTop : slotsSides);
	}

	@Override
	public boolean canInsertItem(int par1, ItemStack itemstack, int par3) {
		return this.isItemValidForSlot(par1, itemstack);
	}

	@Override
	public boolean canExtractItem(int par1, ItemStack itemstack, int par3) {
		return par3 != 0 || par1 != 1 || itemstack.getItem() == Items.bucket;
	}

}