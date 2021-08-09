package fi.mariapori.first;
import org.bukkit.plugin.java.JavaPlugin;

public class first extends JavaPlugin {
    @Override
    public void onEnable() {
    	this.getCommand("dimang").setExecutor(new Dimang());
    	this.getCommand("tele").setExecutor(new Teleport());
    	this.getCommand("buyop").setExecutor(new BuyOP());
    }
    @Override
    public void onDisable() {

    }
    
}
