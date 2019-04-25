package View;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import Model.Db;

public class AddTitlePanel extends JFrame implements ActionListener {
	
	 JTextField t1;
	 JTextField t2;
	 JTextField t3;
	 JTextField t4;
	 JTextField t5;
	 JTextField t6;
	 JTextField t7;
	 JTextField t8;
	 JTextField t9;
	 JTextField t10;
	 JTextField t11;
	 JTextField t12;
	
	public AddTitlePanel() {
		
		this.setVisible(true);
		this.setSize(600,600);
		
		GridLayout mygrid = new GridLayout(14,1);
		this.setLayout(mygrid);
		
		/*
		 *#########################################
		 */
		 JPanel one = new JPanel();
		 this.add(one);
		 
		 JLabel mylabel = new JLabel("ADD NEW TV TITLE");
		 one.add(mylabel);
		 
		 /*
		  * ##########################################
		  */

		 JPanel two = new JPanel();
		 this.add(two);
		 
		 JLabel l1 = new JLabel("TITLE NAME");
		 two.add(l1);
		 
		  t1= new JTextField(20);
		 two.add(t1);
		/*
		 * ############################################# 
		 */
		 
		 JPanel three = new JPanel();
		 this.add(three);
		 
		 JLabel l2 = new JLabel("TITLE TYPE");
		 three.add(l2);
		 
		  t2= new JTextField("TV Box Set        ");
		 three.add(t2);
		 
		 /*
		  * ##############################################
		  */
		 
		 JPanel four = new JPanel();
		 this.add(four);
		 
		 JLabel l3 = new JLabel("FORMAT");
		 four.add(l3);
		 
		  t3= new JTextField("Cd,Blue-Ray                               ");
		 four.add(t3);
		 
		 /*
		  * #################################################
		  */
		 
		 JPanel five = new JPanel();
		 this.add(five);
		 
		 JLabel l4 = new JLabel("YEAR");
		 five.add(l4);
		 
		 t4= new JTextField(20);
		 five.add(t4);
		 
		 /*
		  * ####################################################
		  */
		 
		 JPanel six = new JPanel();
		 this.add(six);
		 
		 JLabel l5 = new JLabel("GENRE");
		 six.add(l5);
		 
		 t5= new JTextField(20);
		 six.add(t5);
		 
		 /*
		  * ##########################################
		  */
		 
		 JPanel seven = new JPanel();
		 this.add(seven);
		 
		 JLabel l6 = new JLabel("Description");
		 seven.add(l6);
		 
		 t6= new JTextField(20);
		 seven.add(t6);
		 
		 /*
		  * ############################################
		  */
		 
		 JPanel eight = new JPanel();
		 this.add(eight);
		 
		 JLabel l7 = new JLabel("ARRIVAL DATE");
		 eight.add(l7);
		 
		 t7= new JTextField(20);
		 eight.add(t7);
		 
		 /*
		  * #############################################
		  */
		 JPanel nine = new JPanel();
		this.add(nine);
		
		JLabel l8 = new JLabel("Rate");
		 nine.add(l8);
		 
		 t8= new JTextField(20);
		 nine.add(t8);
		 
		 /*
		  * ################################################
		  */
		 
		 JPanel ten = new JPanel();
		 this.add(ten);
		 
		 JLabel l9 = new JLabel("DIRECTOR");
		 ten.add(l9);
		 
		 t9= new JTextField(20);
		 ten.add(t9);
		 
		 /*
		  * ##################################################
		  */
		 JPanel eleven = new JPanel();
		 this.add(eleven);
		 
		 JLabel l10 = new JLabel("TV STUDIO");
		 eleven.add(l10);
		 
		 t10= new JTextField(20);
		 eleven.add(t10);
		 
		 /*
		  * ###################################################
		  */
		 JPanel twelve = new JPanel();
		 this.add(twelve);
		 
		 JLabel l11 = new JLabel("SEASON");
		 twelve.add(l11);
		 
		 t11= new JTextField(20);
		 twelve.add(t11);
		 
		 /*
		  * ##########################################################
		  */
		 
		 JPanel thirteen = new JPanel();
		 this.add(thirteen);
		 
		 JLabel l12 = new JLabel("EPISODE N");
		 thirteen.add(l12);
		 
	     t12= new JTextField(20);
		 thirteen.add(t12);
		 
		 /*
		  * ###############################################################
		  */
		 
		 JPanel fourteen = new JPanel();
		 this.add(fourteen);
		 
		 
		 
		 JButton btn1 = new JButton("ADDTITLE");
		 fourteen.add(btn1);
		 btn1.setActionCommand("ADDTITLE");
	     btn1.addActionListener(this);
		 
		 JButton btn2 = new JButton("GO BACK");
		 fourteen.add(btn2);
		 
		 JButton btn3 = new JButton("HOME");
		 fourteen.add(btn3);
		 
		 
		 
		
		 
		
		
		
		
		
		
		this.validate();
		this.repaint();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("ADDTITLE")) {
            String a =t1.getText();
            String b = t2.getText();
            String c = t3.getText();
            String d = t4.getText();
            String E = t5.getText();
            String f = t6.getText();
            String g = t7.getText();
            String h = t8.getText();
            String i = t9.getText();
            String j = t10.getText();
            String k = t11.getText();
            String l = t12.getText();
		
            String message = "INSERT INTO `ultravision`.`tvserie` (`MediaName`, `MediaType`,`Format`,`Year`,`Genre`,`Description`,`ArrivalDate`,`Rate`,`Director`,`TvStudio`,`Season`,`EpisodeNumber`) "
            		+ "VALUES ('" + a + "','" + b + "','" + c + "', '" + d + "', '" + E + "','" + f + "','" + g + "','" + h + "','" + i + "','" + j + "', '" + k + "','"+ l +"');";

          
          Db mydb = new Db();
          mydb.DbInsertCustomer(message);
		
	}

	}
	
}
