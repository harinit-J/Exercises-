public class Main {
    public static void main(String[] args) {
        Employee employeeInfoJavaDeveloper= new Employee ("Hephzibah",36,5000,"USA",3);
        Employee employeeInfoAdmin= new Employee ("Chekodi",30,3000,"USA",1);

        if(employeeInfoJavaDeveloper.experience>=3) {
            System.out.println(employeeInfoJavaDeveloper.name+"is promoted to next level");
        }
        if(employeeInfoAdmin.experience>=3) {
            System.out.println(employeeInfoAdmin.name+"is promoted to next level");
        }
    }
}
