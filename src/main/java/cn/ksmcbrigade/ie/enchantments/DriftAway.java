package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class DriftAway extends IdiomEnchantment {

    public DriftAway() {
        super(EnchantmentCategory.VANISHABLE, new EquipmentSlot[]{EquipmentSlot.HEAD});
    }
}
