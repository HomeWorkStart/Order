import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class FileCopy implements ActionListener {

	private static final Object PAGE_START = null;
	private static final Object PAGE_END = null;
	JLabel copyfrom,copyto;
	JButton from, copy, to;
	JPanel mainwindow, buttonpanel, copypanel;
	GridLayout gl;
	JTextField displayFieldFrom, displayFieldTo;
	JFrame mainframe;
	
	FileCopy(){
		
		copyfrom = new JLabel("Copy from:");
		displayFieldFrom = new JTextField(30);
		from = new JButton("Browse");
		copyto = new JLabel("Copy to:");
		displayFieldTo = new JTextField(30);
		to = new JButton("Copy");
		copy = new JButton("Browse");
		
		//creating panels
		mainframe = new JFrame("File copy");
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.pack();
		mainframe.setVisible(true);
		
		mainwindow = new JPanel();
		BorderLayout bl = new BorderLayout();
		mainwindow.setLayout(bl);
		
		buttonpanel = new JPanel();
		gl = new GridLayout(3,3);
		buttonpanel.setLayout(gl);
		buttonpanel.add(copyfrom);
		buttonpanel.add(displayFieldFrom);
		buttonpanel.add(from);
		buttonpanel.add(copyto);
		buttonpanel.add(displayFieldTo);
		buttonpanel.add(copy);
		
		//copypanel = new JPanel();
		buttonpanel.add(to);
		
		mainwindow.add(buttonpanel,PAGE_START);
		
		//BorderLayout layoutcp = new BorderLayout();
		//copypanel.setLayout(layoutcp);
		//mainwindow.add(copypanel,PAGE_END);
		
		mainframe.setContentPane(mainwindow);
		//Устанавливаем размер окна, так чтобы уместились
		//все компоненты
		mainframe.pack();
		//show window
		mainframe.setVisible(true);
			
	}
	
		@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileCopy fc = new FileCopy();
	}
}
