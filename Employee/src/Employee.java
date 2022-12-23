
public class Employee {
    String name;
    int age;
    double salary;
    String location;
    double experience;
    Employee(String name, int age, double salary, String location,double experience){
        this.name=name;
        this.salary=salary;
        this.location=location;
        this.experience=experience;
    }
    void salaryIncrement(){
        this.salary=this.salary+500;
        this.experience=this.experience+1;
    }
}

