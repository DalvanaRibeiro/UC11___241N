public class aluno{
    private String nome; // Variável para armazenar o nome do aluno
    private double cansaco;  // Variável para armazenar o nível de cansaço do aluno %

    public aluno(String nome, double cansaco){
        this.nome = nome;
        this.cansaco = cansaco;
    }
    // Metodo que retorna o nome do aluno
    public String getNome(){
        return nome;
    }
    // Metodo que retorna o nivel de cansaco do aluno
    public double getCansaco(){
        return cansaco;
    }
    // Metodo que altera o nível de cansaço do aluno
    public void setCansaco(double cansaco){
        this.cansaco = cansaco;
    }
}