package winlyps.noBreakingProjectiles

import org.bukkit.plugin.java.JavaPlugin

class NoBreakingProjectiles : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("projectilesCanBreakBlocks", "false")
        }
        logger.info("NoBreakingProjectiles plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("NoBreakingProjectiles plugin has been disabled.")
    }
}