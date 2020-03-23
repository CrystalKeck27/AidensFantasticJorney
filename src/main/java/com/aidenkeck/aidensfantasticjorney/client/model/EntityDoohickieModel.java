package com.aidenkeck.aidensfantasticjorney.client.model;


import com.aidenkeck.aidensfantasticjorney.entities.EntityDoohickie;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class EntityDoohickieModel extends EntityModel<EntityDoohickie> {
    private final RendererModel bodyGroup;
    private final RendererModel legFLGroup;
    private final RendererModel legBLGroup;
    private final RendererModel legFRGroup;
    private final RendererModel legBRGroup;
    private final RendererModel headGroup;
    private final RendererModel tailGroup;
    private final RendererModel trailEndGroup;

    public EntityDoohickieModel() {
        textureWidth = 32;
        textureHeight = 32;

        bodyGroup = new RendererModel(this);
        bodyGroup.setRotationPoint(0.0F, 21.0F, 0.0F);
        bodyGroup.cubeList.add(new ModelBox(bodyGroup, 0, 0, -2.0F, -2.0F, -3.0F, 4, 3, 6, 0.0F, false));

        legFLGroup = new RendererModel(this);
        legFLGroup.setRotationPoint(2.0F, 0.0F, -2.0F);
        bodyGroup.addChild(legFLGroup);
        legFLGroup.cubeList.add(new ModelBox(legFLGroup, 8, 18, 0.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F, false));

        legBLGroup = new RendererModel(this);
        legBLGroup.setRotationPoint(2.0F, 0.0F, 2.0F);
        bodyGroup.addChild(legBLGroup);
        legBLGroup.cubeList.add(new ModelBox(legBLGroup, 12, 12, 0.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F, false));

        legFRGroup = new RendererModel(this);
        legFRGroup.setRotationPoint(-2.0F, 0.0F, -2.0F);
        bodyGroup.addChild(legFRGroup);
        legFRGroup.cubeList.add(new ModelBox(legFRGroup, 14, 0, -2.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F, false));

        legBRGroup = new RendererModel(this);
        legBRGroup.setRotationPoint(-2.0F, 0.0F, 2.0F);
        bodyGroup.addChild(legBRGroup);
        legBRGroup.cubeList.add(new ModelBox(legBRGroup, 0, 15, -2.0F, -1.0F, -1.0F, 2, 4, 2, 0.0F, false));

        headGroup = new RendererModel(this);
        headGroup.setRotationPoint(0.0F, -1.0F, -3.0F);
        bodyGroup.addChild(headGroup);
        headGroup.cubeList.add(new ModelBox(headGroup, 0, 9, -1.5F, -2.0F, -3.0F, 3, 3, 3, 0.0F, false));

        tailGroup = new RendererModel(this);
        tailGroup.setRotationPoint(0.0F, 0.0F, 3.0F);
        bodyGroup.addChild(tailGroup);
        tailGroup.cubeList.add(new ModelBox(tailGroup, 16, 18, -1.0F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        trailEndGroup = new RendererModel(this);
        trailEndGroup.setRotationPoint(0.0F, 0.0F, 2.0F);
        tailGroup.addChild(trailEndGroup);
        trailEndGroup.cubeList.add(new ModelBox(trailEndGroup, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));
    }

    @Override
    public void render(EntityDoohickie entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bodyGroup.render(f5);
    }
    public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}