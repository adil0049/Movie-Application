import java.util.Scanner;

public class Menu {
     public void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do?");
        System.out.println("Press 1 if you like to <<<SKRIV HER>>>"); //Her skal vi skrive det som brugeren har mulighed for at gøre ved at taste "1"
        System.out.println("Press 2 if you like to <<<SKRIV HER>>>"); //Her skal vi skrive det som brugeren har mulighed for at gøre ved at taste "2"
        System.out.println("Press 3 if you like to <<<SKRIV HER>>>"); //Her skal vi skrive det som brugeren har mulighed for at gøre ved at taste "3"
        System.out.println("Press 4 if you like to <<<SKRIV HER>>>"); //Her skal vi skrive det som brugeren har mulighed for at gøre ved at taste "4"
        
        System.out.println("Press 5 if you like to exit"); 

        String input = scanner.nextLine();

        switch (input) {
            case "1":
                //Her skal vi skrive navnet på den metode vi ønsker skal køres, når brugeren taster "1"
                System.out.println("test1");
                break;
            case "2":
                //Her skal vi skrive navnet på den metode vi ønsker skal køres, når brugeren taster "2"
                System.out.println("test2");

                break;
            case "3":
                //Her skal vi skrive navnet på den metode vi ønsker skal køres, når brugeren taster "3"
                System.out.println("test3");

                break;
            case "4":
                //Her skal vi skrive navnet på den metode vi ønsker skal køres, når brugeren taster "4"
                System.out.println("test4");
                break;
            case "5":
                //Afslutte program
                System.out.println("Thank you for using Netlix - good bye!");
                break;
            default:
                //Dette vil blive kørt, hvis brugeren indtaster noget ugyldigt
                System.out.println("Invalid input");
        }
     }
}