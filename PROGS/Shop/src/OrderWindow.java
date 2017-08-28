import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.lang.*;

public class OrderWindow implements ActionListener{
//creating window components
	JButton button_order=new JButton("–азместить заказ");
	JLabel namemodel = new JLabel("¬ведите модель");
	JTextField model = new JTextField();
	JLabel number_count = new JLabel("¬ведите количество велосипедов");
	JTextField quantity = new JTextField();
	JFrame mainframe = new JFrame("«аказ велосипедов");
	String[] bikes = {" ","type1","type2","type3","type4"};
	JComboBox list = new JComboBox(bikes);
	JPanel p1 = new JPanel();
//////////////////////////////////////////////////////////////////////////////	
	//  онструктор
	OrderWindow () {
//////////////////////////////////////////////////////////////////////////////		
		JPanel p1 = new JPanel();
		GridLayout gl =new GridLayout(1,1);
		p1.setLayout(gl);
		p1.add(button_order);
		p1.add(namemodel);
		p1.add(list);
		//p1.add(model);
		p1.add(number_count);
		p1.add(quantity);
		p1.add(list);
		
		mainframe.setContentPane(p1);
		//”станавливаем размер окна, так чтобы уместились
		//все компоненты
		mainframe.pack();
		//ѕоказываем окно
		mainframe.setVisible(true);
		
		list.setSelectedIndex(5);
		list.addActionListener(this);
		}
/*
	void actionPerformed(ActionEvent e){
		try{
		bikeOrder.checkOrder("FireBird", quantity);
		//следующа€ строка не выполн€етс€ в случае исключени€
		txtFieldOrderConfirmation.setText(
		"–азмещение вашего заказа завершено");
		} catch(TooManyBikesException e){
		txtFieldOrderConfirmation.setText(e.getMessage());
		}
		}
		void checkOrder(String bikeModel, int quantity)
		throws TooManyBikesException{
			//Ќапишите код, который провер€ет, помещаетс€ ли требуемое
			//количество велосипедов заданной модели в грузовик.
			//≈сли не помещаетс€, сделать следующее:
			throw new TooManyBikesException("Ќевозможно доставить"
			+ quantity + " велосипедов модели " + bikeModel +
			" за одну доставку" );
			}
*/			
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderWindow ord = new OrderWindow();
	}

	
}

