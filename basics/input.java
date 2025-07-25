package basics;
//this code is a simple Java program that takes user input and prints it to the console.
import java.util.*;
class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
        sc.close();
    }
}
