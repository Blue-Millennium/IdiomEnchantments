package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;

public class SeizeTheMoment extends IdiomEnchantment {
    public SeizeTheMoment() {
        super(EnchantmentCategory.VANISHABLE, IdiomEnchantment.MAIN_OFF);
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public void doPostAttack(@NotNull LivingEntity p_44686_, @NotNull Entity p_44687_, int p_44688_) {
        if(p_44688_>0 && (p_44687_ instanceof LivingEntity target)){
            new Thread(() -> {
               long start = System.currentTimeMillis();
               while (target.isAlive() && target.getHealth()>(2.5f*p_44688_) && System.currentTimeMillis()-start<=1000L*60*p_44688_){
                   Thread.yield();
               }
               target.hurt(target.damageSources().generic(),p_44688_*3F);
            });
        }
    }
}
