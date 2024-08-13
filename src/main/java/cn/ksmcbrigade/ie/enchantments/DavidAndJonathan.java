package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;

public class DavidAndJonathan extends IdiomEnchantment {

    public DavidAndJonathan() {
        super(EnchantmentCategory.VANISHABLE, IdiomEnchantment.MAIN_OFF);
    }

    @Override
    public void doPostAttack(@NotNull LivingEntity p_44686_, @NotNull Entity p_44687_, int p_44688_) {
        if(p_44688_>0){
            if(p_44686_.isAlive() && !p_44687_.isAlive()){
                p_44686_.kill();
            }
            else if(!p_44686_.isAlive() && p_44687_.isAlive()){
                p_44687_.kill();
            }
        }
    }

    @Override
    public void doPostHurt(@NotNull LivingEntity p_44686_, @NotNull Entity p_44687_, int p_44694_) {
        if(p_44694_>0){
            if(p_44686_.isAlive() && !p_44687_.isAlive()){
                p_44686_.kill();
            }
            else if(!p_44686_.isAlive() && p_44687_.isAlive()){
                p_44687_.kill();
            }
        }
    }
}
