package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class AdvisingtThe extends IdiomEnchantment {
    public AdvisingtThe() {
        super(EnchantmentCategory.VANISHABLE, IdiomEnchantment.MAIN_OFF);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public void doPostAttack(@NotNull LivingEntity p_44686_, @NotNull Entity p_44687_, int p_44688_) {
        if(p_44688_>0){
            new Thread(()->{
                long start = System.currentTimeMillis();
                Vec3 pos = p_44687_.getPosition(0);
                while (System.currentTimeMillis()-start <= p_44688_*3000L){
                    p_44686_.setPos(pos);
                }
            }).start();
        }
    }

    @Override
    public boolean isCurse() {
        return true;
    }
}
