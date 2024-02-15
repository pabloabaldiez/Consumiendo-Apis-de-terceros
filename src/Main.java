import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

try {
    URL url = new URL("https://api.openweathermap.org/geo/1.0/direct?q=AR-C&limit=5&appid=3e066c64c80a5884fb6c476928a43add");
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");
    con.connect();

    int responseCode= con.getResponseCode();

    if(responseCode != 200){
        throw new RuntimeException("Ocurrio un error de tipo: " + responseCode);
    } else {

        StringBuilder informationString = new StringBuilder();
        Scanner scanner= new Scanner(url.openStream());

        while (scanner.hasNext()){
            informationString.append(scanner.nextLine());
        }
        scanner.close();
        System.out.println(informationString);
    }

}catch(Exception e){

            e.printStackTrace();
    }
    }
}