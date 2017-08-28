
public class CarOwner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		Car JCarJamesBondCar = new JamesBondCar();
		int distance1;
		distance1 = myCar.drive(10);
		System.out.println(distance1);
		distance1 = JCarJamesBondCar.drive(10);
		System.out.println(distance1);
				
	}

}
