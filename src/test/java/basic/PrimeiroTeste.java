package basic;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiroTeste
{
    WebDriver driver = new ChromeDriver();

    @Test
    @DisplayName("Cenario: Pesquisa BMW")
    public void cenario1() throws InterruptedException
    {
        driver.get("https://www.bmw.com.br/pt/index.html");
        Thread.sleep(1500);
        SearchContext contexto = driver.findElement(By.cssSelector("#contentpage-79b5757632 > epaas-consent-drawer-shell")).getShadowRoot();
        contexto.findElement(By.cssSelector("button.accept-button.button-primary")).click();

        driver.findElement(By.cssSelector("nav ul > li:nth-child(4) > a")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("aems-inputsearch")).sendKeys("M3 GTR");
        driver.findElement(By.id("aems-buttonsearch")).click();
        Thread.sleep(2000);

        String resultPesquisa = driver.findElement(By.id("aems-resultText")).getText();
        Assertions.assertTrue(resultPesquisa.contains("M3 GTR"));
    }

    @AfterEach
    public void fecharNavegador() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.quit();
    }
}
