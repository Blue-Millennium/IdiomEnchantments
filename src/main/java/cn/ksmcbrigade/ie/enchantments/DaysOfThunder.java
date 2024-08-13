package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;

public class DaysOfThunder extends IdiomEnchantment {
    public DaysOfThunder() {
        super(EnchantmentCategory.VANISHABLE, IdiomEnchantment.MAIN_OFF);
    }

    @Override
    public void doPostAttack(@NotNull LivingEntity p_44686_, @NotNull Entity p_44687_, int level) {
        if(level>0){
            LightningBolt lightningBolt = new LightningBolt(EntityType.LIGHTNING_BOLT,p_44687_.level());
            lightningBolt.setPos(p_44687_.getPosition(0));
            p_44687_.level().addFreshEntity(lightningBolt);
        }
    }
}
