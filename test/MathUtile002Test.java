/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
import st.mathutil.phuongvy.MathUtile002;

/**
 *
 * @author acer
 */
import st.mathutil.phuongvy.MathUtile002;
public class MathUtile002Test {
    
    public MathUtile002Test() {
    }
    @Test(expected=IllegalArgumentException.class)
    public void testDividedWrongArgumentThrowException(){
        MathUtile002.divide(1, 0);
    }
}
