//Yuri Braga 2017141

package View;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


 /*
  * This class will hold the frame for Manage Rental task.
  * From here it will be possible to start, to search, to return a Media. Also to go back to the main Panel.
  */
public class ManageARental extends JFrame implements ActionListener {

	
	// My Constructor setting attributes to the new frame.
	public ManageARental() {

		this.setVisible(true);
		this.setSize(600, 600);

		GridLayout framegrid = new GridLayout(2, 1); // creating a GridLayout to organise all the items.
		this.setLayout(framegrid);

		JPanel panel1 = new JPanel();
		this.add(panel1);

		JLabel l1 = new JLabel("MANAGE A RENTAL");
		panel1.add(l1);
		l1.setFont(new Font("Serif", Font.PLAIN, 30));

		JPanel panel2 = new JPanel();
		this.add(panel2);

		GridLayout grid = new GridLayout(5, 1); // creating a GridLayout to organise all the items.
		panel2.setLayout(grid);

		
		// Here starts my Buttons which has an Action Listener to detect User decisions.
		
		JButton startbtn = new JButton("START RENTAL");
		panel2.add(startbtn);
		startbtn.setActionCommand("START");
		startbtn.addActionListener(this);

		JButton searchbtn = new JButton("SEARCH");
		panel2.add(searchbtn);
		searchbtn.setActionCommand("SEARCH");
		searchbtn.addActionListener(this);

		JButton returnbtn = new JButton("RETURN");
		panel2.add(returnbtn);

		JPanel panelL = new JPanel();
		panel2.add(panelL);

		JButton gobackbtn = new JButton("GOBACK");
		panelL.add(gobackbtn);
		gobackbtn.setActionCommand("GOBACK");
		gobackbtn.addActionListener(this);

		this.validate();
		this.repaint();

	}
	
	// This method will define the actions to be taken according to the use ActionCommand to be sent.
	//If the button GoBack is selected.User will be directed to the Main Panel.
	//If Start is selected, user will be directed to Start a new Rental panel.
	//If Return is selected.User will be sent to the Returning procedures.
	//if Search is selected. User will open a Search panel to visualise all the current rentals.

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("GOBACK")) {
			this.dispose();
			MainPanel mypanel = new MainPanel();

		} else if (e.getActionCommand().equals("START")) {

			AddRental newrental = new AddRental();

		} else if (e.getActionCommand().equals("SEARCH")) {
			
			SearchRental myrental = new SearchRental();
		}
		

	}

}
