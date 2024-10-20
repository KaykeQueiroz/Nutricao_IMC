package src;

public class Paciente {
    String nome;
    String genero;
    int idade;
    float altura;
    float kg;

    public Paciente(String nome, String genero, int idade, float altura, float kg) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.kg = kg;

    }

    public float calculadoraIMC() {
        return kg / (altura * altura);
    }

    public void exibirDetalhes() {

        System.out.println("Infome seu nome: " + nome);
        System.out.println();
        System.out.print("Informe seu Genero: ");
        switch (genero.toLowerCase()) {
            case "masculino":
                System.out.println("Masculino");
                break;
            case "feminino":
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Genero não especificado");
                break;
        }
        System.out.println();
        System.out.println("Informe sua altura: " + altura);
        System.out.println();
        System.out.println("informe seu peso: " + kg);
        System.out.println();
        System.out.println("Seu IMC: " + calculadoraIMC());
    }
}
