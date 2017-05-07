
import java.io.Serializable;
import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class User implements Serializable {

    private String email;
    private String password;
    ArrayList<Movie> favorites = new ArrayList<>();
    ArrayList<Movie> history = new ArrayList<>();

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFileName() {
        return this.email + ".txt";
    }

    @SuppressWarnings("unchecked")
    public void saveToFile() {
        try {
            FileOutputStream fos = new FileOutputStream(getFileName());
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
        } catch (Exception e) {
            System.out.println("Error ArrayToFile");
            e.printStackTrace();
        }
    }

    public void addFavorite(Movie favorite) {
    }
}
