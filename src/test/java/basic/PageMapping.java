package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageMapping
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bmw.com.br/pt/index.html");

        /**
         * Mapear Objetos de Tela
         *
         * Estrutura de Tags
         *  <tag atributos="valores" ></tag>
         *  <tag atributos="valores" />
         *
         *  - id
         *  - css Selector
         *  - XPath | //*[contains(@class, 'partValue')]
         *  + linkText
         *
         * */
        Thread.sleep(3000);
        SearchContext contexto = driver.findElement(By.cssSelector("#contentpage-79b5757632 > epaas-consent-drawer-shell")).getShadowRoot();
        contexto.findElement(By.cssSelector("button.accept-button.button-primary")).click();

        driver.findElement(By.cssSelector("nav ul > li:nth-child(4) > a")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("aems-inputsearch")).sendKeys("M3 GTR");
        driver.findElement(By.id("aems-buttonsearch")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
