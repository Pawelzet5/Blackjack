package GreenSoft;
import java.util.Scanner;
public class Main {

    public static  void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Witaj! Czy chcialbys zagrać partyjkę BlackJacka? (tak/nie)");
        String decyzja = myObj.nextLine();

        while(decyzja.compareTo("nie")>0) {
            BlackJack bj = new BlackJack();
            System.out.println("\nCzy chcialbys zagrać kolejną partyjkę BlackJacka? (tak/nie)");
            decyzja = myObj.nextLine();
        }
        System.out.println("To narazie!");
    }
}
