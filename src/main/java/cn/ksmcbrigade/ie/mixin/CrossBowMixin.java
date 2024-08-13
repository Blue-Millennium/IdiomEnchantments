package cn.ksmcbrigade.ie.mixin;

import cn.ksmcbrigade.ie.EnchantmentsRegistry;
import cn.ksmcbrigade.ie.utils.AbstractArrowUtil;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CrossbowItem.class)
public class CrossBowMixin {
    @Inject(method = "getArrow",at = @At("RETURN"), cancellable = true)
    private static void arrow(Level p_40915_, LivingEntity p_40916_, ItemStack p_40917_, ItemStack p_40918_, CallbackInfoReturnable<AbstractArrow> cir){
        AbstractArrow arrow = cir.getReturnValue();
        if(EnchantmentHelper.getItemEnchantmentLevel(EnchantmentsRegistry.SITB.get(),p_40917_)>0) arrow.setInvisible(true);
        ((AbstractArrowUtil)arrow).set(EnchantmentHelper.getItemEnchantmentLevel(EnchantmentsRegistry.SITB.get(),p_40917_)>0);
        ((AbstractArrowUtil)arrow).set2(EnchantmentHelper.getItemEnchantmentLevel(EnchantmentsRegistry.MINGLE.get(),p_40917_)>0);
        cir.setReturnValue(arrow);
    }
}
