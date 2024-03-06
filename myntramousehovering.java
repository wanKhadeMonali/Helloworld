package basicActionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myntramousehovering {

	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("https://www.myntra.com/");
		
		
		WebElement bag =d.findElement(By.xpath("//span[@text='MEN']"));
				Actions a = new Actions(d);
				a.click(bag);
				a.perform();
				
				

	}

}
