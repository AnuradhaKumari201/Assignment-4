package com.knoldus;

import java.nio.channels.ScatteringByteChannel;
import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

public class RangeMultiplication {


    public Integer calcutateRange(String firstNo, String secondNo)  {


        LongBinaryOperator multiply = (i, j) -> LongStream.rangeClosed(i, j)
                .reduce((num1, num2) -> num1 * num2)
                .orElse(1L);

        try {
            int result = (int) multiply.applyAsLong(Integer.parseInt(firstNo), Integer.parseInt(secondNo));
            return result;

        } catch (Exception e) {
            System.out.println(" Only Integer Number is Valid  " + e);
            throw new NumberFormatException();
        }
    }


}
