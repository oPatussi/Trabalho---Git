import java.util.Scanner;

public class UserInteract {

    final String MENU = """
            ========== Menu ==========
            1 - Listar todos as pessoas
            2 - Adicionar uma pessoa
            3 - Remover uma pessoa
            4 - Alterar uma pessoa
            0 - Sair
            """;

    final String SPACER = "==================";

    public int showMenu(Scanner scanner){
        int escolha;
        System.out.println(MENU);
        escolha = scanner.nextInt();
        scanner.nextLine();
        return escolha;
    }

}
