package GridBagLayout;
import java.awt.*;


public class GridBagLayout {
	// ����� GridBagLayout ��� ������ ����
	GridBagLayout gb = new GridBagLayout();
	this.setLayout(gb);
	// ������ ��������� ������ GridBagConstraints
	// ��� ������ ���� ����� ��������� ��� ������ ����������
	// ������� ����������� � ������
	GridBagConstraints constr = new GridBagConstraints();
	//����� ����������� ��� ������ ����� ������������
	// ���������� x � �������
	constr.x=0;
	// ���������� y � �������
	constr.y=0;
	// ��� ������ ����� ����� �� ������, ��� ����������� ������
	constr.gridheight =1;
	// ��� ������ ����� ������ ������ ������ 6 ����������� �����
	constr.gridwidth= 6;
	// ��������� �� ������������ ������
	constr.fill= constr.BOTH;
	// ��������� �� �����������, ������� ����� �����������������
	constr.weightx = 1.0;
	// ��������� �� ���������, ������� ����� �������� ���������
	constr.weighty = 1.0;
	// ������� ���������� ������ ������
	constr.anchor=constr.CENTER;
	displayField = new JTextField();
	// ������������� ����������� ��� ���� �����
	gb.setConstraints(displayField,constr);
	// ��������� ���� ����� � ����
	windowContent.add(displayField);
}
