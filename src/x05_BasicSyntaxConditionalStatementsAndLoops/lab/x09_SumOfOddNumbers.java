package x05_BasicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class x09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int oddNumberFound = 0;
        int number = 1;
        int sum = 0;

        while (oddNumberFound < n) {
            if (number % 2 != 0) {
                System.out.println(number);
                oddNumberFound++;
                sum += number;
            }
            number++;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}


