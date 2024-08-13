package cn.ksmcbrigade.ie.mixin;

import cn.ksmcbrigade.ie.EnchantmentsRegistry;
import net.minecraft.advancements.critereon.UsedTotemTrigger;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(UsedTotemTrigger.class)
public class TotemTriggerMixin {
    @Inject(method = "trigger",at = @At("TAIL"))
    public void trigger(ServerPlayer p_74432_, ItemStack p_74433_, CallbackInfo ci){
        if(EnchantmentHelper.getItemEnchantmentLevel(EnchantmentsRegistry.ND.get(),p_74433_)>0){
            p_74432_.addItem(Items.TOTEM_OF_UNDYING.getDefaultInstance());
        }
    }
}
