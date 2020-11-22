package real.jdabot;

import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class Listener extends ListenerAdapter {
    @Override
    public void onReady(@Nonnull ReadyEvent event){
        System.out.println("Bot is online!");
    }
}
