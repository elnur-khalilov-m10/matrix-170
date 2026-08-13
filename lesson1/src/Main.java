public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        i = 0;
        while (i <= 10) {
            System.out.println("Even numbers: " + i);
            i += 2;
        }

        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            sum += j;
        }
        System.out.println("Sum of numbers 1-10: " + sum);
    }
}
