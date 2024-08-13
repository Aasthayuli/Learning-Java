
import mypackage.*;

class demons_810 {

    public static void main(String[] args) {
        Balance current[] = new Balance[3];
        // for (int i = 0; i < 3; i++) {
        // current[i] = new Balance("C" i , 1000 + i);
        // }
        // try this too

        current[0] = new Balance("D.samantha", 123.23);
        current[1] = new Balance("Aasthayuli", 1234.23);
        current[2] = new Balance("Animesh", -123.223);

        for (int i = 0; i < 3; i++) {
            current[i].show();
        }
    }
}