/**
 * Created by michalbaran on 08/07/16.
 */

import org.jibble.pircbot.*;

public class MajkiBot extends PircBot {

    public MajkiBot() {

        this.setName("MajkiBot");
        this.setLogin("MajkiBot");
    }


@Override
    public void onMessage(String channel, String sender, String login, String hostname, String message) {

        if(message.equalsIgnoreCase("!time")) {

            String time = new java.util.Date().toString();

            sendMessage(channel, sender + ": Jest teraz " + time);
        }

    }


}
