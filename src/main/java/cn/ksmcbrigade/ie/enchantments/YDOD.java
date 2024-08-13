package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;

import java.security.SecureRandom;

public class YDOD extends IdiomEnchantment {

    public SecureRandom random = new SecureRandom();

    public YDOD() {
        super(EnchantmentCategory.VANISHABLE, IdiomEnchantment.MAIN_OFF);
    }

    @Override
    public void doPostAttack(@NotNull LivingEntity p_44686_, @NotNull Entity p_44687_, int p_44688_) {
        if(p_44688_>0){
            (random.nextBoolean()?p_44686_:p_44687_).kill();
        }
    }
}
