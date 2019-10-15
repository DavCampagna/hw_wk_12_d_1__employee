package staff;

public abstract class Employee {

    private String name;
    private int nin;
    private double salary;

    public Employee(String name, int nin, double salary){
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public int getNin(){
        return this.nin;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double value){
        this.salary = this.salary * value;
    }

    public double payBonus(){
        return this.salary / 100;
    }

    public abstract String carryOutRole();
}
