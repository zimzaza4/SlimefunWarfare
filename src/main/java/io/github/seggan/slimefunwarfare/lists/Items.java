package io.github.seggan.slimefunwarfare.lists;

import io.github.seggan.slimefunwarfare.SlimefunWarfare;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Items {
    public static final Category sfwarfareCategory = new Category(
        new NamespacedKey(SlimefunWarfare.getInstance(), "slimefunwarfare"),
        new CustomItem(Material.DIAMOND_SWORD, "粘液战争")
    );
    public static final Category sfwarfareGunsCategory = new Category(
        new NamespacedKey(SlimefunWarfare.getInstance(), "slimefunwarfare_guns"),
        new CustomItem(Material.CROSSBOW, "粘液战争 - 枪支")
    );
    public static final Category sfwarfareExplosivesCategory = new Category(
        new NamespacedKey(SlimefunWarfare.getInstance(), "slimefunwarfare_explosives"),
        new CustomItem(Material.TNT, "粘液战争 - 炸药")
    );

    public static final SlimefunItemStack SLIMESTEEL = new SlimefunItemStack(
        "SLIMESTEEL_INGOT",
        Material.IRON_INGOT,
        "&a软钢锭",
        "",
        "坚硬但富有弹性，这种合金非常适合各种应用"
    );

    public static final SlimefunItemStack REINFORCED_SLIMESTEEL = new SlimefunItemStack(
        "REINFORCED_SLIMESTEEL_INGOT",
        Material.IRON_INGOT,
        "&a强化软钢锭",
        "",
        "坚硬但富有弹性，这种合金非常适合各种应用"
    );

    public static final SlimefunItemStack SCOPE = new SlimefunItemStack(
        "SCOPE",
        Material.STICK,
        "&a瞄准器"
    );

    public static final SlimefunItemStack BARREL = new SlimefunItemStack(
        "BARREL",
        Material.STICK,
        "&7枪管"
    );

    public static final SlimefunItemStack ADVANCED_BARREL = new SlimefunItemStack(
        "ADVANCED_BARREL",
        Material.STICK,
        "&7高级枪管"
    );

    public static final SlimefunItemStack BULLET_PRESS = new SlimefunItemStack(
        "BULLET_PRESS",
        Material.SMOKER,
        "&7弹药制造机",
        LoreBuilder.powerPerSecond(16),
        LoreBuilder.powerBuffer(32),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack AIR_LIQUEFIER = new SlimefunItemStack(
        "AIR_LIQUEFIER",
        Material.BEACON,
        "&b空气液化器",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack EXPLOSIVE_SYNTHESIZER = new SlimefunItemStack(
        "EXPLOSIVE_SYNTHESIZER",
        Material.TNT,
        "&4爆炸合成器",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack IRON_BULLET = new SlimefunItemStack(
        "IRON_BULLET",
        Material.IRON_NUGGET,
        "&7铁子弹",
        "&7x0.75伤害"
    );

    public static final SlimefunItemStack LEAD_BULLET = new SlimefunItemStack(
        "LEAD_BULLET",
        Material.IRON_NUGGET,
        "&7铅弹",
        "&7x1伤害"
    );

    public static final SlimefunItemStack DU_BULLET = new SlimefunItemStack(
        "DU_BULLET",
        Material.IRON_NUGGET,
        "&aDU弹",
        "&7让命中的实体着火",
        "&7x1.5伤害"
    );

    public static final SlimefunItemStack GOLD_BULLET = new SlimefunItemStack(
        "GOLD_BULLET",
        Material.GOLD_NUGGET,
        "&6金子弹",
        "&7x2伤害"
    );

    public static final SlimefunItemStack TRINITROBULLETENE = new SlimefunItemStack(
        "TRINITROBULLETENE_BULLET",
        Material.GOLD_NUGGET,
        "&6三硝基丁烯弹",
        "&7让命中的实体着火",
        "&7x2.75伤害"
    );

    public static final SlimefunItemStack GUN_CASE = new SlimefunItemStack(
        "GUN_CASE",
        Material.CROSSBOW,
        "&7枪壳",
        "&7所有枪的基础"
    );

    public static final SlimefunItemStack PYRO_POWDER = new SlimefunItemStack(
        "PYRO_POWDER",
        Material.REDSTONE,
        "&4火热粉",
        "&7确实是一种极易爆炸的物质"
    );

    public static final SlimefunItemStack LIQUID_AIR = new SlimefunItemStack(
        "LIQUID_AIR",
        HeadTexture.TIN_CAN,
        "&f液态空气",
        "&7不要碰!"
    );

    public static final SlimefunItemStack LIQUID_NITROGEN = new SlimefunItemStack(
        "LIQUID_NITROGEN",
        HeadTexture.TIN_CAN,
        "&f液氮",
        "&7冰冻任何人?"
    );

    public static final SlimefunItemStack PURIFIED_LIQUID_NITROGEN = new SlimefunItemStack(
        "PURIFIED_LIQUID_NITROGEN",
        HeadTexture.TIN_CAN,
        "&f纯化液氮",
        "&7尽可能纯净"
    );
}
