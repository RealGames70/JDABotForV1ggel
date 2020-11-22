package real.jdabot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {
    private Main() throws LoginException {
        new JDABuilder()
            .setToken("NzY0MTYwODAyMTE4NDM0ODY3.X4CONA.8P54Tu9RjC-8mRjlM4UKXq7HqWI")
                .addEventListeners(new Listener())
                .setActivity(Activity.listening("!help"))
                .build();
    }

    public static void main(String[] args) throws LoginException{
        new Main();
    }
}
