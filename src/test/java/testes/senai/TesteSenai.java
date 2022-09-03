package testes.senai;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSenai {
	
	private WebDriver driver;
	@Before  
	public void abrirBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	@Test
	public void testBrowser(){
	driver.get("https://informatica.sp.senai.br/");
	driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("logica");
	driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.ENTER);
	}
	


}
