public class Fibonacci {
    public static void main(String[] args) {
        int count = 8, no1 = 0, no2 = 1;

        for (int i = 0; i < count; i++) {
            System.out.print(no1 + " ");
            int sum = no1 + no2;

            no1 = no2;
            no2 = sum;
        }
    }
}