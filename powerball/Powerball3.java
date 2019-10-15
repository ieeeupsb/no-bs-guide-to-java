import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Powerball3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> generated = new ArrayList<Integer>();

        for (int i = 0; i < 6; i++) {
            int gen = rnd.nextInt(49) + 1;

            if (!generated.contains(gen)) {
                generated.add(gen);
            }
        }

        Collections.sort(generated);

        for (int gen : generated) {
            System.out.println(gen);
        }
    }
}