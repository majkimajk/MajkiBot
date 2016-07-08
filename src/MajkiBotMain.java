/**
 * Created by michalbaran on 08/07/16.
 */

import org.jibble.pircbot.*;

import java.io.IOException;

public class MajkiBotMain {

    public static void main(String[] args){

        MajkiBot majkiBot = new MajkiBot();

        majkiBot.setVerbose(true);

        try {
            majkiBot.connect("irc.freenode.net");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IrcException e) {
            e.printStackTrace();
        }

        majkiBot.joinChannel("#pircbot");

    }


}
