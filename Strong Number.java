import java.util.Scanner;



public class H {

  // Method to calculate factorial of a digit

  public static int factorial(int n) {

    int fact = 1;

    for (int i = 2; i <= n; i++) {

      fact *= i;

    }

    return fact;

  }

  // Method to check if a number is a strong number

  public static boolean isStrong(int num) {

    int originalNum = num;

    int sum = 0;

    while (num > 0) {

      int digit = num % 10;

      sum += factorial(digit);

      num /= 10;

    }

    return sum == originalNum;

  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number to check if it is a strong number: ");

    int number = scanner.nextInt();

    if (isStrong(number)) {

      System.out.println(number + " is a strong number.");

    } else {

      System.out.println(number + " is not a strong number.");

    }

    scanner.close();

  }

}

