package cn.ksmcbrigade.ie;

import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IdiomEnchantment.MODID)
@Mod.EventBusSubscriber(modid = IdiomEnchantment.MODID)
public class IdiomEnchantment {

    public static final String MODID = "ie";

    public IdiomEnchantment() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        EnchantmentsRegistry.ENCHANTMENTS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onEntityAttack(LivingHurtEvent event) {
        if (EnchantmentHelper.getEnchantmentLevel(EnchantmentsRegistry.I.get(), event.getEntity()) > 0) {
            LivingEntity entity = event.getEntity();
            entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2));
        }
    }


    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event){
        if(EnchantmentHelper.getEnchantmentLevel(EnchantmentsRegistry.DA.get(),event.player)>0){
            event.player.addEffect(new MobEffectInstance(MobEffects.DARKNESS,2));
        }
    }
}
