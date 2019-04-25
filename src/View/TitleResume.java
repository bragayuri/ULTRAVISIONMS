package View;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TitleResume extends JFrame implements ActionListener {
	
	public TitleResume() {
		this.setVisible(true);
		this.setSize(600,600);
		
		
		
		
		
		
		GridLayout mygrid = new GridLayout(13,1);
		this.setLayout(mygrid);
		
		/*
		 *#########################################
		 */
		 JPanel one = new JPanel();
		 this.add(one);
		 
		 JLabel mylabel = new JLabel("TITLE RESUME");
		 one.add(mylabel);
		 mylabel.setFont(new Font("Serif", Font.PLAIN, 30));
		 
		 /*
		  * ##########################################
		  */

		 JPanel two = new JPanel();
		 this.add(two);
		 
		 JLabel l1 = new JLabel("TITLE NAME");
		 two.add(l1);
		 
		 JTextField t1= new JTextField(20);
		 two.add(t1);
		/*
		 * ############################################# 
		 */
		 
		 JPanel three = new JPanel();
		 this.add(three);
		 
		 JLabel l2 = new JLabel("TITLE TYPE");
		 three.add(l2);
		 
		 JTextField t2= new JTextField(20);
		 three.add(t2);
		 
		 /*
		  * ##############################################
		  */
		 
		 JPanel four = new JPanel();
		 this.add(four);
		 
		 JLabel l3 = new JLabel("FORMAT");
		 four.add(l3);
		 
		 JTextField t3= new JTextField(20);
		 four.add(t3);
		 
		 /*
		  * #################################################
		  */
		 
		 JPanel five = new JPanel();
		 this.add(five);
		 
		 JLabel l4 = new JLabel("ARRIVAL DATE");
		 five.add(l4);
		 
		 JTextField t4= new JTextField(20);
		 five.add(t4);
		 
		 /*
		  * ####################################################
		  */
		 
		 JPanel six = new JPanel();
		 this.add(six);
		 
		 JLabel l5 = new JLabel("GENRE");
		 six.add(l5);
		 
		 JTextField t5= new JTextField(20);
		 six.add(t5);
		 
		 /*
		  * ##########################################
		  */
		 
		 JPanel seven = new JPanel();
		 this.add(seven);
		 
		 JLabel l6 = new JLabel("DESCRIPTION");
		 seven.add(l6);
		 
		 JTextField t6= new JTextField(20);
		 seven.add(t6);
		 
		 /*
		  * ############################################
		  */
		 
		 JPanel eight = new JPanel();
		 this.add(eight);
		 
		 JLabel l7 = new JLabel("RATE");
		 eight.add(l7);
		 
		 JTextField t7= new JTextField(20);
		 eight.add(t7);
		 
		 /*
		  * #############################################
		  */
		 JPanel nine = new JPanel();
		this.add(nine);
		
		JLabel l8 = new JLabel("DIRECTOR");
		 nine.add(l8);
		 
		 JTextField t8= new JTextField(20);
		 nine.add(t8);
		 
		 /*
		  * ################################################
		  */
		 
		 JPanel ten = new JPanel();
		 this.add(ten);
		 
		 JLabel l9 = new JLabel("CAST");
		 ten.add(l9);
		 
		 JTextField t9= new JTextField(20);
		 ten.add(t9);
		 
		 /*
		  * ##################################################
		  */
		 JPanel eleven = new JPanel();
		 this.add(eleven);
		 
		 JLabel l10 = new JLabel("CLASSIFICATION");
		 eleven.add(l10);
		 
		 JTextField t10= new JTextField(20);
		 eleven.add(t10);
		 
		 /*
		  * ###################################################
		  */
		 JPanel twelve = new JPanel();
		 this.add(twelve);
		 
		 JLabel l11 = new JLabel("AVAIABILITY");
		 twelve.add(l11);
		 
		 JTextField t11= new JTextField(20);
		 twelve.add(t11);
		 
		 
		 /*
		  * ###############################################################
		  */
		 
		 JPanel fourteen = new JPanel();
		 this.add(fourteen);
		 
		 
		 
		 JButton btn1 = new JButton("UPDATE");
		 fourteen.add(btn1);
		 
		 JButton btn2 = new JButton("GO BACK");
		 fourteen.add(btn2);
		 
		 JButton btn3 = new JButton("HOME");
		 fourteen.add(btn3);
		 
		 
		 
		
		 
		
		
		
		
		
		
		this.validate();
		this.repaint();
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
