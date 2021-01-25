package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlDownloader {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://telex.hu");
            InputStream content = url.openStream();
            Covid3 covid3 = new Covid3();
            int n = covid3.wordCounter(new BufferedReader(new InputStreamReader(content)), "koronavírus");
            System.out.println(n);
        } catch (MalformedURLException e) {
            System.out.println("Wrong URL");
        } catch (IOException ioe) {
            System.out.println("Can not open the URL");
        }
    }
}
