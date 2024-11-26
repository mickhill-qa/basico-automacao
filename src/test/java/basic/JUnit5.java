package basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Funcionalidade: Testes de Aprendizado")
public class JUnit5
{
    @Test
    @DisplayName("Cenario: Teste 1")
    public void mickLindo()
    {
        int a = 6;
        int b = 2+3;
        Assertions.assertEquals(a, b);
        System.out.println("deu certo!");
    }

    @Test
    @DisplayName("Cenario: Teste 2")
    public void mickLindao()
    {
        System.out.println("Olá Testes!");
    }
}
