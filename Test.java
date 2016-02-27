import java.net.MalformedURLException;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test {
  public static void main(String arg[]) {
    try {
      URL url = new URL("http://example.com");
      BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
      String line;

      while ((line = reader.readLine()) != null) {
          System.out.print(line);
      }
      reader.close();

    } catch (MalformedURLException e) {
      System.out.print(e);
    } catch (IOException e) {
      System.out.print(e);
    }
  }
}
