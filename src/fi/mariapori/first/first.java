package fi.mariapori.first;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class first extends JavaPlugin {
    @Override
    public void onEnable() {
    	this.getCommand("dimang").setExecutor(new Dimang());
    }
    @Override
    public void onDisable() {

    }
    
}
