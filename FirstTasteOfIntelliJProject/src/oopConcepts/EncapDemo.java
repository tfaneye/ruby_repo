package oopConcepts;

public class EncapDemo {

    private String name = "Jane";
    private String role = "Tester";
    private double salary = 35000;
    public String startDate = "10/09/2018";
    private long staffID = 12345678L;

    public double paySalary(String name){
        return salary;

    }

    public long describeStaffByID(String name){
        return staffID;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public String getRole(){
        return role;
    }

    public String getStartDate(){
        return startDate;
    }

    public long getStaffID() {
        return staffID;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}
