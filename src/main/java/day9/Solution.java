package day9;

public class Solution {

    //Write a factorial function that takes a positive integer, N as a parameter and prints the result of N! (N factorial).

    static int factorial(int n) {
        return (n > 1) ? n * factorial(n - 1) : n;
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
    }
}
