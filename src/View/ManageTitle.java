package View;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Model.Db;
import sample.view.Provider;
import sample.view.customerPanel;

public class ManageTitle extends JFrame implements ActionListener {
	
    JTextField titleIdtxt;
	JRadioButton myradios;
	JRadioButton myradios2;
	JRadioButton myradios3;
	ButtonGroup group;
	
	 String[] setStrings = {"ML", "TV", "VL"};
	
	
	private static final Object[] String = null;

	public ManageTitle() {
		this.setSize(600, 600);
		this.setVisible(true);
		
		
		GridLayout grid1 = new GridLayout(6,1);
		this.setLayout(grid1);
		
		JPanel one = new JPanel();
		this.add(one);
		
		JLabel mylabel = new JLabel("MANAGE TITLE");
		one.add(mylabel);
		mylabel.setFont(new Font("Serif", Font.PLAIN, 30));
		
		
		JPanel two = new JPanel();
		this.add(two);
		
		JLabel mylabel2 = new JLabel("TitleID");
		two.add(mylabel2);
		
	    titleIdtxt = new JTextField(10);
		two.add(titleIdtxt);
		
		
		
		
		JPanel three = new JPanel();
		this.add(three);
		
	    myradios = new JRadioButton("ML");
		three.add(myradios);
		myradios.setSelected(true);//this shows ML is selected by default when running the program.
        myradios.setActionCommand(setStrings[0]);
		
	    myradios2 = new JRadioButton("TV");
		three.add(myradios2);
		myradios2.setActionCommand(setStrings[1]);
		
	    myradios3 = new JRadioButton("VL");
		three.add(myradios3);
		myradios3.setActionCommand(setStrings[2]);
		
		 group = new ButtonGroup();
	        group.add(myradios);
	        group.add(myradios2);
	        group.add(myradios3);
		
		
		
		JPanel four = new JPanel();
		this.add(four);
		
		GridLayout mygrid3 = new GridLayout(1,1);
		four.setLayout(mygrid3);
		
		JButton mybtn = new JButton("SEARCH");
		four.add(mybtn);
		mybtn.setFont(new Font("Serif", Font.PLAIN, 20));
		mybtn.setActionCommand("search");
		mybtn.addActionListener(this);
		
		
		JPanel five = new JPanel();
		this.add(five);
		
		GridLayout mygrid = new GridLayout(1,1);
		five.setLayout(mygrid);
		
		JButton mybtn2 = new JButton("ADD NEW TITLE");
		five.add(mybtn2);
		mybtn2.setFont(new Font("Serif", Font.PLAIN, 20));
		mybtn2.setActionCommand("Addtitle");
		mybtn2.addActionListener(this);
		
		
		JPanel six= new JPanel();
		this.add(six);
		
		GridLayout mygrid2 = new GridLayout(1,1);
		six.setLayout(mygrid2);
		JButton mybtn3 = new JButton("GO BACK");
		six.add(mybtn3);
		mybtn3.setFont(new Font("Serif", Font.PLAIN, 20));
		mybtn3.setActionCommand("GOBACK");
        mybtn3.addActionListener(this);
		
		
		
		
		
		
		
		
		this.validate();
		this.repaint();
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("search")){
			this.dispose();// this code of If statement is selecting my Radio Button + Login
            if (myradios.isSelected()) { //if, the User is a Barber...
            	JOptionPane.showMessageDialog(null,"You must choose a type of account.");
                
                
            }else if ((myradios2.isSelected())) {//if the user is a customer...
            	String search="Select * from music where idMusic ='" + titleIdtxt.getText() + "'";
            	Db mydb= new Db();
            	mydb.dbsearch2(search);
               
                
            }
            if(myradios3.isSelected()){
            	String search="Select * from movies where idMovies='" + titleIdtxt.getText() + "'";
            	Db mydb= new Db();
            	mydb.dbsearch(search);
            	
            	 
                
               
            } else if (group.getSelection() == null) {//if nothing is selected...
            	JOptionPane.showMessageDialog(null,"You must choose a type of account.");
            	 
            	

      //show this message.
  }}
		
		
		
		if (e.getActionCommand().equals("GOBACK")){
	        this.dispose();
	        MainPanel mypanel = new MainPanel();
	        
		
		
	} else if(e.getActionCommand().equals("Addtitle")) {
		this.dispose();
		String[] values = {"TvSerie", "Movies", "LiveConcertVideo", "MusicMedia"};

		Object selected = JOptionPane.showInputDialog(null, "What type of media would you like to register?", "Selection", JOptionPane.DEFAULT_OPTION, null, values, "0");
		
		if(selected== values[0])  {
			
			AddTitlePanel mypanel2 = new AddTitlePanel(); }
		   
		
		else if(selected== values[1]) {
		
			AddMovie movie = new AddMovie();
		
		}
		
		else {
		if(selected== values[2]) {
			AddLiveC live = new AddLiveC();
		}
			
		else if(selected== values[3]) {
			AddMusicPanel music = new AddMusicPanel();
			
		}
		}
		
		
		
		
	}
	}

}
