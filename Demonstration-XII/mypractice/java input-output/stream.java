/*OutputStream: Java application uses an output stream to write data to a destination; it may be a file, an array, peripheral device or socket.
 * OutputStream class is an abstract class. 
 * It is the superclass of all classes representing an output stream of bytes. 
 * An output stream accepts output bytes and sends them to some sink.
 * 
 * InputStream: Java application uses an input stream to read data from a source; it may be a file, an array, peripheral device or socket.
 * InputStream class is an abstract class. 
 * It is the superclass of all classes representing an input stream of bytes.
 */

public class stream {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.err.println("Error message");
    }
}

/*
 * by default, both System.out and System.err print to the same console or
 * terminal, making it appear as though they are identical.
 * This is because, in most environments, the standard output and standard error
 * streams are both directed to the same destination, which is usually the
 * console or terminal.
 * However, you can redirect these streams to different destinations, such as
 * files, to see the difference.
 */
/*
 * Run the file:
 * javac stream.java
 * java stream > output.log 2> error.log
 */
/*
 * The additional output you're seeing in error.log is a PowerShell error
 * message, which is not related to your Java program. This message is generated
 * by PowerShell when it encounters an error while executing a command.
 * 
 * In this case, the error message is indicating that PowerShell encountered an
 * error while running the java command.
 */