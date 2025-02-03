package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;

import static java.lang.Math.min;

public class StandStill extends IdiomEnchantment {
    public StandStill() {
        super(EnchantmentCategory.VANISHABLE, IdiomEnchantment.MAIN_OFF);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public void doPostAttack(@NotNull LivingEntity attacker, @NotNull Entity target, int level) {
        if (level > 0) {
            int duration = 5 * 20;
            if (level == 4) {
                duration = 10 * 20;
            } else if (level == 5) {
                duration = 15 * 20;
            }
            int amplifier = min(level - 1, 2);
            MobEffectInstance slowEffect = new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, duration, amplifier);
            if (target instanceof LivingEntity livingTarget) {
                livingTarget.addEffect(slowEffect);
            }
        }
    }
}
