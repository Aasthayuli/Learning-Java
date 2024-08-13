import java.io.*;
import java.net.*;

public class URLConnection {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://aasthayuli.netlify.app/");
            java.net.URLConnection urlCon = url.openConnection();
            try {
                java.io.InputStream inputStream = urlCon.getInputStream();
                int i = 0;
                while ((i = inputStream.read()) != -1) {
                    System.out.print((char) i);
                }
            } catch (IOException e) {
                System.out.println("Error reading from input stream: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error opening URL connection: " + e.getMessage());
        }

    }
}

/*
 * The outer try-catch block is used to catch any IOException that may occur
 * when creating a new URL object or opening a connection to the URL.
 * This could happen if the URL is malformed or if there is a network error.
 * 
 * The inner try-catch block is used to catch any IOException that may occur
 * when reading from the input stream.
 * This could happen if there is an error reading from the stream or if the
 * stream is closed prematurely.
 * 
 * In this specific case, the inner try-catch block is catching an IOException
 * because the URL "https://aasthayuli.netlify.app/" is returning a 404 error,
 * which means the page is not found.
 * This is causing an IOException to be thrown when trying to read from the
 * input stream.
 */