// Importação das bibliotecas necessárias para criar a interface gráfica
import javax.swing.*; // Para componentes gráficos como janelas, botões e campos de texto
import java.awt.*; // Para layout e organização dos componentes
import java.awt.event.ActionEvent; // Para lidar com eventos, como o clique de um botão
import java.awt.event.ActionListener; // Para ouvir o clique de um botão e reagir a isso
// A biblioteca 'javax.swing' oferece todos os componentes gráficos que vamos usar, como JTextField, JButton, etc.

public class SistemaDescanso extends JFrame { // Cria a classe principal, que herda funcionalidades de JFrame (uma janela)

    // Declaração das variáveis de componentes gráficos
    private JTextField nomeTextField; // Campo de texto onde o usuário vai digitar o nome do aluno
    private JTextField cansaçoTextField; // Campo de texto onde o usuário vai digitar o percentual de cansaço
    private JTextArea resultadoTextArea; // Área de texto onde será mostrado o resultado do cálculo

    // Construtor da classe SistemaDescanso, que configura e inicializa a janela
    public SistemaDescanso() {
        // Configurações da janela principal
        setTitle("Sistema de Descanso dos Alunos"); // Define o título da janela
        setSize(400, 300); // Define o tamanho da janela (largura de 400px e altura de 300px)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define o comportamento de fechamento (fecha o programa ao fechar a janela)
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Layout da janela
        setLayout(new BorderLayout()); // Organiza os componentes em uma estrutura de "border", ou seja, um arranjo em 5 áreas (Norte, Sul, Leste, Oeste, Centro)

        // Painel para inserir dados do usuário
        JPanel painelEntrada = new JPanel(); // Cria um painel para agrupar os componentes de entrada (textos e botões)
        painelEntrada.setLayout(new GridLayout(3, 2)); // Organiza os componentes dentro do painel em uma grade de 3 linhas e 2 colunas

        // Adicionando um label (etiqueta) e um campo de texto para o nome do aluno
        painelEntrada.add(new JLabel("Nome do Aluno:")); // Rótulo indicando onde o nome do aluno deve ser digitado
        nomeTextField = new JTextField(); // Campo de texto onde o nome do aluno será inserido
        painelEntrada.add(nomeTextField); // Adiciona o campo de texto no painel

        // Adicionando um label (etiqueta) e um campo de texto para o percentual de cansaço
        painelEntrada.add(new JLabel("Percentual de Cansaço:")); // Rótulo para o campo de cansaço
        cansaçoTextField = new JTextField(); // Campo de texto onde o percentual de cansaço será inserido
        painelEntrada.add(cansaçoTextField); // Adiciona o campo de texto no painel

        // Botão para calcular o descanso
        JButton calcularButton = new JButton("Calcular Descanso"); // Cria um botão com o texto "Calcular Descanso"
        painelEntrada.add(calcularButton); // Adiciona o botão ao painel de entrada

        // Área de texto onde o resultado será mostrado
        resultadoTextArea = new JTextArea(5, 30); // Cria uma área de texto com 5 linhas e 30 colunas
        resultadoTextArea.setEditable(false); // Torna a área de texto não editável (apenas leitura)
        JScrollPane scrollPane = new JScrollPane(resultadoTextArea); // Cria uma barra de rolagem para a área de texto, caso o texto ultrapasse o tamanho da área

        // Adicionando a imagem no topo da janela
        ImageIcon imagem = new ImageIcon("imagens/logo.png");  // Carrega a imagem de logo (caminho relativo da imagem)
        JLabel imagemLabel = new JLabel(imagem); // Cria um componente de rótulo para exibir a imagem
        add(imagemLabel, BorderLayout.NORTH); // Adiciona a imagem no topo da janela (área norte)

        // Adicionando os componentes à janela
        add(painelEntrada, BorderLayout.CENTER); // Adiciona o painel de entrada no centro da janela
        add(scrollPane, BorderLayout.SOUTH); // Adiciona a área de resultados (com barra de rolagem) no fundo da janela (área sul)

        // Ação do botão de calcular
        calcularButton.addActionListener(new ActionListener() { // Quando o botão é pressionado, o código dentro de actionPerformed será executado
            @Override
            public void actionPerformed(ActionEvent e) { // Este método é chamado quando o botão é clicado
                calcularDescanso(); // Chama o método que realiza o cálculo do descanso
            }
        });
    }

    // Método que calcula o descanso baseado no nome e no percentual de cansaço
    private void calcularDescanso() {
        // Pega os valores inseridos pelo usuário nos campos de texto
        String nome = nomeTextField.getText(); // Pega o nome do aluno
        String cansaçoText = cansaçoTextField.getText(); // Pega o percentual de cansaço

        try {
            // Tenta converter o valor do cansaço de texto para número (decimal)
            double cansaço = Double.parseDouble(cansaçoText);

            // Criação do objeto 'aluno' com os dados fornecidos
            aluno aluno = new aluno(nome, cansaço); // Cria uma instância do aluno com o nome e cansaço inseridos

            // Chama o método para calcular o descanso
            String descanso = relacaoAluno.calcularDescanso(aluno); // Calcula o descanso baseado no aluno

            // Exibe o resultado no campo de texto (resultadoTextArea)
            resultadoTextArea.setText("Resultado para " + nome + ":\n" + descanso); // Mostra o nome do aluno e o descanso calculado

        } catch (NumberFormatException ex) { // Se o percentual de cansaço não for um número válido
            // Exibe uma mensagem de erro
            resultadoTextArea.setText("Erro: O percentual de cansaço deve ser um número válido.");
        }
    }

    // Método principal que inicializa a interface gráfica
    public static void main(String[] args) {
        // Inicializa a interface gráfica dentro da thread de eventos do Swing
        SwingUtilities.invokeLater(new Runnable() { // Garante que a interface gráfica seja criada no momento certo
            @Override
            public void run() { // Método que será executado na thread de eventos
                SistemaDescanso sistema = new SistemaDescanso(); // Cria uma nova instância do sistema de descanso
                sistema.setVisible(true); // Torna a janela visível
            }
        });
    }
}
