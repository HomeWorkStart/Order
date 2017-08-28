import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class OrderWindowEngine extends OrderWindow implements ActionListener {
	OrderWindow parent;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		list.setSelectedIndex(4);
		list.addActionListener((ActionListener) this);
	}

}
//creating own exception 
class TooManyBikesException extends Exception{
	// Конструктор
	TooManyBikesException (){
	// Просто вызовите конструктор суперкласса
	// и передайте ему сообщение, которое нужно отобразить
	super(
	"Мы не сможем доставить столько велосипедов за один раз.");
	}
	}

void actionPerformed(ActionEvent e){
	try{
	bikeOrder.checkOrder("FireBird", quantity);
	//следующая строка не выполняется в случае исключения
	txtFieldOrderConfirmation.setText(
	"Размещение вашего заказа завершено");
	} catch(TooManyBikesException e){
	txtFieldOrderConfirmation.setText(e.getMessage());
	}
	}
	void checkOrder(String bikeModel, int quantity)
	throws TooManyBikesException{
		//Напишите код, который проверяет, помещается ли требуемое
		//количество велосипедов заданной модели в грузовик.
		//Если не помещается, сделать следующее:
		throw new TooManyBikesException("Невозможно доставить"
		+ quantity + " велосипедов модели " + bikeModel +
		" за одну доставку" );
		}
		}