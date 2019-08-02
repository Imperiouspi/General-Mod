package com.imperiouspi.generalmod.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy {
	@Override
	public void init() {

	}

	@Override
	public World getClientWorld() {
		throw new IllegalStateException("Only on client!");
	}
}
