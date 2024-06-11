import java.util.Scanner;

public class UserInteract {

    final String REQUEST_PERSON_NAME = "Digite o nome da pessoa: ";
    final String REQUEST_PERSON_AGE = "Digite a idade da pessoa: ";
    final String REQUEST_PERSON_NEW_NAME = "Digite o novo nome da pessoa: ";
    final String REQUEST_PERSON_NEW_AGE = "Digite a nova idade da pessoa: ";
    final String REQUEST_PERSON_TO_DELETE = "Digite o ID da pessoa que quer remover: ";
    final String REQUEST_PERSON_TO_EDIT = "Digite o ID da pessoa que quer alterar: ";

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

    public String AwaitPersonName(Scanner scanner){
        System.out.println(REQUEST_PERSON_NAME);
        return scanner.nextLine();
    }
    public String AwaitPersonNewName(Scanner scanner){
        System.out.println(REQUEST_PERSON_NEW_NAME);
        return scanner.nextLine();
    }

    public int AwaitPersonAge(Scanner scanner){
        System.out.println(REQUEST_PERSON_AGE);
        return scanner.nextInt();
    }

    public int AwaitPersonNewAge(Scanner scanner){
        System.out.println(REQUEST_PERSON_NEW_AGE);
        return scanner.nextInt();
    }

    public int AwaitPersonToDelete(Scanner scanner){
        System.out.println(REQUEST_PERSON_TO_DELETE);
        return scanner.nextInt();
    }

    public int AwaitPersonToEdit(Scanner scanner){
        System.out.println(REQUEST_PERSON_TO_EDIT);
        return scanner.nextInt();
    }
}
