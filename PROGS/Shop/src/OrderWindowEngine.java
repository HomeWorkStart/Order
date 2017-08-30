import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class OrderWindowEngine implements ActionListener {
	OrderWindow parent;

	// constructor
	OrderWindowEngine() {
		this.parent = parent;
	}

	// @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clickedButton = (JButton) e.getSource();
		String CountNumber = parent.quantity.getText();
		String model = parent.list.getName();
		String selectedmodel;
		double displayValue = 0;

		if (!"".equals(CountNumber)) {

			try {
				displayValue = Double.parseDouble(CountNumber);
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				javax.swing.JOptionPane.showConfirmDialog(null, "Пожалуйста, введите число", "Неправильный ввод",
						javax.swing.JOptionPane.PLAIN_MESSAGE);
				return;
			}
		}
		Object src = e.getSource();
		// Для каждой кнопки арифметического действия
		// запомнить его: +, -, /, или *, сохранить текущее число
		// в переменной currentResult, и очистить дисплей
		// для ввода нового числа
		
		if (src == parent.quantity) {

		}

		if (src == parent.list.getName()) {
			selectedmodel =
		}
		
if (src == parent.button_order) {
			
			checkOrder
		}
		//// exceptions////
	}

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
	}
}
