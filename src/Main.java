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

            }
        }
    }

}
