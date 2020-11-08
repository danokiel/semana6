package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

WebDriver driver;


public class Steps{
@Given("Abrir Chrome")
public void abrir_Chrome() {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("En este paso abre el navegador Chrome");
   System.setProperty("webdriver.chrome.driver","C:\\Users\\casa_\\Downloads\\chromedriver.exe");
   ChromeDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://ced.iplacex.cl/login/index.php");
   
   
}

@When("Ingresa Username {string} y Password {string}")
public void ingresa_Username_y_Password(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("En este paso ingresa las credenciales de usuario");
	System.out.println("En este paso ingresa el nombre de usuario y contraseña");
	driver.findElement(By.id("username")).sendKeys(string);
	driver.findElement(By.id("password")).sendKeys(string2);	
	
	
	
}

@Then("inicia sesion")
public void inicia_sesion() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("En este paso inicia sesion");
	driver.findElement(By.id("loginbtn")).click();
    
}    
    
    
}