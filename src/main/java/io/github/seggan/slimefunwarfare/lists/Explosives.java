package io.github.seggan.slimefunwarfare.lists;

import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

public final class Explosives {

    private Explosives() {}

    public static final SlimefunItemStack NITROGEN_TRIIODIDE = new SlimefunItemStack(
        "NITROGEN_TRIIODIDE",
        Material.PURPLE_DYE,
        "&5三碘化氮",
        "&7手榴弹的材料"
    );

    public static final SlimefunItemStack AZIDOAZIDE_AZIDE = new SlimefunItemStack(
        "AZIDOAZIDE_AZIDE",
        Material.SUGAR,
        "&e叠氮叠氮化物",
        "&7手榴弹的材料"
    );

    public static final SlimefunItemStack ARSENIC = new SlimefunItemStack(
        "ARSENIC",
        Material.GUNPOWDER,
        "&7砷",
        "&7手榴弹的材料"
    );

    public static final SlimefunItemStack EMPTY_GRENADE = new SlimefunItemStack(
        "GRENADE",
        Material.SNOWBALL,
        "&7化学手榴弹",
        "&7内容: 无"
    );

    public static final SlimefunItemStack REINFORCED_CONCRETE = new SlimefunItemStack(
        "REINFORCED_CONCRETE",
        Material.GRAY_CONCRETE,
        "&7钢筋混凝土",
        "&7防爆（非防tnt?）混凝土"
    );
}
