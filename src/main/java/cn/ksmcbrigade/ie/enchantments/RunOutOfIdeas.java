package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class RunOutOfIdeas extends IdiomEnchantment {

    public RunOutOfIdeas() {
        super(EnchantmentCategory.VANISHABLE, IdiomEnchantment.MAIN_OFF);
    }

    @Override
    public boolean isCurse() {
        return true;
    }

    @Override
    public void doPostAttack(LivingEntity p_44686_, Entity p_44687_, int p_44688_) {
        if(p_44688_>0){
            p_44686_.getItemInHand(p_44686_.getUsedItemHand()).setDamageValue(p_44686_.getItemInHand(p_44686_.getUsedItemHand()).getMaxDamage());
        }
    }
}
