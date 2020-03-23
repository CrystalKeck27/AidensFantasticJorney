package com.aidenkeck.aidensfantasticjorney.particles;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;

import java.util.ArrayList;
import java.util.List;

public class ModParticles {

    public static final List<ParticleType<?>> PARTICLES = new ArrayList<>();

    public static final BasicParticleType FALLING_LEAF = register("falling_leaf", false);

    private static BasicParticleType register(String name, boolean alwaysShow) {
        BasicParticleType particleType = new BasicParticleType(alwaysShow);
        particleType.setRegistryName(name);

        PARTICLES.add(particleType);
        return particleType;
    }
}
