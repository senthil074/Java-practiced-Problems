import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

class Main {
    public static boolean isUgly(int num) {
        if (num <= 0) {
            return false; // Non-positive numbers are not ugly
        }
        while (num % 2 == 0) {
            num /= 2; // Divide by 2 until no longer divisible
        }
        while (num % 3 == 0) {
            num /= 3; // Divide by 3 until no longer divisible
        }
        while (num % 5 == 0) {
            num /= 5; // Divide by 5 until no longer divisible
        }
        return num == 1; // If num becomes 1, it's an ugly number
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int lowerBound = sc.nextInt(); // Example: Change this to the desired lower bound
        int upperBound = sc.nextInt(); // Example: Change this to the desired upper bound
        List<Integer> uglyNumbers = new ArrayList<>();
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isUgly(num)) {
                uglyNumbers.add(num);
            }
        }
        System.out.println("Ugly numbers between " + lowerBound + " and " + upperBound + ":");
        for (int uglyNum : uglyNumbers) {
            System.out.print(uglyNum + " ");
        }
    }
}
