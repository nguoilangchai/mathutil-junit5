
package com.nguoilangchai.mathutil.core;

import static com.nguoilangchai.mathutil.core.MathUtil.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


public class MathUtilDDTTest {
    
    public static Object[][] initData(){
        return new Integer[][]{
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120}
        };
    }
    
    @ParameterizedTest
    @MethodSource(value = "initData")
    public void testFactorialGivenRightArgReturnsWell(int input, long expected) {
        assertEquals(expected, getFactorial(input));
    }
    
}
