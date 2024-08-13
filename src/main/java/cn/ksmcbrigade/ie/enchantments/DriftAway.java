package cn.ksmcbrigade.ie.enchantments;

import cn.ksmcbrigade.ie.enchantment.IdiomEnchantment;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;

public class DriftAway extends IdiomEnchantment {

    public DriftAway() {
        super(EnchantmentCategory.VANISHABLE, new EquipmentSlot[]{EquipmentSlot.HEAD});
    }
}
