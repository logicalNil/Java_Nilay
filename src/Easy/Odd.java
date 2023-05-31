package Easy;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int sum = 0;
    int product = 1;

    for (int i = 0; i < n; i++) {
      sum += arr[i];
      product *= arr[i];
    }

    if (sum % 2 == 0) {
      System.out.println(sum);
    } else {
      System.out.println(product);
    }
  }
}
