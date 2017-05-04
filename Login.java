import java.util.ArrayList;

public class Login {
    private ArrayList<User> users = new ArrayList<User>();

    public Login() {

    }

    public void  loginOrRegister() {
        System.out.print("Do you want to login or register? Press 1 for login and 2 for register");
        String input = System.console().readLine();

        if (input.equals("1"))
        Login();
        else if (input.equals("2"))
        createUser();
        else {
        System.out.println("Please try again");
        loginOrRegister();
        }


        



    }

    public void createUser() {
    
        System.out.print("Enter name:");
        String inputName = System.console().readLine();

        System.out.print("Enter email:");
        String inputEmail = System.console().readLine();

        System.out.print("Enter pincode:");
        int inputPincode = Integer.parseInt(System.console().readLine());

        User user = new User(inputName, inputEmail, inputPincode);

        // Ovenstående input i new user er fra createUser

        users.add(user);
    }

    public void Login() {
        
        System.out.print("Enter email:");
        String inputEmail = System.console().readLine();

        System.out.print("Enter pincode:");
        int inputPincode = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < users.size(); i++) {
      
            if (inputEmail.equals(users.get(i).getEmail()) && inputPincode == users.get(i).getPincode() )
            System.out.println("You are now logged in");
            else 
            System.out.println("Try again");

        }
    }

    


    }
