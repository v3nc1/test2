import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel2 extends JPanel{
	
	private JTextArea area2;
	
	public TextPanel2() {
		
		
		area2 = new JTextArea(50,20);
		
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(area2), BorderLayout.NORTH);
		
		  area2.setPreferredSize(new Dimension(100, 100));
		  area2.setMinimumSize(new Dimension(100, 100));
		  area2.setBounds(0, 0, 100, 100);
	}




	
		
	}