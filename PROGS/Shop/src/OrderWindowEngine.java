import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.JTextComponent;

public class OrderWindowEngine implements ActionListener {
	OrderWindow parent;

	// constructor
	OrderWindowEngine(OrderWindow parent) {
		this.parent = parent;
	}

	public void actionPerformed(ActionEvent e) {
		String text_quantity;
		int int_quantity;
		String selectedModel = parent.list.getName();

		text_quantity = parent.quantity.getText();

		if (text_quantity != "") {
			try {
				int_quantity = Integer.parseInt(text_quantity);
				checkOrder(selectedModel, int_quantity);

			} catch (NumberFormatException e1) {
				// Will Throw exception!
				// do something! anything to handle the exception.
				javax.swing.JOptionPane.showConfirmDialog(null, "Пожалуйста, введите число", "Неправильный ввод",
						javax.swing.JOptionPane.PLAIN_MESSAGE);
				return;
			}

		}

	}

	void checkOrder(String selectedModel, int int_quantity) {
		if (int_quantity > 10) {
			javax.swing.JOptionPane.showConfirmDialog(null, "You ordered too much", "Incorrect input",
					javax.swing.JOptionPane.PLAIN_MESSAGE);

		}
		
		if ((int_quantity > 0)&&(int_quantity < 10)) {
			javax.swing.JOptionPane.showConfirmDialog(null, "Thanks for the order" + ": " + int_quantity + " bikes of " 
					+ selectedModel + " Model", "Shop", javax.swing.JOptionPane.PLAIN_MESSAGE);

		}

	}
}

