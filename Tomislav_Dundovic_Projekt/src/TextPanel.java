import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel{
	
	private JTextArea area;
	
	public TextPanel () {
		
	area = new JTextArea();
	

	setLayout(new BorderLayout());
	
	add(new JScrollPane(area), BorderLayout.NORTH);
	
	
	  area.setPreferredSize(new Dimension(100, 100));
	  area.setMinimumSize(new Dimension(100, 100));
	  area.setBounds(0, 0, 100, 100);
	
	}

	public void appendText(String text) {
		// TODO Auto-generated method stub
		
		area.append(text);
		
	}

	

}
