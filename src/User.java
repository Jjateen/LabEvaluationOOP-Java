import java.util.ArrayList;
import java.util.Objects;

public class User {
    String userName;
    String password;
    String userRole;
    int userID;
    User(int userID,String userName,String password,String userRole){
        this.userID=userID;
        this.userName=userName;
        this.password=password;
        this.userRole=userRole;
    }

    public String getPassword() {
        return password;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserRole() {
        return userRole;
    }

    void login(String uname,String pass){
        if(Objects.equals(this.userName, uname) && Objects.equals(this.password, pass)){
            System.out.println("You are logged in");
        }
        else{
            System.out.println("Invalid Credentials");
        }
    }
    void updateDetails(int userID,String userName,String password,String userRole){
        this.userID=userID;
        this.userName=userName;
        this.password=password;
        this.userRole=userRole;
    }

    //Static ArrayList to store and maintain count of employees
    static ArrayList<Employee> a = new ArrayList<>();
    Employee getEmployeeByID(int userID) {
        for (Employee e: a) {
            if (e.userID == userID) {
                return e;
            }
        }
        return null;
    }
}
