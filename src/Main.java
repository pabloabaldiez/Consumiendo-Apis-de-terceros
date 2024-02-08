import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args)  {

try {
    URL url = new URL("https://api.openweathermap.org/geo/1.0/direct?q=AR-C&limit=5&appid=3e066c64c80a5884fb6c476928a43add");

    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");
    con.connect();

        }catch(Exception e){

            e.printStackTrace();
        }
    }

}