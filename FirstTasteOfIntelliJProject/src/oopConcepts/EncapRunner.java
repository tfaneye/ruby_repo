package oopConcepts;

public class EncapRunner {

    public static void main(String[] args) {
        EncapDemo encapDemo = new EncapDemo();
        //double janeSalary = encapDemo.paySalary("Jane");
        //System.out.println(janeSalary);

        long newStaffID = encapDemo.getStaffID();
        System.out.println(newStaffID);

        double salary = encapDemo.getSalary();
        System.out.println(salary);

        encapDemo.setSalary(45000);

        double janeNewSalary = encapDemo.getSalary();
        System.out.println(janeNewSalary);
    }
}
