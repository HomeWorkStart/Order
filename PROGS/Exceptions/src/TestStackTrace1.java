
public class TestStackTrace1 {
	TestStackTrace1() {
		divideByZero();
	}

	int divideByZero() {
		return 25 / 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestStackTrace1();
	}

}
