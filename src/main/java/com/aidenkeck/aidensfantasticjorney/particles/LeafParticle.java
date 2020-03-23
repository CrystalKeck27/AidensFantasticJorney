package com.aidenkeck.aidensfantasticjorney.particles;

import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class LeafParticle extends SpriteTexturedParticle {
    private final float rotSpeed;
    private final IAnimatedSprite field_217580_F;
    protected LeafParticle(World worldIn, double posXIn, double posYIn, double posZIn, IAnimatedSprite spriteSet) {
        super(worldIn, posXIn, posYIn, posZIn, 0, 0, 0);
        rotSpeed = 1f;
        field_217580_F = spriteSet;
        particleScale = 1;
    }

    @Nonnull
    @Override
    public IParticleRenderType getRenderType() {
        return IParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    @Override
    public float getScale(float p_217561_1_) {
        return this.particleScale * MathHelper.clamp(((float)this.age + p_217561_1_) / (float)this.maxAge * 32.0F, 0.0F, 1.0F);
    }

    public void tick() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.age++ >= this.maxAge) {
            this.setExpired();
        } else {
            this.selectSpriteWithAge(this.field_217580_F);
            this.prevParticleAngle = this.particleAngle;
            this.particleAngle += (float)Math.PI * this.rotSpeed * 2.0F;
            if (this.onGround) {
                this.prevParticleAngle = this.particleAngle = 0.0F;
            }

            this.move(this.motionX, this.motionY, this.motionZ);
            this.motionY -= (double)0.003F;
            this.motionY = Math.max(this.motionY, (double)-0.14F);
        }
    }

    @OnlyIn(Dist.CLIENT)
    public class Factory implements IParticleFactory {
        private final IAnimatedSprite spriteSet;

        public Factory(IAnimatedSprite spriteSet) {
            this.spriteSet = spriteSet;
        }

        @Nullable
        @Override
        public Particle makeParticle(IParticleData typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            return new LeafParticle(worldIn, x, y, z, spriteSet);
        }
    }
}
