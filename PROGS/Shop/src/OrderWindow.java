import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.lang.*;

public class OrderWindow implements ActionListener{
//creating window components
	JButton button_order=new JButton("���������� �����");
	JLabel namemodel = new JLabel("������� ������");
	JTextField model = new JTextField();
	JLabel number_count = new JLabel("������� ���������� �����������");
	JTextField quantity = new JTextField();
	JFrame mainframe = new JFrame("����� �����������");
	String[] bikes = {" ","type1","type2","type3","type4"};
	JComboBox list = new JComboBox(bikes);
	JPanel p1 = new JPanel();
//////////////////////////////////////////////////////////////////////////////	
	// �����������
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
		//������������� ������ ����, ��� ����� ����������
		//��� ����������
		mainframe.pack();
		//���������� ����
		mainframe.setVisible(true);
		
		list.setSelectedIndex(5);
		list.addActionListener(this);
		}
/*
	void actionPerformed(ActionEvent e){
		try{
		bikeOrder.checkOrder("FireBird", quantity);
		//��������� ������ �� ����������� � ������ ����������
		txtFieldOrderConfirmation.setText(
		"���������� ������ ������ ���������");
		} catch(TooManyBikesException e){
		txtFieldOrderConfirmation.setText(e.getMessage());
		}
		}
		void checkOrder(String bikeModel, int quantity)
		throws TooManyBikesException{
			//�������� ���, ������� ���������, ���������� �� ���������
			//���������� ����������� �������� ������ � ��������.
			//���� �� ����������, ������� ���������:
			throw new TooManyBikesException("���������� ���������"
			+ quantity + " ����������� ������ " + bikeModel +
			" �� ���� ��������" );
			}
*/			
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderWindow ord = new OrderWindow();
	}

	
}

