public class calculadora {

    // Método para somar dois números
    public double soma(double a, double b) {
        return a + b;
    }

    // Método para subtrair dois números
    public double subtracao(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dois números
    public double multiplica(double a, double b) {
        return a * b;
    }

    // Método para dividir dois números
    public double divide(double a, double b) {
        // Verifica se o divisor é zero para evitar divisão por zero
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero!");
        }
        return a / b;
    }
}
