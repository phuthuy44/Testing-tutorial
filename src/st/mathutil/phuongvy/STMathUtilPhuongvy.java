/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st.mathutil.phuongvy;

/**
 *
 * @author acer
 */
public class STMathUtilPhuongvy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Test case 1: n=0->getFactorial(0)->Expected Result: 1;
        long expectedofTestcase1=1;
        long actual=MathUtile001.getFactorial(0);
        System.out.println("0! status: Expected = "+ expectedofTestcase1 +" | actual= "+actual);
        
        //Test case 2: n=1 -> getFactorial(1)->Expected Result : 1;
        long expectedofTestcase2=1;
        System.out.println("1! status : Expected = "+expectedofTestcase2+" | actual = "+ MathUtile001.getFactorial(1));
        
        //Test case 3: n=5->getFactorial(5)->Expected Result: 120;
        long expectedofTestcase3=120;
        System.out.println("5! status: expected = "+ expectedofTestcase3+" | actual ="+ MathUtile001.getFactorial(5));
        
        //Test case 4: n=-5->getFactorial(-5)->Expected Result: Exception
        System.out.println("-5! status: expected = EXCEPTION "+" | actual = " + MathUtile001.getFactorial(-5));
        
        //Test case 5: n=21->getFactorial(21)->Expected Result:Invalid n.
        System.out.println("21! status: expected = EXCEPTION"+" | actual = " + MathUtile001.getFactorial(21));
    }
    
}
