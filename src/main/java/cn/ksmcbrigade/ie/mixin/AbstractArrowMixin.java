package cn.ksmcbrigade.ie.mixin;

import cn.ksmcbrigade.ie.utils.AbstractArrowUtil;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractArrow.class)
public abstract class AbstractArrowMixin extends Projectile implements AbstractArrowUtil {

    private boolean inv = false;
    private boolean tp = false;

    protected AbstractArrowMixin(EntityType<? extends Projectile> p_37248_, Level p_37249_) {
        super(p_37248_, p_37249_);
    }

    @Redirect(method = "tick",at = @At(value = "INVOKE",target = "Lnet/minecraft/world/level/Level;addParticle(Lnet/minecraft/core/particles/ParticleOptions;DDDDDD)V"))
    public void particle(Level instance, ParticleOptions p_46631_, double p_46632_, double p_46633_, double p_46634_, double p_46635_, double p_46636_, double p_46637_){
        if(!this.inv){
            instance.addParticle(p_46631_, p_46632_, p_46633_, p_46634_, p_46635_, p_46636_, p_46637_);
        }
    }

    @Inject(method = {"onHitBlock","onHitEntity"},at = @At(value = "HEAD"))
    public void hit(CallbackInfo ci){
        if(tp && this.getOwner()!=null){
            Vec3 vec3 = this.getPosition(0);
            this.getOwner().teleportTo(vec3.x,vec3.y,vec3.z);
        }
    }

    @Override
    public void set(boolean inv){
        this.inv = inv;
    }

    @Override
    public void set2(boolean tp) {
        this.tp = tp;
    }
}
