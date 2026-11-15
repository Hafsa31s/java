class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  public static int allowance() {
    double money = 0.01;
    int days = 1;

    while (money < 5) {
        money = money * 2;
        days++;
    }

    return days;
}

import java.util.Scanner;
import java.util.Random;

public static void addTwoNumbers() {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    int num1 = rand.nextInt(10) + 1;
    int num2 = rand.nextInt(10) + 1;

    int answer = num1 + num2;
    int guess;

    do {
        System.out.println(num1 + " + " + num2 + " = ?");
        System.out.print("Enter your answer: ");
        guess = input.nextInt();

        if (guess != answer) {
            System.out.println("Wrong! Try again.");
        }

    } while (guess != answer);

    System.out.println("Correct! Good job!");
}

public static int GCF(int num1, int num2) {
    int gcf = 1;
    for (int i = 1; i <= num1 && i <= num2; i++) {
        if (num1 % i == 0 && num2 % i == 0) {
            gcf = i;
        }
    }
    return gcf;
}
public static void menu() {

    Scanner input = new Scanner(System.in);

    int choice;

    do {
        System.out.println("Welcome Looney Tune's System");
        System.out.println("Select from the following choices:");
        System.out.println("1 - Allowance");
        System.out.println("2 - Addition game");
        System.out.println("3 - Calculate GCF");
        System.out.println("4 - Exit");
        System.out.print("Enter choice: ");
        choice = input.nextInt();
        if (choice == 1) {
            System.out.println(allowance() + " days");
        }
        else if (choice == 2) {
            addTwoNumbers();
        }
        else if (choice == 3) {
            System.out.print("Enter first number: ");
            int a = input.nextInt();
            System.out.print("Enter second number: ");
            int b = input.nextInt();
            System.out.println("GCF = " + GCF(a, b));
        }
        else if (choice == 4) {
            System.out.println("Goodbye!");
        }
        else {
            System.out.println("Invalid choice!");
        }
    } while (choice != 4);
} 
    
  }


  
}