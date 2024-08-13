package cn.ksmcbrigade.ie.mixin;

import cn.ksmcbrigade.ie.EnchantmentsRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Player.class)
public abstract class PlayerMixin extends LivingEntity {
    protected PlayerMixin(EntityType<? extends LivingEntity> p_20966_, Level p_20967_) {
        super(p_20966_, p_20967_);
    }

    @Redirect(method = "attack",at = @At(value = "INVOKE",target = "Lnet/minecraft/world/item/enchantment/EnchantmentHelper;getDamageBonus(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/MobType;)F"))
    public float attack(ItemStack p_44834_, MobType p_44835_){
        if(EnchantmentHelper.getItemEnchantmentLevel(EnchantmentsRegistry.HideIt.get(),p_44834_)>0) return 0.0F;
        if(EnchantmentHelper.getItemEnchantmentLevel(EnchantmentsRegistry.BB.get(),p_44834_)>0) return 0.0F;
        if(EnchantmentHelper.getItemEnchantmentLevel(EnchantmentsRegistry.Si.get(),p_44834_)>0) return -2F;
        if(EnchantmentHelper.getItemEnchantmentLevel(EnchantmentsRegistry.Sa.get(),p_44834_)>0) return 3.5F;
        return EnchantmentHelper.getDamageBonus(p_44834_,p_44835_);
    }
}
