package Breville.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_function {
	   public static void main(String[] args) {

	        //Properties..
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vignesh\\IdeaProjects\\Testing_01\\driver\\chromedriver");
	        WebDriver d = new ChromeDriver();
	        d.manage().window().maximize();
	        d.get("https://www.vanillanimoy.com/");
	    }

}
