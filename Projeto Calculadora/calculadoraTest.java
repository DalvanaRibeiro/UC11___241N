import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class calculadoraTest {

    // Criação do objeto Calculadora
    calculadora calculadora = new calculadora();

    // Testando a soma
    @Test
    public void testSoma() {
        // Teste com números positivos
        assertEquals(8.0, calculadora.soma(5.0, 3.0), "Erro na soma");
        double resultado = calculadora.soma(5.0,3.0);
        assertTrue(resultado>0, "A soma não é positiva");
        assertNotEquals(10.0,calculadora.soma(5.0,3.0));
        assertNotNull(calculadora.soma(5.0,3.0));

    }

    // Testando a subtração
    @Test
    public void testSubtracao() {
        // Teste com números positivos
        assertEquals(5.0, calculadora.subtracao(10.0, 5.0), "Erro na subtração");

    }
    // Testando a multiplicação
    @Test
    public void testMultiplica() {
        // Teste com números positivos
        assertEquals(15.0, calculadora.multiplica(5.0, 3.0), "Erro na multiplicação");

    }

    // Testando a divisão
    @Test
    public void testDivide() {
        // Teste com números positivos
        assertEquals(2.0, calculadora.divide(10.0, 5.0), "Erro na divisão");

    }

    // Testando a exceção de divisão por zero
    @Test
    public void testDividePorZero() {
        // Teste para garantir que a exceção de divisão por zero seja lançada
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.divide(10.0, 0.0);
        });

        // Verificando a mensagem de exceção
        assertEquals("Não é possível dividir por zero!", exception.getMessage(), "Erro na exceção de divisão por zero");
    }
}
