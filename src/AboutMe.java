import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Digite a idade: ");
            String idadeString = scanner.nextLine();

            // Tenta converter a string para um número inteiro
            int idade = Integer.parseInt(idadeString);

            // Se a conversão for bem-sucedida, exibe os dados
            System.out.println("Nome: " + nome);
            System.out.println("Sobrenome: " + sobrenome);
            System.out.println("Idade: " + idade);
        } catch (NumberFormatException e) {
            // Se a conversão falhar, exibe uma mensagem de erro
            System.out.println("Erro: A idade deve conter apenas números.");
        } finally {
            // Fecha o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }
}
