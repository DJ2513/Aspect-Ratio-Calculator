package calculator;

import java.util.Scanner;

public class Main {
    public static float width, height;
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner t = new Scanner(System.in);
        System.out.println("Give me the width: ");
        width = t.nextFloat();
        System.out.println("Give me the height: ");
        height = t.nextFloat();
        calculator.getMcd(width, height);
        System.out.println(calculator.simplify(width, height));
    }

}