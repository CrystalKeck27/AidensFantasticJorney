package com.aidenkeck.aidensfantasticjorney.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy {

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only call this on the client side!");
    }
}
