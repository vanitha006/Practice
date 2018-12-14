public abstract class Employee {

    String name;
    String gender;

    public Employee(String name, String gender){
        this.name=name;
        this.gender=gender;
    }

    public abstract float salary();

    public void dispDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Gender: "+this.gender);
    }
}
