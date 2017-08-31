import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OrderWindowEngine implements ActionListener {
	OrderWindow parent;

	// constructor
	OrderWindowEngine(OrderWindow parent) {
		this.parent = parent;
	}

	public void actionPerformed(ActionEvent e) {
		String text_quantity;
		int int_quantity;
		
		text_quantity=parent.quantity.getText();
        
            if (text_quantity!=""){
                try {
                	int_quantity = Integer.parseInt(text_quantity);
                	javax.swing.JOptionPane.showConfirmDialog(null, "You ordered", "Order",
    						javax.swing.JOptionPane.PLAIN_MESSAGE);	
                } catch (NumberFormatException e1) {
              //Will Throw exception!
              //do something! anything to handle the exception.
                	javax.swing.JOptionPane.showConfirmDialog(null, "Пожалуйста, введите число", "Неправильный ввод",
    						javax.swing.JOptionPane.PLAIN_MESSAGE);	                            }
            if  (parent.int_quantity>10){
            	javax.swing.JOptionPane.showConfirmDialog(null, "You ordered too much", "Incorrect input",
						javax.swing.JOptionPane.PLAIN_MESSAGE);	
         
            	}
            }
            
	}
		//// exceptions////
	}
/*
	void checkOrder(String model, double displayValue) {

		if ((!"".equals(model)) & (displayValue != 0)) {
			javax.swing.JOptionPane.showConfirmDialog(null, "Ваш заказ сформирован", "Статус заказа",
					javax.swing.JOptionPane.PLAIN_MESSAGE);
		} else if ("".equals(model)) {
			javax.swing.JOptionPane.showConfirmDialog(null, "Ваш заказ Не сформирован. Выберите модель",
					"Статус заказа", javax.swing.JOptionPane.PLAIN_MESSAGE);
		} else if (displayValue == 0) {
			javax.swing.JOptionPane.showConfirmDialog(null, "Ваш заказ Не сформирован. Выберите количество",
					"Статус заказа", javax.swing.JOptionPane.PLAIN_MESSAGE);
		}
	} */


