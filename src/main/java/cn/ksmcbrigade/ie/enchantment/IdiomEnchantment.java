package cn.ksmcbrigade.ie.enchantment;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class IdiomEnchantment extends Enchantment {

    public static EquipmentSlot[] MAIN_OFF = new EquipmentSlot[]{EquipmentSlot.MAINHAND,EquipmentSlot.OFFHAND};

    public IdiomEnchantment(EnchantmentCategory type, EquipmentSlot[] slots) {
        super(Rarity.UNCOMMON,type, slots);
    }
}
