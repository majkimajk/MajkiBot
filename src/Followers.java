import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by michalbaran on 15/08/16.
 */
public class Followers {

    private String data;
    private URL input;


    public Followers() {

        try {
            URL input = new URL("https://api.twitch.tv/kraken/channels/lirik/follows");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        

    }

}
