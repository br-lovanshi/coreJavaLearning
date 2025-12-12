package basic;

import java.sql.SQLOutput;

public class Recursion {
    public static void main(String[] args) {
        int n = 7;
        int output = fibbonacci(n);
        System.out.println(output);
    }
    static int fibbonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibbonacci(n - 1) + fibbonacci(n - 2);
    }
}
