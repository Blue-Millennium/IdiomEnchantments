package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;

public class BellTheCat extends IdiomEnchantment {

    public BellTheCat() {
        super(EnchantmentCategory.VANISHABLE, IdiomEnchantment.MAIN_OFF);
    }

    @Override
    public void doPostAttack(@NotNull LivingEntity p_44686_, @NotNull Entity p_44687_, int level) {
        if((p_44687_ instanceof LivingEntity target) && level>0){
            target.heal((float) p_44686_.getAttributeValue(Attributes.ATTACK_DAMAGE));
            p_44686_.hurt(p_44686_.damageSources().generic(),(float) p_44686_.getAttributeValue(Attributes.ATTACK_DAMAGE));
        }
    }
}
