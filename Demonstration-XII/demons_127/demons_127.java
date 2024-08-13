/*copying a file into another file using CharacterStream class */

import java.io.*;

/**
 * demons_127
 */
public class demons_127 {

    public static void main(String[] args) {
        File infile = new File("demons_127.txt");// source file(Object created to connect the file to the program)
        File outfile = new File("demons_127_copy.txt");// destination file(Object created to connect the file to the
                                                       // program)

        FileReader ins = null;// creates file stream ins
        FileWriter outs = null;// create file stream outs
        try {
            ins = new FileReader(infile);// opens infile(Object created to read the file)
            outs = new FileWriter(outfile);// opens outfile(Object created to write into the file)

            int ch;
            while ((ch = ins.read()) != -1) {
                outs.write(ch);
            }

            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        } finally {
            try {
                ins.close();
                outs.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}