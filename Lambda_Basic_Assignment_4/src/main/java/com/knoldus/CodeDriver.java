package com.knoldus;

import java.util.Scanner;

public class CodeDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNo = scanner.nextLine();
        String secondNo = scanner.nextLine();
        RangeMultiplication rangeMultiplication = new RangeMultiplication();
        System.out.println(rangeMultiplication.calcutateRange(firstNo,secondNo));

    }
}
