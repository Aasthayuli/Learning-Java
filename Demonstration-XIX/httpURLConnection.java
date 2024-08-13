import java.net.*;

public class httpURLConnection {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://aasthayuli.netlify.app/");
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
            for (int i = 0; i <= 8; i++) {
                System.out.println(huc.getHeaderFieldKey(i) + " : " + huc.getHeaderField(i));
            }
            huc.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}