package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RangeMultiplicationTest {

    @Test
    public void multiplyInRangeTest(){
        RangeMultiplication rangeMultiplication =new RangeMultiplication();
        Assertions.assertEquals(0,rangeMultiplication.calcutateRange("0", "1"));
    }
    @Test
    public void multiplyInRageForEqualValues(){
        RangeMultiplication rangeMultiplication =new RangeMultiplication();
        Assertions.assertEquals(20,rangeMultiplication.calcutateRange("20", "20"));
    }

    @Test
    public void multiplyInRageTestForStringValue(){
        RangeMultiplication rangeMultiplication =new RangeMultiplication();
        Assertions.assertThrows(NumberFormatException.class, () -> rangeMultiplication.calcutateRange("1","Four"));
    }


}