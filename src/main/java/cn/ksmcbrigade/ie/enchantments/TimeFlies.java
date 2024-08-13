package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class TimeFlies extends IdiomEnchantment {
    public TimeFlies() {
        super(EnchantmentCategory.VANISHABLE, IdiomEnchantment.MAIN_OFF);
    }


    @Override
    public void doPostAttack(@NotNull LivingEntity p_44686_, @NotNull Entity p_44687_, int p_44688_) {
        if(p_44688_>0){
            Vec3 pos = p_44686_.position();
            Vec3 pos2 = p_44687_.position();
            p_44686_.teleportTo(pos2.x,pos2.y,pos2.z);
            p_44687_.teleportTo(pos.x,pos.y,pos.z);
        }
    }
}
