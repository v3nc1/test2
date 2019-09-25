import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Mainframe2 extends JFrame{
	
	private TextPanel2 pane;
	
	
	public Mainframe2() {
		
		super("Ažuriranje Vremena");
		
		
		setLayout(new BorderLayout());
		

		
			
		TextPanel2 pane= new TextPanel2();	
		
		setSize(600, 500);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(pane,BorderLayout.CENTER);
		
		
		
	}

}
