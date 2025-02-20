public class relacaoAluno {
    // Metodo que calcula o tipo de descanso que o aluno precisa, com base no cansaco dele
    public static String calcularDescanso(aluno aluno){
        // Verificando o cansaço do aluno e decidindo qual descanso ele precisa

        if(aluno.getCansaco() <= 20){
            return "Descanso diário suficiente: O aluno está tranquilo, sem stress!😎 ";
        }else if (aluno.getCansaco()<= 50){
            return " Descanso nos fins de semana é suficiente: O aluno está moderadamente cansado. 😉";
        } else if (aluno.getCansaco() <= 80){
            return "Férias são necessárias! O aluno está exausto. 😒";
        } else {
            return "Alerta! O aluno está completamente exausto! 😢";
        }
    }
}
