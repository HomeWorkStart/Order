import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class OrderWindowEngine implements ActionListener {
	OrderWindow parent;

	//constructor
	OrderWindowEngine(){
		this.parent = parent;
	}
	//@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
//creating own exception 
class TooManyBikesException extends Exception{
	// �����������
	TooManyBikesException (){
	// ������ �������� ����������� �����������
	// � ��������� ��� ���������, ������� ����� ����������
	super(
	"�� �� ������ ��������� ������� ����������� �� ���� ���.");
	}
	}

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
		}