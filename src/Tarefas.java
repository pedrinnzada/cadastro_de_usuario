import java.util.Scanner;

public class Tarefas {
    public static void main(String[] args) {
        String[] tarefas = new String[] { "x", "x", "x", "x", "x", "x", "x", "x", "x", "x" };
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Lê opção (1 - Cadastrar, 2 - Exibir, Qualquer outra - Sair)
            System.out.println("\nOpções:");
            System.out.println("1. Cadastrar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Sair");
            System.out.print("SELECIONE: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1 -> {
                    System.out.println("QUAL TAREFA DESEJA CADASTRAR: ");
                    String tarefa = scanner.nextLine();
                    System.out.print("ARMAZENA ESSA TAREFA NA SUA LISTA DE 1 A 10: ");
                    int [] tarefasnovas = new int[10];
                    int tarefanovas = scanner.nextInt();
                    tarefas [tarefanovas] = tarefa;
                    System.out.print("TAREFA " + (tarefa) + " ADICIONADA COM SUCESSO!");
                    System.out.print("\n");
                }

                case 2 -> {
                    for (int i = 1; i < tarefas.length; i++) {
                        System.out.println(i + " | Tarefa - " + tarefas[i]);
                    }

                }

                default -> {
                    System.out.println("Encerrando programa...");
                    scanner.close();
                    return;
                }
            }
        }
    }
}