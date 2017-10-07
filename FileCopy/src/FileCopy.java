import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileCopy extends JPanel implements ActionListener {

	JLabel copyfrom, copyto;
	JButton from, copy, to;
	JPanel mainwindow, buttonpanel, copypanel;
	GridLayout gl;
	JTextField displayFieldFrom, displayFieldTo;
	JFrame mainframe;
	JFileChooser fcfrom, fcto;

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
		fcfrom = new JFileChooser();
		fcto = new JFileChooser();

		mainwindow.add(buttonpanel);
		mainframe.setContentPane(mainwindow);
		// Устанавливаем размер окна, так чтобы уместились
		// все компоненты
		mainframe.pack();
		// show window
		mainframe.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Handle buttons

		if (e.getSource() == from) {
			int returnVal = fcfrom.showOpenDialog(FileCopy.this);

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file1 = fcfrom.getSelectedFile();
				// This is where a real application would open the file.
				displayFieldFrom.setText(file1.getName());
			} else {
				displayFieldFrom.setText("Open command cancelled by user.");
			}
			displayFieldFrom.setCaretPosition(displayFieldFrom.getDocument().getLength());

		} else if (e.getSource() == copy) {
			int returnVal2 = fcto.showOpenDialog(FileCopy.this);

			if (returnVal2 == JFileChooser.APPROVE_OPTION) {
				File file2 = fcto.getSelectedFile();
				// This is where a real application would open the file.
				displayFieldTo.setText(file2.getName());
			} else {
				displayFieldTo.setText("Open command cancelled by user.");
			}
			displayFieldTo.setCaretPosition(displayFieldTo.getDocument().getLength());

		}

		else if (e.getSource() == to) {
			File source = fcfrom.getSelectedFile();
			File dest = fcto.getSelectedFile();

			try {
				Files.copy(source.toPath(), dest.toPath(), REPLACE_EXISTING);
				System.out.println("File copied successfully!");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {

		FileCopy fc = new FileCopy();
	}
}
