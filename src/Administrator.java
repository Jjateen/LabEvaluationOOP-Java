import java.util.Objects;
import java.util.Scanner;
public class Administrator extends User {
    public Administrator(int userID, String userName, String password, String userRole) {
        super(userID, userName, password, userRole);
    }
    void addEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter userID"); int ui = sc.nextInt();
        System.out.println("Enter userName"); String un = sc.nextLine();
        System.out.println("Enter password"); String pass = sc.nextLine();
        System.out.println("Enter userRole"); String ur = sc.nextLine();
        System.out.println("Enter department"); String d = sc.nextLine();
        System.out.println("Enter contact"); String cc = sc.nextLine();
        System.out.println("Enter nationality"); String n = sc.nextLine();
        System.out.println("Enter qualification"); String q = sc.nextLine();
        Employee e = new Employee(ui,un,pass,ur,d,cc,n,q);
    }
    void defineAccessLevel(){
        System.out.println("Access Level Defined");
    }
    void viewEmployees() {
        for(Employee e: a) {
                // Print employee data
                System.out.println("Employee ID: " + e.getUserID());
                System.out.println("Employee Name: " + e.getUserName());
                System.out.println("Employee userRole: " + e.getUserRole());
                System.out.println("Employee Department: " + e.getDepartment());
                System.out.println("Employee Department: " + e.getContact());
                System.out.println("Employee Department: " + e.getNationality());
                System.out.println("Employee Department: " + e.getQualification());
        }
    }
    void editEmployee(int nuserID,String newUserName,String npassword,String nuserRole,String ndepartment, String ncontact, String nnationality, String nqualification) {
        Employee employee = getEmployeeByID(userID);
        if (employee != null) {
            employee.updateDetailsEmployee(nuserID,newUserName,npassword,nuserRole,ndepartment,ncontact,nnationality,nqualification);
            System.out.println("Employee details updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
    void newLogin(String uname,String pass){
        if(Objects.equals(this.userName, uname) && Objects.equals(this.password, pass)){
            System.out.println("You are logged in");
        }
        else{
            System.out.println("Invalid Credentials");
        }
    }

}
