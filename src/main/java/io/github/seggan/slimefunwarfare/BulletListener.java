package io.github.seggan.slimefunwarfare;

import org.bukkit.Location;
import org.bukkit.entity.LlamaSpit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class BulletListener implements Listener {

    @EventHandler
    public void onEntityBulletHit(EntityDamageByEntityEvent e) {
        if (!(e.getDamager() instanceof LlamaSpit)) {
            return;
        }
        LlamaSpit bullet = (LlamaSpit) e.getDamager();
        if (bullet.hasMetadata("isGunBullet")) {
            Location shooterLoc = Util.deserializeLocation(bullet.getMetadata("locInfo").get(0).asString());
            String[] split = bullet.getMetadata("rangeInfo").get(0).asString().split(":");
            double distance = shooterLoc.distance(e.getEntity().getLocation());
            if (distance <= Integer.parseInt(split[0]) && distance >= Integer.parseInt(split[1])) {
                e.setDamage(bullet.getMetadata("damage").get(0).asInt());
                if (bullet.getMetadata("isFire").get(0).asBoolean()) {
                    e.getEntity().setFireTicks(e.getEntity().getFireTicks() + 60);
                }
            } else {
                e.setDamage(0);
                e.setCancelled(true);
            }
        }
    }
}
