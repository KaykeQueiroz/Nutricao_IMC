package src;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Paciente
        Paciente paciente1 = new Paciente("Maria Silva", "Feminino", 30, 1.65f, 68.5f);

        // Exibindo os detalhes do paciente e o IMC
        paciente1.exibirDetalhes();
    }
}
