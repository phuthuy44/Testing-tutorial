/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st.mathutil.phuongvy;

/**
 *
 * @author acer
 */
public class MathUtile001 {
    //ham tinh giai thua n!=1.2.3.4...n;
    //tinh ntu 0..20
    public static long getFactorial(int n){
        if(n<0||n>20){//n phai nam trong khoang(0,20)
            throw new IllegalArgumentException("Invalid n. N must be between 0...20");
            
        }if(n==0||n==1){
            return 1;
        }
        long product=1;
        for(int i=2;i<=n;i++){
            product*=i;
        }
        return product;
    }
}
//Các testcase- các tình huống xảy ra khi sử dụng hàm getFactorial()
//Testcase1: n=0; getFactorial(0)->Expected Result: 1;
//Testcase2: n=1; getFactorial(1)->Expected Result : 1;
//Testcase3: n=5; getFactorial(5)->Expected Result: 120;
//Testcase4: n=-5;getFactorial(-5)->Expected Result: Invalid n
//Testcase5: n=21; getFactorial(21)->Expected Result:Invalid n.

