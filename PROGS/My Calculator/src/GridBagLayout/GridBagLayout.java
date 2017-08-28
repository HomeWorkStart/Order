package GridBagLayout;
import java.awt.*;


public class GridBagLayout {
	// «адаЄм GridBagLayout дл€ панели окна
	GridBagLayout gb = new GridBagLayout();
	this.setLayout(gb);
	// —оздаЄм экземпл€р класса GridBagConstraints
	// Ёти строки кода нужно повторить дл€ каждой компоненты
	// котора€ добавл€етс€ в €чейку
	GridBagConstraints constr = new GridBagConstraints();
	//задаЄм ограничени€ дл€ строки ввода калькул€тора
	// координата x в таблице
	constr.x=0;
	// координата y в таблице
	constr.y=0;
	// эта €чейка имеет такую же высоту, как стандартные €чейки
	constr.gridheight =1;
	// эта €чейка имеет ширину равную ширине 6 стандартных €чеек
	constr.gridwidth= 6;
	// заполн€ем всЄ пространство €чейки
	constr.fill= constr.BOTH;
	// пропорци€ по горизонтали, которую будет заниматькомпонент
	constr.weightx = 1.0;
	// пропорци€ по вертикали, которую будет занимать компонент
	constr.weighty = 1.0;
	// позици€ компонента внутри €чейки
	constr.anchor=constr.CENTER;
	displayField = new JTextField();
	// устанавливаем ограничени€ дл€ пол€ ввода
	gb.setConstraints(displayField,constr);
	// добавл€ем поле ввода в окно
	windowContent.add(displayField);
}
