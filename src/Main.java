import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInteract userInteract = new UserInteract();

        int option;

        while (true){
            option = userInteract.showMenu(scanner);
        }
    }

}
