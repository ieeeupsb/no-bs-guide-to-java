import java.util.Random;

public class Powerball1 {
    public static void main(String[] args) {
        Random rnd = new Random();

        for (int i = 0; i < 6; i++) {
            System.out.print(rnd.nextInt(49) + 1 + " ");
        }
    }
}