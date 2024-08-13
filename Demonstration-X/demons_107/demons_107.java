public class demons_107 {

    public static void main(String[] args) {
        try {
            int i = args.length;
            if (args[0].equals("java")) {
                System.out.println("First word is java.");
            }
            System.out.println("Number of arguments: " + i);
            int x = 12 / i; // #1
            int y[] = { 555, 999 }; // #2
            y[i] = x; // #3
        } catch (ArithmeticException e) { // to catch error at #1
            System.out.println("Division by Zero: " + e);
        } catch (NullPointerException e) { // to catch error at #2
            System.out.println("Null Pointer Exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) { // to catch error at #3
            System.out.println("Array Index Out of Bounds Exception: " + e);
        }
    }
}