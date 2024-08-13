package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class HideIt extends IdiomEnchantment {

    public HideIt() {
        super(EnchantmentCategory.VANISHABLE, IdiomEnchantment.MAIN_OFF);
    }

    @Override
    public float getDamageBonus(int level, MobType mobType, ItemStack enchantedItem) {
        return (float) Double.POSITIVE_INFINITY;
    }
}
