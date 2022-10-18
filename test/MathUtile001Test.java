/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import st.mathutil.phuongvy.MathUtile001;

/**
 *
 * @author acer
 */
public class MathUtile001Test {
    
    public MathUtile001Test() {
       
    }
    @Test //retun Green/Red <-> Pass/Faild
    public void testFactorialGivenRightArgumentReturnWell(){
        //Test case 1: n=0->getFactorial(0)->Expected Result: 1;
        long expectec=1;
        long actual=MathUtile001.getFactorial(0);
        Assert.assertEquals(expectec, actual);
        
        //Test case 2: n=1 -> getFactorial(1)->Expected Result : 1;
        long expectedofTestcase2=1;
        long actualofTestcase2 =MathUtile001.getFactorial(1);
        Assert.assertEquals(expectedofTestcase2, actualofTestcase2);
        
        //Testcase 3: n=5->getFactorial(5)->Expected Result: 120;
        assertEquals(120,MathUtile001.getFactorial(5));
       
        
        
    }
    //tinh huuong ngoai le. Voi Junit 4 thi ngoai le khong phai la mot value de so sanh. chi xem no co xuat hien hay khong? 
    @Test(expected=IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtile001.getFactorial(-5);//not assert, goi ham mong doi
        MathUtile001.getFactorial(21);
        //dung ngoai le Illegal..xuat hien trong tinh huong -5 
        //=>function->TRUE->GREEN->TEST PASSED
        
    }
   
    
    
}
