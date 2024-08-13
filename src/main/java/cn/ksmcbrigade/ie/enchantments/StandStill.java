package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class StandStill extends IdiomEnchantment {
    public StandStill() {
        super(EnchantmentCategory.VANISHABLE, IdiomEnchantment.MAIN_OFF);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public void doPostAttack(@NotNull LivingEntity p_44686_, @NotNull Entity p_44687_, int level) {
        if(level>0){
            new Thread(()->{
                long start = System.currentTimeMillis();
                Vec3 pos = p_44687_.getPosition(0);
                while (System.currentTimeMillis()-start <= level*3000L){
                    p_44687_.setPos(pos);
                }
            }).start();
        }
    }
}
