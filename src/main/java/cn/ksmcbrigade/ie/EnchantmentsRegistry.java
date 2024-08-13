package cn.ksmcbrigade.ie;

import cn.ksmcbrigade.ie.enchantments.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static cn.ksmcbrigade.ie.IdiomEnchantment.MODID;

public class EnchantmentsRegistry {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(Registries.ENCHANTMENT, MODID);

    public static final RegistryObject<Enchantment> StandStill = ENCHANTMENTS.register("stand_still", cn.ksmcbrigade.ie.enchantments.StandStill::new);

    public static final RegistryObject<Enchantment> HideIt = ENCHANTMENTS.register("hide_it", HideIt::new);

    public static final RegistryObject<Enchantment> GOOD_FOR_BAD = ENCHANTMENTS.register("good_for_bad", GoodForBad::new);

    public static final RegistryObject<Enchantment> run_out_of_ideas = ENCHANTMENTS.register("run_out_of_ideas", RunOutOfIdeas::new);

    public static final RegistryObject<Enchantment> ND = ENCHANTMENTS.register("no_death", NoDeath::new);
    public static final RegistryObject<Enchantment> BTC = ENCHANTMENTS.register("bell_the_cat", BellTheCat::new);
    public static final RegistryObject<Enchantment> RH = ENCHANTMENTS.register("roman_holiday",RomanHoliday::new);
    public static final RegistryObject<Enchantment> I = ENCHANTMENTS.register("immortality",Immortality::new);

    public static final RegistryObject<Enchantment> DOT = ENCHANTMENTS.register("days_of_thunder",DaysOfThunder::new);
    public static final RegistryObject<Enchantment> BB = ENCHANTMENTS.register("beyond_belief",beyondBelief::new);

    public static final RegistryObject<Enchantment> DFJP = ENCHANTMENTS.register("help_the_poor_from_the_rich",DFJP::new);
    public static final RegistryObject<Enchantment> SITB = ENCHANTMENTS.register("stab_in_the_back",StabInTheBack::new);
    public static final RegistryObject<Enchantment> DA = ENCHANTMENTS.register("drift_away",DriftAway::new);
    public static final RegistryObject<Enchantment> MINGLE = ENCHANTMENTS.register("mingle",Mingle::new);
    public static final RegistryObject<Enchantment> KILL_ALL = ENCHANTMENTS.register("kill_all",KillAll::new);
    public static final RegistryObject<Enchantment> FICKLE = ENCHANTMENTS.register("fickle",fickle::new);
    public static final RegistryObject<Enchantment> PWF = ENCHANTMENTS.register("playing_with_fire",PlayingWithFire::new);
    public static final RegistryObject<Enchantment> YDOD = ENCHANTMENTS.register("it_die_or_die",YDOD::new);
    public static final RegistryObject<Enchantment> DAJ = ENCHANTMENTS.register("david_and_jonathan",DavidAndJonathan::new);
    public static final RegistryObject<Enchantment> Little = ENCHANTMENTS.register("little",Little::new);
    public static final RegistryObject<Enchantment> TimeFlies = ENCHANTMENTS.register("time_flies",TimeFlies::new);
    public static final RegistryObject<Enchantment> AT = ENCHANTMENTS.register("advising_the",AdvisingtThe::new);
    public static final RegistryObject<Enchantment> STM = ENCHANTMENTS.register("seize_the_moment",SeizeTheMoment::new);
    public static final RegistryObject<Enchantment> Si = ENCHANTMENTS.register("self_importance",selfImportance::new);
    public static final RegistryObject<Enchantment> Sa = ENCHANTMENTS.register("self_abandon",selfAbandon::new);
}
