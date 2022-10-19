/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st.mathutil.phuongvy;

/**
 *
 * @author acer
 */
public class MathUtile002 {
    private MathUtile002(){
        throw new UnsupportedOperationException("Can not call constructor directly! ");
    }
     public static int divide(int dividend, int divisor){
         if(divisor==0){
             throw new IllegalArgumentException("Cannot divide by zero(0).");
         }
         return dividend/divisor;
    }   
}  
