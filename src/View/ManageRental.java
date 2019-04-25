package View;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
 * This class will hold the frame responsible for the Rental Management.
 */

public class ManageRental extends JFrame implements ActionListener {
	
	/*
	 * creating my constructor that will hold the frame`s attributes and operations.
	 */
	public ManageRental() {
		
		this.setVisible(true);
		this.setSize(600,600);
		
		GridLayout framegrid = new GridLayout(2, 1); //creating a GridLayout to organise all the items.
        this.setLayout(framegrid);
		
		JPanel panel1 = new JPanel();
		this.add(panel1);
		
		JLabel l1 = new JLabel("MANAGE A RENTAL");
		panel1.add(l1);
		l1.setFont(new Font("Serif", Font.PLAIN, 30));
		
		JPanel panel2 = new JPanel();
		this.add(panel2);
		
		GridLayout grid = new GridLayout(1, 2); //creating a GridLayout to organise all the items.
        panel2.setLayout(grid);
        
        //################################################################################################
        
        JPanel panel3 = new JPanel();
        panel2.add(panel3);
        
        
        
        JPanel panel4 = new JPanel();
        panel2.add(panel4);
        
        GridLayout grid2 = new GridLayout(5, 1); //creating a GridLayout to organise all the items.
        panel4.setLayout(grid2);
        
        JPanel panelH = new JPanel();
        panel4.add(panelH);
        
        JLabel returnlabel = new JLabel("Return a Rental");
        panelH.add(returnlabel);
        
        JPanel panelI = new JPanel();
        panel4.add(panelI);
        
        JLabel customerlabel = new JLabel("CustomerID");
        panelI.add(customerlabel);
        
        JTextField customeridtxt = new JTextField(10);
        panelI.add(customeridtxt);
        
        JPanel panelJ = new JPanel();
        panel4.add(panelJ);
        
        JLabel receiptlabel = new JLabel("ReceiptNumber");
        panelJ.add(receiptlabel);
        
        JTextField receiptxt = new JTextField(10);
        panelJ.add(receiptxt);
        
        JPanel panelK = new JPanel();
        panel4.add(panelK);
        
        JButton returnbtn = new JButton("RETURN");
        panelK.add(returnbtn);
        
        JPanel panelL = new JPanel();
        panel4.add(panelL);
        
        JButton gobackbtn = new JButton("GOBACK");
        panelL.add(gobackbtn);
        gobackbtn.setActionCommand("GOBACK");
        gobackbtn.addActionListener(this);
        
        GridLayout grid3 = new GridLayout(1, 7); //creating a GridLayout to organise all the items.
        panel2.setLayout(grid3);
        
        JPanel panelA = new JPanel();
        panel3.add(panelA);
        
        JLabel label1 = new JLabel("Start or Search for a Rental");
        panelA.add(label1);
        
        JPanel panelB = new JPanel();
        panel3.add(panelB);
        
        JLabel label2 = new JLabel("M.Card");
        panelB.add(label2);
        
        JTextField cardnumber = new JTextField(10);
        panelB.add(cardnumber);
        
        
        JPanel panelC = new JPanel();
        panel3.add(panelC);
        
        JLabel label3 = new JLabel("TitleID");
        panelC.add(label3);
        
        JTextField titleidtxt = new JTextField(10);
        panelC.add(titleidtxt);
        
        JPanel panelD = new JPanel();
        panel3.add(panelD);
        
        JRadioButton radio1 = new JRadioButton("VL");
        panelD.add(radio1);
        
        JRadioButton radio2 = new JRadioButton("TV");
        panelD.add(radio2);
        
        JRadioButton radio3 = new JRadioButton("ML");
        panelD.add(radio3);
        
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        
        
        JPanel panelE = new JPanel();
        panel3.add(panelE);
        
        JLabel datetxt = new JLabel("Date");
        panelE.add(datetxt);
        
        JTextField date = new JTextField(10);
        panelE.add(date);
        
        JPanel panelF = new JPanel();
        panel3.add(panelF);
        
        JLabel timeLabel = new JLabel("Time");
        panelF.add(timeLabel);
        
        JTextField timeTxt = new JTextField(10);
        panelF.add(timeTxt);
        
        
        JPanel panelG = new JPanel();
        panel3.add(panelG);
        
        JButton startbtn = new JButton("START RENTAL");
        panelG.add(startbtn);
        
        JButton searchbtn = new JButton("SEARCH");
        panelG.add(searchbtn);
        
        
        
        //################################################################################################
        
        
		
		
		this.validate();
		this.repaint();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if (e.getActionCommand().equals("GOBACK")){
        this.dispose();
        MainPanel mypanel = new MainPanel();
	}
		
	}

}
