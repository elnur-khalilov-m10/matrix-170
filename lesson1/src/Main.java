import java.util.ArrayList;

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

        int number1 = 48;
        int number2 = 18;
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        System.out.println("NOD: " + number1);

        int nums[] = {1, 4, 12, 19 ,10};
        for(int num : nums) {
            System.out.println(num);
        }


    }
}
