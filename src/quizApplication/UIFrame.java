package quizApplication;
/*
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

public class UIFrame extends JFrame{
	// why constants should be private?
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 800;
	
	private JPanel panel, radioPanel;
	
	private ButtonGroup bg;
	private JRadioButton A, B, C, D; // four answers
	
	private JTextField question; 
	
	private JLabel a, b; // not sure what it's for
	private JButton quizStart;
	
	private Quiz q; 
	
	
	public UIFrame(){
		q = new Quiz();
		setTitle("New Quiz\n");
		createTextFields();
		createRB();
		createButtons();
		createPanels();
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(true);
		setLocationRelativeTo(null); // centered
		
	}
	
	void createTextFields(){
		a = new JLabel("A : ");
		b = new JLabel("B : ");
		question = new JTextField(3);
		

		
	}
	
	private void createRB(){
		bg = new ButtonGroup();

		A = new JRadioButton("option A");
		B = new JRadioButton("option B");
		C = new JRadioButton("option C");
		D = new JRadioButton("option D");
		
		bg.add(A);
		bg.add(B);
		bg.add(C);
		bg.add(D);
	}
	
	private void createBtn(){
		quizStart = new JButton("start the quiz");
		
		class calcList implements ActionListener{
			
			public void actionPerformed(ActionEvent e){
				
				Question q1 = new Question("1+2 = ?", "1", "2", "3", "4", new Answer("3"));
				
				char button; //  = null;
				if(A.isSelected()) button = 'A';
				if(B.isSelected()) button = 'B';
				if(C.isSelected()) button = 'C';
				if(D.isSelected()) button = 'D';

				
				JOptionPane.showMessageDialog(null ,"result is : " + q1.getAnswer());
			}
		}
		
		ActionListener listen = new calcList();
		quizStart.addActionListener(listen);
		
	}
	
	private void createPanels(){
		radioPanel = new JPanel();
		radioPanel.add(A);
		radioPanel.add(B);
		radioPanel.add(C);
		radioPanel.add(D); // can do for each instead?
		radioPanel.add(quizStart);
		
		panel = new JPanel();
		panel.add(a);
		panel.add(b);
		panel.add(radioPanel);
		add(panel);
		
		
	}
	
	
	void createButtons(){
		
	}
	


	
	
}
*/