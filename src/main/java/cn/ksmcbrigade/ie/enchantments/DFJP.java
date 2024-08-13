package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;

public class DFJP extends IdiomEnchantment {

    public DFJP() {
        super(EnchantmentCategory.VANISHABLE, IdiomEnchantment.MAIN_OFF);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public void doPostAttack(@NotNull LivingEntity p_44686_, @NotNull Entity p_44687_, int level) {
        if((p_44687_ instanceof Player target) && (p_44686_ instanceof Player player) && level>0){
            int value = target.totalExperience % (20*level);
            target.giveExperiencePoints(-value);
            player.giveExperiencePoints(value);
        }
    }
}
