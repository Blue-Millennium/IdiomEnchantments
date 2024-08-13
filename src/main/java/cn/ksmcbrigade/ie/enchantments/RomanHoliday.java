package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;

public class RomanHoliday extends IdiomEnchantment {
    public RomanHoliday() {
        super(EnchantmentCategory.VANISHABLE, IdiomEnchantment.MAIN_OFF);
    }

    @Override
    public void doPostAttack(@NotNull LivingEntity p_44686_, @NotNull Entity p_44687_, int level) {
        if(level>0){
            p_44686_.heal((float) p_44686_.getAttributeValue(Attributes.ATTACK_DAMAGE)+level);
        }
    }
}
