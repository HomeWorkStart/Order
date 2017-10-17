import Person.test;

public class Employee extends Person implements test {
    private String company;
    
    public Employee(String name, String surname, String company) {
     
        super(name, surname);
        this.company=company;
    }
     
    public void displayInfo(){
         
        super.displayInfo();
        System.out.println("Компания: " + company);
    }

}
