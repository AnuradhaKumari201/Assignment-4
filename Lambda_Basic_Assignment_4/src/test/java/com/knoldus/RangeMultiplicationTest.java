package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RangeMultiplicationTest {
    @Test
    public void multiplyInRangeTest(){
        Assertions.assertEquals(0,RangeMultiplication.multiply.applyAsLong(0, 1));
    }
    @Test
    public void multiplyInRageForEqualValues(){
        Assertions.assertEquals(20,RangeMultiplication.multiply.applyAsLong(20, 20));
    }

    @Test
    public void multiplyInRageForUnequalValues(){
        Long expectedValue = 54486432000L;
        Assertions.assertEquals(expectedValue,RangeMultiplication.multiply.applyAsLong(5, 15));
    }


}