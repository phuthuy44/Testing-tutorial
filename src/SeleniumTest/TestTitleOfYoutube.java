/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SeleniumTest;

/**
 *
 * @author acer
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestTitleOfYoutube {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver","E://Phuong Vy//ST.MathUtil.phuongvy//chromedriver.exe");
        //"webdriver.chrome.driver","C://Program Files (x86)//Google//Chrome//Application//chrome.exe"
        WebDriver driver;
        driver = new ChromeDriver();
        String url = "https://www.youtube.com/";
        driver.get(url);
        
        String expectedTitle="YouTube";
        String actualTitle= driver.getTitle();  
        
        if(expectedTitle.contentEquals(actualTitle)){
            System.out.println("Test Passed!");
        }else{
            System.out.println("Test Failed!");
        }
        driver.close();
        
        
    }
    
}
