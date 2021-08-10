package fi.mariapori.first;
import org.bukkit.plugin.java.JavaPlugin;

public class first extends JavaPlugin {
    @Override
    public void onEnable() {
    	this.getCommand("dimang").setExecutor(new Dimang());
    	this.getCommand("buyop").setExecutor(new BuyOP());
    	getServer().getPluginManager().registerEvents(new MyListener(), this);
    }
    @Override
    public void onDisable() {

    }
    
}
