package com.company;
import java.io.*;

public class PrintDouble {
    public static void main(String[] args){
        //只使用print_digit输出任意 double
        output(65535.234);
    }

    public static void output(double num) {
        if (num < 0) System.out.print("-");
        num = Math.abs(num);
        printA(num);
        printB(num);
    }

    public static void printA(double num){
        long a = (long)num;
        if (a < 1) System.out.print("0");
        else printDigit(a);

    }

    public static void printB(double num){

    }

    public static void printDigit(){

    }
}
