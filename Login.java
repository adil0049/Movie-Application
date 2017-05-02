import java.util.ArrayList;

public class Login {
    private ArrayList<User> users = new ArrayList<User>();

    public Login() {

    }

    public void createUser() {
    
    System.out.print("Enter name:");
    String inputName = System.console().readLine();

    System.out.print("Enter email:");
    String inputEmail = System.console().readLine();

    System.out.print("Enter pincode:");
    int inputPincode = Integer.parseInt(System.console().readLine());

     User user = new User(inputName, inputEmail, inputPincode);

    // Ovenstående inpit i new user er fra createAccount

    users.add(user);
    }

    public void Login() {
        
    System.out.print("Enter email:");
    String inputEmail = System.console().readLine();

    System.out.print("Enter pincode:");
    int inputPincode = Integer.parseInt(System.console().readLine());

    


    }
}