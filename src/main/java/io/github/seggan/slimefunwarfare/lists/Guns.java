package io.github.seggan.slimefunwarfare.lists;

import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;

public final class Guns {

    public static final SlimefunItemStack PISTOL = new SlimefunItemStack(
        "GUN_PISTOL",
        Material.CROSSBOW,
        "&7手枪",
        "&7短程枪",
        "&7装弹很快",
        "&7很适合近战",
        "&c范围: 7",
        "&c伤害: 2心",
        "&c冷却: 0.75s"
    );

    public static final SlimefunItemStack REVOLVER = new SlimefunItemStack(
        "GUN_REVOLVER",
        Material.CROSSBOW,
        "&7左轮手枪",
        "&7短程枪",
        "&7装弹很快",
        "&7很适合近战",
        "&c范围: 10",
        "&c伤害: 3心",
        "&c冷却: 0.5s"
    );

    public static final SlimefunItemStack MACHINE_GUN = new SlimefunItemStack(
        "GUN_MACHINE_GUN",
        Material.CROSSBOW,
        "&7机枪",
        "&7砰砰砰!",
        "&c范围: 30",
        "&c最小范围: 5",
        "&c伤害: 3心",
        "&c冷却: 0.15s"
    );

    public static final SlimefunItemStack MINIGUN = new SlimefunItemStack(
        "GUN_MINIGUN",
        Material.CROSSBOW,
        "&7迷你机枪",
        "&7与您的朋友相处的",
        "&7终极装备",
        "&c范围: 40",
        "&c最小范围: 5",
        "&c伤害: 4心",
        "&c冷却: 无"
    );

    public static final SlimefunItemStack RIFLE = new SlimefunItemStack(
        "GUN_RIFLE",
        Material.CROSSBOW,
        "&7步枪",
        "&7标准步枪",
        "&c范围: 40",
        "&c最小范围: 5",
        "&c伤害: 4心",
        "&c冷却: 0.75s"
    );

    public static final SlimefunItemStack SHOTGUN = new SlimefunItemStack(
        "GUN_SHOTGUN",
        Material.CROSSBOW,
        "&7霰弹枪",
        "&7攻击范围比步枪小",
        "&7但伤害高",
        "&c范围: 25",
        "&c最小范围: 5",
        "&c伤害: 6.5心",
        "&c冷却: 1.25s"
    );

    public static final SlimefunItemStack ASSAULT_RIFLE = new SlimefunItemStack(
        "GUN_ASSAULT_RIFLE",
        Material.CROSSBOW,
        "&7突击步枪",
        "&7突击步枪是步枪的衍生品,是标准的军事武器",
        "&c范围: 50",
        "&c最小范围: 3",
        "&c伤害: 6.5心",
        "&c冷却: 0.3s"
    );

    public static final SlimefunItemStack SNIPER = new SlimefunItemStack(
        "GUN_SNIPER",
        Material.CROSSBOW,
        "&7狙击枪",
        "&7终极远程枪 伤害较高",
        "&c范围: 130",
        "&c最小范围: 50",
        "&c伤害: 11心",
        "&c冷却: 8s"
    );
}
