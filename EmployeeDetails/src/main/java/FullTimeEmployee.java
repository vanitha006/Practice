public class FullTimeEmployee extends Employee {

    String dept;
    int emp_id;
    float basicSal;
    static int count = 1000;
    static float da=0.4f;
    {
        count++;
    }

    public FullTimeEmployee() {
        super("", "");
        this.dept="";
        this.emp_id=count;
        this.basicSal=0;
    }
    public FullTimeEmployee(String name, String gender, String dept, int basicSal) {
        super(name, gender);
        this.dept=dept;
        this.emp_id=count;
        this.basicSal=basicSal;
    }

    public static int noOfEmp(){
        return count-1000;
    }

    public float salary() {
        return basicSal*da+basicSal;
    }

    @Override
    public void dispDetails() {
        super.dispDetails();
        System.out.println("Employee id: "+emp_id);
        System.out.println("Department: "+dept);
        System.out.println("Salary: "+salary());
        System.out.println("No of Employees: "+noOfEmp());
    }
}
