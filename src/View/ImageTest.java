package View;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageTest extends JFrame implements ActionListener {
	
	public ImageTest() {
		this.setVisible(true);
		this.setSize(300,300);
		
		JPanel mypanel = new JPanel();
		this.add(mypanel);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\chefy\\OneDrive\\Desktop\\woman3.png");
		Image newImage = icon.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
		
		
		
		JLabel label = new JLabel(icon);
		mypanel.add(label);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
