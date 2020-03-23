package com.aidenkeck.aidensfantasticjorney.client.renderer;

import com.aidenkeck.aidensfantasticjorney.client.model.EntityDoohickieModel;
import com.aidenkeck.aidensfantasticjorney.entities.EntityDoohickie;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@OnlyIn(Dist.CLIENT)
public class EntityDoohickieRenderer extends MobRenderer<EntityDoohickie, EntityDoohickieModel> {
    public EntityDoohickieRenderer(EntityRendererManager manager) {
        super(manager, new EntityDoohickieModel(), 0.3f);
    }

    @ParametersAreNonnullByDefault
    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityDoohickie entity) {
        return new ResourceLocation("aidensfantasticjorney", "textures/entity/doohickie/doohickie.png");
    }

}
