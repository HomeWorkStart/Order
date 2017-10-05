import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class FileCopy extends JPanel implements ActionListener {

	private static final Object PAGE_START = null;
	private static final Object PAGE_END = null;
	JLabel copyfrom, copyto;
	JButton from, copy, to;
	JPanel mainwindow, buttonpanel, copypanel;
	GridLayout gl;
	JTextField displayFieldFrom, displayFieldTo;
	JFrame mainframe;
	JFileChooser fc;

	FileCopy() {

		copyfrom = new JLabel("Copy from:");
		displayFieldFrom = new JTextField(30);
		from = new JButton("Browse");
		copyto = new JLabel("Copy to:");
		displayFieldTo = new JTextField(30);
		to = new JButton("Copy");
		copy = new JButton("Browse");

		// creating panels
		mainframe = new JFrame("File copy");
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.pack();
		mainframe.setVisible(true);

		mainwindow = new JPanel();
		BorderLayout bl = new BorderLayout();
		mainwindow.setLayout(bl);

		buttonpanel = new JPanel();
		gl = new GridLayout(3, 3);
		buttonpanel.setLayout(gl);
		buttonpanel.add(copyfrom);
		buttonpanel.add(displayFieldFrom);
		buttonpanel.add(from);
		from.addActionListener(this);
		buttonpanel.add(copyto);
		buttonpanel.add(displayFieldTo);
		buttonpanel.add(copy);
		copy.addActionListener(this);
		buttonpanel.add(to);
		to.addActionListener(this);

		// Create a file chooser
		fc = new JFileChooser();

		mainwindow.add(buttonpanel, PAGE_START);

		// BorderLayout layoutcp = new BorderLayout();
		// copypanel.setLayout(layoutcp);
		// mainwindow.add(copypanel,PAGE_END);

		mainframe.setContentPane(mainwindow);
		// Устанавливаем размер окна, так чтобы уместились
		// все компоненты
		mainframe.pack();
		// show window
		mainframe.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Handle copy button action.

		if (e.getSource() == from) {
			int returnVal = fc.showOpenDialog(FileCopy.this);

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				// This is where a real application would open the file.
				displayFieldFrom.setText(file.getName());
			} else {
				displayFieldFrom.setText("Open command cancelled by user.");
			}
			displayFieldFrom.setCaretPosition(displayFieldFrom.getDocument().getLength());

		} else if (e.getSource() == copy) {
			int returnVal2 = fc.showOpenDialog(FileCopy.this);

			if (returnVal2 == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				// This is where a real application would open the file.
				displayFieldTo.setText(file.getName());
			} else {
				displayFieldTo.setText("Open command cancelled by user.");
			}
			displayFieldTo.setCaretPosition(displayFieldTo.getDocument().getLength());

		}
		
		else if (e.getSource() == to) {
			int returnVal3 = fc.showOpenDialog(FileCopy.this);

			if (returnVal3 == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				// This is where a real application would open the file.
				displayFieldTo.setText(file.getName());
			} else {
				displayFieldTo.setText("Open command cancelled by user.");
			}
			displayFieldTo.setCaretPosition(displayFieldTo.getDocument().getLength());

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileCopy fc = new FileCopy();
	}
}
