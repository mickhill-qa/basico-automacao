package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesquisaGoogleSteps
{
    WebDriver driver;

    /**
     * Hooks
     * */
    @Before
    public void antesDoTeste()
    {
        driver = new ChromeDriver();
    }

    @After
    public void depoisDoTeste()
    {
        driver.quit();
    }

    /**
     * Steps of Tests
     * */
    @Dado("que o usuario esta na pagina do google")
    public void que_o_usuario_esta_na_pagina_do_google()
    {
        driver.get("https://google.com.br");
    }

    @Quando("o usuario prencher o campo de pesquisa com {string}")
    public void o_usuario_prencher_o_campo_de_pesquisa_com(String texto_pesquisa)
    {
        driver.findElement(By.id("APjFqb")).sendKeys(texto_pesquisa);
        driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Entao("a pagina me redirecionara para os resultados da pesquisa")
    public void a_pagina_me_redirecionara_para_os_resultados_da_pesquisa()
    {
        String urlEsperada = "https://www.google.com.br/search?q=";
        String urlDaTela = driver.getCurrentUrl();
        Assert.assertTrue(urlDaTela.contains(urlEsperada));
    }
}
