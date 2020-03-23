package com.aidenkeck.aidensfantasticjorney.entities;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

public class EntityDoohickie extends CreatureEntity {
    protected EntityDoohickie(World world) {
        super(ModEntities.DOOHICKIE, world);
    }

    public EntityDoohickie(EntityType<EntityDoohickie> entityType, World world) {
        super(entityType, world);
        getAlwaysRenderNameTagForRender();
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        goalSelector.addGoal(0, new SwimGoal(this));
        goalSelector.addGoal(1, new RandomWalkingGoal(this, 0.3d));
        goalSelector.addGoal(2, new LookRandomlyGoal(this));
    }

    @Override
    protected void registerAttributes(){
        super.registerAttributes();
        getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0d);
        getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3d);
    }

    public static EntityType.IFactory<EntityDoohickie> factory = new EntityType.IFactory<EntityDoohickie>() {

        @ParametersAreNonnullByDefault
        @Nonnull
        @Override
        public EntityDoohickie create(EntityType<EntityDoohickie> p_create_1_, World world) {
            return new EntityDoohickie(world);
        }
    };
}
