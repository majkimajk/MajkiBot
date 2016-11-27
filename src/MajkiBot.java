/**
 * Created by michalbaran on 08/07/16.
 */

import org.jibble.pircbot.*;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MajkiBot extends PircBot {

    public MajkiBot() {

        this.setName("MajkiBot");
        this.setLogin("MajkiBot");
    }

    public void sendPSA(){
        sendMessage("#majtkel", "Polecamy się!");
    }


    @Override
    public void onMessage(String channel, String sender, String login, String hostname, String message) {

        if(message.equalsIgnoreCase("!time")) {

            String time = new java.util.Date().toString();

            sendMessage(channel, sender + ": Jest teraz " + time);
        }

        if(message.equalsIgnoreCase("!hello")) {

          String time = new java.util.Date().toString();

          sendMessage(channel, "Cześć " + sender);
       }


    }



    @Override
    public void onConnect(){


        sendMessage("#majtkel", "Siemaneczko");
        

        //uses method sendPSA every minute
        final ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        exec.scheduleAtFixedRate(() -> sendPSA(), 0, 1, TimeUnit.MINUTES);


    }

}
