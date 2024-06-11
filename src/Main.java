import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInteract userInteract = new UserInteract();
        PessoaController pessoaController = new PessoaController();

        List<Pessoa> pessoas = new ArrayList<>();

        int option;

        while (true){
            option = userInteract.showMenu(scanner);
            if(option == 0)break;
            switch (option){
                case 1 ->{
                    pessoaController.ListAll(pessoas);
                }
                case 2 ->{
                    String nome = userInteract.AwaitPersonName(scanner);
                    int idade = userInteract.AwaitPersonAge(scanner);
                    pessoas.add(pessoaController.AddPerson(nome,idade));
                }
                case 3->{
                    pessoaController.ListAll(pessoas);
                    int idPerson = userInteract.AwaitPersonToDelete(scanner);
                    pessoaController.RemovePerson(pessoas,idPerson);
                }
                case 4->{
                    String novoNome = userInteract.AwaitPersonNewName(scanner);
                    int novaIdade = userInteract.AwaitPersonNewAge(scanner);
                    int idPerson = userInteract.AwaitPersonToEdit(scanner);
                    pessoaController.UpdatePerson(pessoas,idPerson,novoNome,novaIdade);
                }

            }
        }
    }

}
