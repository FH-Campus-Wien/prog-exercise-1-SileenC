package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char a = 'Z';
        long b = 0xface;
        int c = 012;
        long d = 80;
        float e = 44e-1f;
        float t = 5.5f;
        double g = 8.88e1;
        double h = 99.9;

        int aint = (int)a;
        int bint = (int)b;
        int dint = (int)d;
        int eint = (int)e;
        int tint = (int)t;
        int gint = (int)g;
        int hint = (int)h;

        int summe = aint + bint + c + dint + eint + tint + gint + hint;
        System.out.println(summe);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        int num1;
        int num2;
        System.out.println("Before Swap:");
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");

        num1 = sc.nextInt();
        System.out.print("y: ");

        num2 = sc.nextInt();

        num1 = num1 * num2;

        num2 = num1 / num2;
        num1 = num1 / num2;

        System.out.println("After Swap:");
        System.out.println("x: " + num1);
        System.out.println("y: " + num2);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        int n1;
        int n2;

        Scanner sc = new Scanner(System.in);
        System.out.print("n1: ");
        n1 = sc.nextInt();

        System.out.print("n2: ");
        n2 = sc.nextInt();

        if(n1 > n2){
            System.out.println("n1 > n2");
        }
        else if(n1 < n2) {
            System.out.println("n2 > n1");
        }
        else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        int ar;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        ar = sc.nextInt();

        if (0 <= ar && ar < 20000){
            System.out.println("Poor Sales Revenue");
        }
        else if (20000 <= ar && ar < 50000) {
            System.out.println("Average Sales Revenue");
        }
        else if (50000 <= ar && ar < 80000){
            System.out.println("Good Sales Revenue");
        }
        else if (80000 <= ar && ar < 100000){
            System.out.println("Excellent Sales Revenue");
        }
        else {
            System.out.println("Invalid Revenue");
        }

    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");

        }

    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Year: ");
        year = sc.nextInt();

        if (year%4 == 0 && year%400 == 0){
            System.out.println("Leapyear");
        }
        else {
            System.out.println("Not a Leapyear");
            return;
        }

        if (year%100 == 0 && year%400 != 0){
            System.out.println("Not a Leapyear");
        }

    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Number: ");

        int num = scanner.nextInt();
        int reversednum =0;

        String numString = String.valueOf(num);
        if (numString.length() > 3){
            System.out.println("Geben Sie eine Gültige Zahl ein!");
        }
        else{
            while (num != 0){
                reversednum = reversednum * 10 + num % 10;

                num = num / 10;
            }
        }

        System.out.println("Number: " + reversednum);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}