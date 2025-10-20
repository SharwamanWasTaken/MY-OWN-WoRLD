package me.yourname.pvpplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("PvP Plugin Enabled!");
        getCommand("heal").setExecutor((sender, cmd, label, args) -> {
            if (sender instanceof org.bukkit.entity.Player player) {
                player.setHealth(20);
                player.sendMessage("§aYou have been healed!");
            }
            return true;
        });
    }
}
