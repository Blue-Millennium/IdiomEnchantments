package cn.ksmcbrigade.ie.mixin;

import cn.ksmcbrigade.ie.EnchantmentsRegistry;
import cn.ksmcbrigade.ie.utils.AbstractArrowUtil;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(BowItem.class)
public class BowMixin {
    @Inject(method = "releaseUsing",at = @At(value = "INVOKE",target = "Lnet/minecraft/world/entity/projectile/AbstractArrow;shootFromRotation(Lnet/minecraft/world/entity/Entity;FFFFF)V",shift = At.Shift.BEFORE),locals = LocalCapture.CAPTURE_FAILSOFT)
    public void releaseUsing(ItemStack p_40667_, Level p_40668_, LivingEntity p_40669_, int p_40670_, CallbackInfo ci, Player player, boolean flag, ItemStack itemstack, int i, float f, boolean flag1, ArrowItem arrowitem, AbstractArrow abstractarrow){
        if(EnchantmentHelper.getItemEnchantmentLevel(EnchantmentsRegistry.SITB.get(),p_40667_)>0) abstractarrow.setInvisible(true);
        ((AbstractArrowUtil)abstractarrow).set(EnchantmentHelper.getItemEnchantmentLevel(EnchantmentsRegistry.SITB.get(),p_40667_)>0);
        ((AbstractArrowUtil)abstractarrow).set2(EnchantmentHelper.getItemEnchantmentLevel(EnchantmentsRegistry.MINGLE.get(),p_40667_)>0);
    }
}
