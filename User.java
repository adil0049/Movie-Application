public class User {
    private String name; 
    private String email; 
    private int pincode; 

    public User(String name, String email, int pincode) {
        this.name = name; 
        this.email = email; 
        this.pincode = pincode; 
    }

    public String getName() {
        return name; 
        }

    public String getEmail() {
        return email; 
        }
    
    public int getPincode() {
        return pincode; 
        }
}
