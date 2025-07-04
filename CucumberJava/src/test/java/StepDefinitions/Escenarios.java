package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class Escenarios {

	WebDriver driver = null;

	@Before
	public void abrirNavegador() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/drivers/chromedriver");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().window().maximize();
	}
	
	@After
	public void cerrarNavegador(Scenario escenario) {
		if (escenario.isFailed()) {
			TakesScreenshot WebDriver = null;
			byte[] screenshot = ((TakesScreenshot) WebDriver).getScreenshotAs(OutputType.BYTES);
		    escenario.attach(screenshot, "image/png", "name");
		} 
		
		driver.close();
		driver.quit();
	}


	@And("el usuario ingresa a la pagina de inicio de sesion")
	public void el_usuario_ingresa_a_la_pagina_de_inicio_de_sesion() throws InterruptedException {
		driver.navigate().to("http://the-internet.herokuapp.com/login");
		driver.findElement(By.id("login"));

		Thread.sleep(3000);
	}

	@When("el usuario introduce el Username y Password validos")
	public void el_usuario_introduce_el_username_y_password_validos() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		Thread.sleep(3000);
	}

	@And("Hace click en el boton Login")
	public void hace_click_en_el_boton_login() {
		driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
	}

	@Then("el usuario es redirigido al dashboard con el mensaje Welcome to the Secure Area")
	public void el_usuario_es_redirigido_al_dashboard_con_el_mensaje_welcome_to_the_secure_area() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"flash\"]")).isDisplayed();		
		driver.findElement(By.xpath("//a[@href='/logout']")).isDisplayed();
		Thread.sleep(3000);
	}

	@And("cierra sesion")
	public void cierra_sesion() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		Thread.sleep(3000);
	}


	// Escenario 2

	@When("el usuario introduce el Username y Password no validos")
	public void el_usuario_introduce_el_username_y_password_no_validos() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("vianka");
		driver.findElement(By.id("password")).sendKeys("medina");
		Thread.sleep(3000);
	}

	@Then("verificar mensaje Your username is invalid!")
	public void verificar_mensaje_your_username_is_invalid() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"flash\"]")).isDisplayed();
		driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).isDisplayed();
		Thread.sleep(3000);
	}
	
	// Escenario 3
	@When("el usuario introduce el Password")
	public void el_usuario_introduce_el_password() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		Thread.sleep(3000);
	}



}
