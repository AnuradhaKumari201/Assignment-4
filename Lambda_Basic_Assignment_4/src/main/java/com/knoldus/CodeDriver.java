package com.knoldus;

import java.util.Scanner;

public class CodeDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNo = scanner.nextInt();
        int secondNo = scanner.nextInt();
        System.out.println(RangeMultiplication.multiply.applyAsLong(firstNo,secondNo));

    }
}
