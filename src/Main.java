public class Main {
    public static void main(String[] args) {
        Employee e1= new Employee(101,"j","abc","role","dep","4489","wDSG","EGWW");
        Employee e2= new Employee(2,"j","abc","role","dep","4489","wDSG","EGWW");
        HRAdmin hra = new HRAdmin(3,"j","abc","role","dep","4489","wDSG","EGWW");
        hra.viewEmployee(101);

    }
}