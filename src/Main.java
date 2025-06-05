import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Garante uso de ponto decimal

        // Livro
        System.out.println("Informe a descrição do livro:");
        String descricaoLivro = scanner.nextLine();

        System.out.println("Informe o armazém onde o livro está:");
        String armazemLivro = scanner.nextLine();

        System.out.println("Informe o ano do livro:");
        int anoLivro = Integer.parseInt(scanner.nextLine());

        System.out.println("Informe o nome do livro:");
        String nomeLivro = scanner.nextLine();

        System.out.println("Informe o autor do livro:");
        String autor = scanner.nextLine();

        System.out.println("Informe a editora do livro:");
        String editora = scanner.nextLine();

        Livro livro = new Livro(descricaoLivro, armazemLivro, anoLivro, nomeLivro, autor, editora);
        System.out.println("\n=== Informações do Livro ===");
        livro.exibirInfo();

        // Varinha
        System.out.println("\nInforme a descrição da varinha:");
        String descricaoVarinha = scanner.nextLine();

        System.out.println("Informe o armazém da varinha:");
        String armazemVarinha = scanner.nextLine();

        System.out.println("Informe o ano da varinha:");
        int anoVarinha = Integer.parseInt(scanner.nextLine());

        System.out.println("Informe o núcleo da varinha:");
        String nucleo = scanner.nextLine();

        System.out.println("Informe o tamanho da varinha (use ponto como separador decimal):");
        double tamanho = Double.parseDouble(scanner.nextLine());

        System.out.println("Informe o tipo de madeira da varinha:");
        String madeira = scanner.nextLine();

        Varinha varinha = new Varinha(descricaoVarinha, armazemVarinha, anoVarinha, nucleo, tamanho, madeira);
        System.out.println("\n=== Informações da Varinha ===");
        varinha.exibirInfo();

        scanner.close();
    }
}
