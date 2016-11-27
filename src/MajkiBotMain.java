/**
 * Created by michalbaran on 08/07/16.
 */

import org.jibble.pircbot.*;

import java.io.IOException;

public class MajkiBotMain {

    public static void main(String[] args){

        final String TWITCH = "irc.chat.twitch.tv";
        final String PASS = "oauth:wy21kkbi7auqcu1wtyagdxgdy7trej";
        final int TWITCHPORT = 6667;

        MajkiBot majkiBot = new MajkiBot();


        majkiBot.setVerbose(true);

        try {
            majkiBot.connect(TWITCH, TWITCHPORT, PASS);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IrcException e) {
            e.printStackTrace();
        }

        majkiBot.joinChannel("#majtkel");

    }


}
