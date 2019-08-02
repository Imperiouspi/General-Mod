package com.imperiouspi.generalmod.setup;

import com.imperiouspi.generalmod.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
	public ItemGroup itemGroup = new ItemGroup("generaltab") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ModBlocks.CARDTABLEBLOCK);
		}
	};
	public void init(){

	}
}
