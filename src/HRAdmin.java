public class HRAdmin extends Employee {
    public HRAdmin(int userID, String userName, String password, String userRole,
                   String department, String contact, String nationality, String qualification) {
        super(userID, userName, password, userRole, department, contact, nationality, qualification);
    }

    public void viewReports() {
        System.out.println("Reports viewed.");
    }

    void viewEmployee(int id) {
        for(Employee e: a) {
            if(e.userID==id){
                System.out.println("Employee ID: " + e.getUserID());
                System.out.println("Employee Name: " + e.getUserName());
                System.out.println("Employee userRole: " + e.getUserRole());
                System.out.println("Employee Department: " + e.getDepartment());
                System.out.println("Employee Contact: " + e.getContact());
                System.out.println("Employee Nationality: " + e.getNationality());
                System.out.println("Employee Qualification: " + e.getQualification());
            }
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
}