package configurationAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_TimeTrack_002 extends BaseClass {
	
	@Test
	public void createTimeTrack() {
		driver.findElement(By.id("container_tasks")).click();
	}
}
