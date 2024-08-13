/*Run the following program without exception handling mechanism */

//case: try with multiple catch blocks

public class demons_106 {

    public static void main(String[] args) {
        int i = args.length;
        if (args[0].equals("java")) {
            System.out.println("First word is java.");
        }
        System.out.println("Number of arguments: " + i);
        int x = 12 / i;
        int y[] = { 555, 999 };
        y[i] = x;
    }
}

/*
 * NOTE:
 * Run with following inputs:
 * (blank line)
 * java
 * i love java
 * 10 20 30 40
 */