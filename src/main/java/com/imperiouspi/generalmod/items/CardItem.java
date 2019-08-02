package com.imperiouspi.generalmod.items;

import com.imperiouspi.generalmod.GeneralMod;
import net.minecraft.item.Item;

public class CardItem extends Item {
	public CardItem() {
		super(new Item.Properties()
				.group(GeneralMod.setup.itemGroup)
				.maxStackSize(12)
		);
		setRegistryName("carditem");
	}
}
