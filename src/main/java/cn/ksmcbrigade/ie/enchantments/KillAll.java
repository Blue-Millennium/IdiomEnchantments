package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;

public class KillAll extends Enchantment {

    public KillAll() {
        super(Rarity.UNCOMMON,EnchantmentCategory.VANISHABLE, IdiomEnchantment.MAIN_OFF);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public void doPostAttack(@NotNull LivingEntity p_44686_, @NotNull Entity p_44687_, int level) {
        if(level>0){
            p_44686_.level().getEntitiesOfClass(Entity.class,new AABB(p_44686_.position(),p_44686_.position()).inflate(level*4D)).stream()
                    .filter(e -> e.getId()!=p_44686_.getId())
                    .filter(e -> e.getType().equals(p_44687_.getType()))
                    .forEach(Entity::kill);
        }
    }
}
