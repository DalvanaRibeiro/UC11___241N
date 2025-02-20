import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class relacaoAlunoTest {
    private aluno aluno1, aluno2, aluno3,aluno4;
    // Este método é executado antes de cada teste. Ele prepara os objetos necessários para o teste.
    @BeforeEach
    public void setup(){
        System.out.printf("Criando novos alunos :) ...");
        // Criando alunos com diferentes níveis de cansaço
        aluno1  = new aluno("JovemNey", 80.0); // MeninoNey com 80% de cansaço
        aluno2 = new aluno("Arthur", 10.0); // Menino Arthur bem de boa com 10% de cansaço
        aluno3 = new aluno("Ariel",40.0); // Menino Ariel com 40% de cansaço
        aluno4 = new aluno("Mariana", 90.0); // Menina Mariana beeeee cansado 90%
    }
    // Teste simples para verificar o descanso do aluno1
    @Test
    public void testDescansoSuficiente(){
        System.out.printf("Testando descanso suficiente...");
        String descanso = relacaoAluno.calcularDescanso(aluno1);
        assertEquals("Férias são necessárias! O aluno está exausto. 😒", descanso, "Esperado descanso de férias é suficiente.");
    }
    // Teste para verificar o descanso do aluno 2
    @Test
    public  void testDescansoModerado(){
        System.out.printf("Testando o descanso Moderado...");
        String descanso = relacaoAluno.calcularDescanso(aluno2);
        assertEquals("Descanso diário suficiente: O aluno está tranquilo, sem stress!😎", descanso, "");
    }


}
