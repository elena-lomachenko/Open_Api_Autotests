package Tests;

import Other.OptionsTests;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class FirstTest extends OptionsTests {

  public static void main(String[] args) {
    System.out.println("hello world");
    System.err.println("Btoom!");
  }
    @Test
    public void myFirstTest() {
      
      driver.navigate().to("http://www.google.com");
      driver.findElement(By.name("q")).sendKeys("webdriver");
      driver.findElement(By.id("tsf")).click();
      driver.findElement(By.name("btnK")).click();
      wait.until(titleIs("webdriver - Поиск в Google"));
    }

  }


