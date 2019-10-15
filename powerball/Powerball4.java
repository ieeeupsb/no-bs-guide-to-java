import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Powerball4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> generated = new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        for (int i = 0; i < n; i++) {
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