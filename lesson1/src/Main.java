public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even number: " + i);
        }

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers 1-10: " + sum);
    }
}
