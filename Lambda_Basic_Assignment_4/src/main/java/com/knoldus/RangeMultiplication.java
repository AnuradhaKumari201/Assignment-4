package com.knoldus;

import java.util.function.LongBinaryOperator;

public class RangeMultiplication {
    static LongBinaryOperator multiply = (firstNum, secondNum) -> {
        long res = 1;

        while (firstNum <= secondNum)
            res *= secondNum--;
        return res;

    };

}
