package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1: FizzBuzz");
        System.out.println(fizzBuzz());

        System.out.println("Task 2: Line Reversal 'make install'");
        System.out.println(reverseString("make install"));

        System.out.println("Task 3: Solving the quadratic equation");
        System.out.println(solveQuadratic(1, -1, -2));

        System.out.println("Task 4: The sum of the series");
        System.out.println(calculateSeriesSum());

        System.out.println("Task 5: Checking for a palindrome");
        System.out.println(isPalindrome("А роза упала на лапу Азора"));
    }

    public static String fizzBuzz() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                result.append("fizzbuzz\n");
            } else if (i % 5 == 0) {
                result.append("fizz\n");
            } else if (i % 7 == 0) {
                result.append("buzz\n");
            } else {
                result.append(i).append("\n");
            }
        }
        return result.toString();
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static String solveQuadratic(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return "нет вещественных корней";
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            return "x = " + x;
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "x1 = " + x1 + ", x2 = " + x2;
        }
    }

    public static double calculateSeriesSum() {
        double sum = 0;
        double term;
        int n = 2;
        do {
            term = 1.0 / (n * n + n - 2);
            sum += term;
            n++;
        } while (term >= 1e-6);
        return sum;
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());
    }
}