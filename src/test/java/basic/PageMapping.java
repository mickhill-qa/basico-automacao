package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageMapping
{
    public static void main(String[] args)
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


        driver.quit();
    }
}
