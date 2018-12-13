package edu.wctc.advjava.comparebigo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a number under 100: ");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        long wholeNumber = Long.parseLong(input);
        System.out.println("Enter a number between 2 and 10: ");
        String constantInput = keyboard.nextLine();
        int constantInt = Integer.parseInt(constantInput);

        System.out.printf("%10s     %10s     %10s     %10s     %10s     %10s     %10s     %10s     %10s\n",
                "O(1)", "O(log log n)","O(log n)","O(n)","O(n2)","O(nc)", "O(2n)","O(cn)", "O(n!)");
        System.out.printf("%10s     %10s     %10s     %10s     %10s     %10s     %10s     %10s     %10s\n",
                "----------","----------","----------","----------","----------", "----------","----------", "----------", "----------");
        for (int i=0; i<wholeNumber; i++) {

            System.out.printf("%10d     %10f     %10f     %10d     %10d     %10.0f     %10.0f     %10.0f     %10d\n",
                    1,Math.log(Math.log(i)),Math.log(i),i,(i*i),Math.pow(i, constantInt),Math.pow(2, i),Math.pow(constantInt, i),factorial(i));
        }
    }

    private static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }
}
