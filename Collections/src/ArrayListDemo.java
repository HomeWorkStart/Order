import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating and adding ArrayList
		ArrayList friends = new ArrayList();
		friends.add("Elena");
		friends.add("Anna");
		friends.add("Nikolay");
		friends.add("Sergey");

		// how many friends ?
		int friendsCount = friends.size();

		for (int i = 0; i < friendsCount; i++) {
			System.out.println("Friend #" + i + " is " + friends.get(i)); 
		}
	}

}
