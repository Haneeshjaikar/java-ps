package Week1;

import java.util.Scanner;  

public class sum {
    public static void main(String args[]){
        int x,y,sum;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter First Number: ");
            x = scanner.nextInt();
            System.out.println("Enter Second Number: ");
            y = scanner.nextInt();
        }
        sum = x+y;
        System.out.println("The Sum is: " + sum);
    }
}
