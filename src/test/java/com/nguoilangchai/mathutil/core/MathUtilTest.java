package com.nguoilangchai.mathutil.core;

import static com.nguoilangchai.mathutil.core.MathUtil.getFactorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MathUtilTest {

//    @Test
//    public void testFactorialGivenRightArgReturnsWell() {
//        assertEquals(120, getFactorial(5));
//    }

    // bắt ngoại lệ cà chớn
//    @Test
//    public void testFactorialGivenWrongArgThrowsException() {
//        //xài biểu thức lamba
//        //hàm nhận tham số thứ 2 là 1 cái object/có code implement cái
//        //functional interface tên là Executable
//        Executable exObject = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-1);
//            }
//        };
//        
//        assertThrows(IllegalArgumentException.class, exObject);
//    }
    
    //dùng lamba
//    @Test
//    public void testFactorialGivenWrongArgThrowsException_Lamba() {
//  
//        assertThrows(IllegalArgumentException.class, ()->{
//            getFactorial(-5);
//        });
//    }
    
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
