package Amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchingScreen {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	System.out.println("This is the code Arnik is pushing to the Master");
	System.out.println("Best of luck");

	//SNow changing the code after taking the pull
	
	System.out.println("This is the change after taking the pull from the master");
	System.out.println("Let's see what happen");
	
	//change after creating a new branch
	System.out.println("AFTER A NEW BRANCH CREATION");
	
	
}
}
