package com.boyboy0710.Telekinesis;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public void onEnable() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("            Telekinesis 를러그인을 성공적으로 불러왔습니다");
        System.out.println("               플러그인 제작자ㅣ:booyboy0710");
        System.out.println("----------------------------------------------------------------------");
    }

    @Override
    public void onDisable() {
        System.out.println("Telekinesis 플러그인이 비활성화 되었습니다");
    }
    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        ItemStack item = p.getItemInHand();
        if (e.getAction() == Action.LEFT_CLICK_AIR
                || e.getAction() == Action.LEFT_CLICK_BLOCK) {
            p.getEyeLocation().getBlock().setType(Material.AIR);
        }
    }
}
