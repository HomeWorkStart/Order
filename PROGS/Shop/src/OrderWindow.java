import javax.swing.*;
import java.awt.*;

public class OrderWindow {

	JButton button_order=new JButton("���������� �����");
	JLabel namemodel = new JLabel("������� ������");
	JTextField model = new JTextField();
	JLabel number_count = new JLabel("������� ���������� �����������");
	JTextField quantity = new JTextField();
	JFrame mainframe = new JFrame("����� �����������");
	JComboBox spisok;
	String[] bikes = {"turbo","nitro","duper","china"}; 
	JPanel p1 = new JPanel();
	// �����������
	OrderWindow () {
		
		JPanel p1 = new JPanel();
		GridLayout gl =new GridLayout(1,1);
		p1.setLayout(gl);
		p1.add(button_order);
		p1.add(namemodel);
		p1.add(model);
		p1.add(number_count);
		p1.add(quantity);
		
		mainframe.setContentPane(p1);
		//������������� ������ ����, ��� ����� ����������
		//��� ����������
		mainframe.pack();
		//���������� ����
		mainframe.setVisible(true);

		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderWindow ord = new OrderWindow();
	}

}
