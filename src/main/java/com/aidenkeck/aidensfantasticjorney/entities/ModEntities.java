package com.aidenkeck.aidensfantasticjorney.entities;

import com.aidenkeck.aidensfantasticjorney.items.ModItems;
import com.aidenkeck.aidensfantasticjorney.setup.ModSetup;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;

public class ModEntities {

    public static final List<EntityType<?>> ENTITY_TYPES = new ArrayList<>();

    public static EntityType<EntityDoohickie> DOOHICKIE = register("aidensfantasticjorney:doohickie", EntityType.Builder.create(EntityDoohickie::new, EntityClassification.CREATURE));

    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        EntityType<T> entityType = builder.build(name);
        entityType.setRegistryName(name);

        ENTITY_TYPES.add(entityType);
        return entityType;
    }
}
