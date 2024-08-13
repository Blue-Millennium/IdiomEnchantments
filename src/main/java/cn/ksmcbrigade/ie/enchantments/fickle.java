package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

import java.security.SecureRandom;

public class fickle extends IdiomEnchantment {

    public SecureRandom random = new SecureRandom();

    public fickle() {
        super(EnchantmentCategory.VANISHABLE, IdiomEnchantment.MAIN_OFF);
    }

    @Override
    public float getDamageBonus(int level, MobType mobType, ItemStack enchantedItem) {
            return random.nextFloat(-100F,100F);
    }
}
