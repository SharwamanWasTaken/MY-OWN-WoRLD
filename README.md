# 🌍 MY-OWN-WORLD
### *"Shawarma owns every food 😋"*

![GitHub Repo Banner](https://media.giphy.com/media/3o7aD2saalBwwftBIY/giphy.gif)

---

## 🎮 About Me
Hi! I’m **SharwamanWasTaken**, a professional Minecraft developer focused on **PvP systems**, **custom gameplay features**, and **server optimization**.

- 🧠 Languages & Tools: **Java (Spigot/Paper API), Skript, Git**
- ⚔️ Focus: Custom PvP mechanics, kits, event systems
- 🛠️ Skills: Plugin development, performance optimization, debugging
- 📫 Open to collaborations with **Minecraft servers**

---

## 🏗️ Projects

### 🔹 Heal Command Plugin (Java)
A simple plugin to add `/heal` command functionality for players.

```java
package me.sharwaman.pvp;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Heal Command Plugin Enabled!");
        getCommand("heal").setExecutor((sender, cmd, label, args) -> {
            if (sender instanceof org.bukkit.entity.Player player) {
                player.setHealth(20);
                player.sendMessage("§aYou have been healed!");
            }
            return true;
        });
    }
}

