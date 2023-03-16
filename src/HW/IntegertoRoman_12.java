package HW;

import java.util.Scanner;

public class IntegertoRoman_12 {
    int num;
    Scanner scanner = new Scanner(System.in);

    public IntegertoRoman_12() {
        System.out.print("Please enter a number: ");
        num = scanner.nextInt();
    }
    public String intToRoman() {
        String[] M = {"", "M", "MM", "MMM"};
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
    }

    public static void main(String[] args) {
        IntegertoRoman_12 integertoRoman_12 = new IntegertoRoman_12();
        String roman = integertoRoman_12.intToRoman();
        System.out.println("The roman number is " + roman);
    }
}
