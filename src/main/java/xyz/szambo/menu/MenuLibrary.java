package xyz.szambo.menu;

import org.bukkit.plugin.java.JavaPlugin;

public class MenuLibrary {

    private static JavaPlugin plugin;

    public static JavaPlugin getPlugin() {
        return plugin;
    }

    public static void setPlugin(final JavaPlugin plugin) {
        MenuLibrary.plugin = plugin;
    }
}
