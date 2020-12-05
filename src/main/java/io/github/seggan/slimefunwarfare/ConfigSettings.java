package io.github.seggan.slimefunwarfare;

import lombok.Getter;
import org.bukkit.configuration.file.FileConfiguration;

public class ConfigSettings {

    private final SlimefunWarfare plugin;

    @Getter
    private int concreteExplodePercent = 10;
    @Getter
    private boolean autoshoot = true;

    ConfigSettings(SlimefunWarfare plugin) {
        this.plugin = plugin;
    }

    public void loadConfig() {
        FileConfiguration config = plugin.getConfig();

        concreteExplodePercent = config.getInt("explosions.concrete-explode-chance");
        autoshoot = config.getBoolean("options.autoshoot");
    }
}
