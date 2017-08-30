import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.lang.*;

public class OrderWindow implements ActionListener{
//creating window components
	JButton button_order=new JButton("Разместить заказ");
	JLabel namemodel = new JLabel("Введите модель");
	JLabel number_count = new JLabel("Введите количество велосипедов");
	JTextField quantity = new JTextField();
	JFrame mainframe = new JFrame("Заказ велосипедов");
	String[] bikes = {" ","type1","type2","type3","type4"};
	JComboBox<Object> list;
	
	JPanel p1 = new JPanel();
//////////////////////////////////////////////////////////////////////////////	
	// Конструктор
	OrderWindow () {
//////////////////////////////////////////////////////////////////////////////		
		JPanel p1 = new JPanel();
		GridLayout gl =new GridLayout(1,1);
		p1.setLayout(gl);
		p1.add(button_order);
		p1.add(namemodel);
		p1.add(list);
		p1.add(number_count);
		p1.add(quantity);
			
		mainframe.setContentPane(p1);
		//Устанавливаем размер окна, так чтобы уместились
		//все компоненты
		mainframe.pack();
		//Показываем окно
		mainframe.setVisible(true);
		
		list = new JComboBox<Object>(bikes);
		
		//adding action listener
		OrderWindowEngine order = new OrderWindowEngine();
		button_order.addActionListener(order);
		list.addActionListener(order);
		quantity.addActionListener(order);
		}

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderWindow ord = new OrderWindow();
	}

	
}

