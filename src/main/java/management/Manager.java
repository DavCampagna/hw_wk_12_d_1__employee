package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, int nin, double salary, String deptName){
        super(name, nin, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }

    public String carryOutRole(){
        return "I am managing";
    }

}
