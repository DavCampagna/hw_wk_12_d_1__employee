package techStaff;

import staff.Employee;

public class DatabaseAdmin extends Employee {
    public DatabaseAdmin(String name, int nin, double salary){
        super(name, nin, salary);
    }

    public String carryOutRole(){
        return "I am working on the database";
    }

}
