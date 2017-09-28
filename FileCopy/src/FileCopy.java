import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class FileCopy implements ActionListener {

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
		to = new JButton("Browse");
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
		gl = new GridLayout(2,2);
		buttonpanel.setLayout(gl);
		buttonpanel.add(copyfrom);
		buttonpanel.add(displayFieldFrom);
		buttonpanel.add(from);
		buttonpanel.add(copyto);
		buttonpanel.add(displayFieldTo);
		buttonpanel.add(copy);
		
		//copypanel = new JPanel();
		//copypanel.add(to);
		
		mainwindow.add(buttonpanel);
		
		BorderLayout layoutcp = new BorderLayout();
		//copypanel.setLayout(layoutcp);
		//copypanel.add(to);
		//mainwindow.add(copypanel);
		
		mainframe.setContentPane(mainwindow);
			
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
