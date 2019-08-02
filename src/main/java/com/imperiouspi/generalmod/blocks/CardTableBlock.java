package com.imperiouspi.generalmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CardTableBlock extends Block {
	public CardTableBlock() {
		super(Properties.create(Material.WOOD)
		.sound(SoundType.WOOD)
		.hardnessAndResistance(2.0f)
		.lightValue(14)
		);
		setRegistryName("cardtableblock");
	}
}
