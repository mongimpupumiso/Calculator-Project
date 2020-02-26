public class Calculator {
    public static int add(int num1, int num2) {

        return num1 + num2;

    }

    public static int add(int... num) {

        int sum = 0;

        for (int m = 0; m < num.length; m++) {
            sum += num[m];
        }

        return sum;

    }

    public static int multiply(int num1, int num2) {

        return num1 * num2;

    }

    public static int multiply(int... num) {

        int product = 1;



        for (int m = 0; m < num.length; m++) {
            product *= num[m];

        }

        return product;

    }
}