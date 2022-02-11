package x14_Methods.lab;

import java.util.Scanner;

public class x07_RepeatString2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int repetition = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(s, repetition));
    }

    private static StringBuilder repeatString(String s, int count) {
        StringBuilder output = new StringBuilder();
        output.append(String.valueOf(s).repeat(count));
        return output;
    }
}
