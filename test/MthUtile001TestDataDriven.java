/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import st.mathutil.phuongvy.MathUtile001;
import org.junit.runners.Parameterized;

/**
 *
 * @author acer
 */
@RunWith(value=Parameterized.class)//chuan bi tham so hoa
public class MthUtile001TestDataDriven {
    
    public MthUtile001TestDataDriven() {
    }
    //tach bo du lieu test ra mot cho rieng, sau do chi viec nhoi no vao trong cac loi goi ham can test
    //Ex: giong nhu tinh huong ban test man hinh login, chuc nang login
    //can chuan bi san cac cases:
    //case thanhcong: user dung, pass dung, role tuong ung
    //                    sv1        passsv1    sv
    //                    sv2        passsv2    sv  
    //                     gv1      passfv1     gv
    
    //=>feed/trich xuat/extract tung data dua vao loi goi ham
    //=>chay ham voi tung case/data xem xet 
    
    //chuan bi bo data:excel, txt, csv , table trong db, mang 2 chieu
    //Trong MathUtile001 nay su dung mng 2 chieu: vi can co (dauvao, dau ra) nhiu cap nhu the
    
    @Parameterized.Parameters //bo data
     public static Object[][] intiData(){//mảng 2 chiều này phải là static. 
         return new Integer[][]{{1,0},{1,1},{2,2},{6,3},{24,4},{120,5},{720,6}};
     }
     //mỗi dòng trong bộ dât ứng với 2 ý nghĩa
     //ví dụ cột0; là expected value, giá trị mà hàm phải return
     //ví dụ cột1; ;là input cho hàm getFactorial()
     //=>extract data sẽ thả vào biến -> biến đưa cho các hàm.
     
     //quy ước là public, non-static(vùng tham gia riêng được thả vào nên là non -static)
     @Parameterized.Parameter(value=0)//ứng với cột 1;
     public long expected; //luu gia tri kivong
     @Parameterized.Parameter(value=1)//ứng với cột 0
     public int n;//luu gia tri dua vao ham getFactorial() check;
     
     //TestTime
      @Test //tự loop qua các bộ dât trong hàm intiData()
      public void testParameterGivenRightArgumentReturnWell(){
          assertEquals(expected, MathUtile001.getFactorial(n));
      }
    
    
}  




