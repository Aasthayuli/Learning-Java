/*finally bock in try-catch block */

class demons_109 {
    public static void main(String[] args) {
        int i = 0;
        String greetings[] = { "Hello Twinkle! ", "Hello Java ", "Hello world " };
        while (i < 4) {
            try {
                System.out.println(greetings[i]);
                i++;
            } catch (Exception e) {
                System.out.println(e.toString()); // msg ofexception e in string format
            } finally {
                System.out.println("Hii !");
                if (i < 3)
                    ;
                else {
                    System.out.println("You should quit and reset index value!");
                    break;
                }
            }
        }
    }
}