
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    private ArrayList<User> users = new ArrayList<User>();

    public Login() {
    }

    /*public void usersToFile(){
        for(int i = 0; i < this.users.size(); i++){
            User currentUser = this.users.get(i);
            try {
                FileOutputStream fos = new FileOutputStream(currentUser.getEmail() + ".txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(currentUser);
                oos.close();
            } catch (Exception e) {
                System.out.println("Error ArrayToFile");
                e.printStackTrace();
            }
        }
    }*/
    public void fileToUsers() {

    }

    public void createUser() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter email:");
        String inputEmail = scan.nextLine();

        System.out.print("Create Password:");
        String inputPassword = scan.nextLine();

        User user = new User(inputEmail, inputPassword);

        users.add(user);
        try {
            String path = "data/users/" + inputEmail + ".txt";
            File userFile = new File(path);
            userFile.createNewFile();
        } catch (Exception e) {
            System.out.println("Error createUser");
        }
    }

    public User login() {

        User currentUser = new User();
        boolean foundUser = false;
        while (!foundUser) {
            System.out.print("Enter email:");
            String inputEmail = System.console().readLine();

            System.out.print("Enter Password:");
            String inputPassword = System.console().readLine(); // Skal laves så login funktionen, læser den udvalgte fil og smider den i Arraylist som object
            // Login skal spørge efter email først, finde filen med emailen, unserilize, så checke på kode efter
            for (int i = 0; i < users.size(); i++) {
                if (inputEmail.equals(users.get(i).getEmail()) && inputPassword.equals(users.get(i).getPassword())) {
                    System.out.println("You are now logged in");
                    currentUser = this.users.get(i);
                    foundUser = true;
                }
            }
        }
        return currentUser;
    }

}
