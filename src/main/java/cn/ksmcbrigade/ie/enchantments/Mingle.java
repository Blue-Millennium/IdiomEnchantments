package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class Mingle extends IdiomEnchantment {
    public Mingle() {
        super(EnchantmentCategory.VANISHABLE, IdiomEnchantment.MAIN_OFF);
    }

    @Override
    public void doPostAttack(@NotNull LivingEntity p_44686_, @NotNull Entity p_44687_, int p_44688_) {
        if(p_44688_>0){
            Vec3 vec3 = p_44687_.getPosition(0);
            p_44686_.teleportTo(vec3.x,vec3.y,vec3.z);
        }

    }
}
