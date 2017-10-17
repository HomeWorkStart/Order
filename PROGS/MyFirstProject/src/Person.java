
public class Person {

	private String name;
    private String surname;
    
    public String getName() { return name; }
    public String getSurname() { return surname; }
     
    public Person(String name, String surname){
     
        this.name=name;
        this.surname=surname;
    }
  
    public interface test{
    	String name = " ";
    	void test1();
    	void test2();
    }
    public void displayInfo(){
         
        System.out.println("Имя: " + name + " Фамилия: " + surname);
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empl = new Employee("Tom", "Simpson", "Oracle");
	    empl.displayInfo();
	    String firstName = empl.getName();
	    System.out.println(firstName);
	}

}
