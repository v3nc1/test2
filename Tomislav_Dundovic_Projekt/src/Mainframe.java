import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.KeyStroke;

public class Mainframe extends JFrame {
	
	private TextPanel textPanel;
	private FormPanel formPanel;
	
	
	
	public Mainframe()  {
		
		super("Money Converter");
		
		setLayout(new BorderLayout());
		
		setJMenuBar(createMenuBar());

		
			
		textPanel= new TextPanel();		
		formPanel = new FormPanel();
		
		
		//formPanel.setBackground(Color.CYAN);
		
		
		
		formPanel.setFormListener(new FormListener() {

			@Override
			public void formEventOccurred(FormEvent ev) {
				String conv = ev.getConv();
				
				textPanel.appendText(conv + ": ");
				
			}
			
		});
		
		
		add(formPanel,BorderLayout.CENTER);
		add(textPanel,BorderLayout.NORTH);
		
		
		
		
		
		
		
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		
	}
	

	private JMenuBar createMenuBar() {
		
		JMenuBar menibar = new JMenuBar();
		
		
		JMenu meni = new JMenu("Odabir");
		
		
		JMenuItem izlaz = new JMenuItem ("Izlazak");
		
	
		meni.add(izlaz);
		
		
		izlaz.setMnemonic(KeyEvent.VK_K);
		
		izlaz.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
		
		izlaz.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int action = JOptionPane.showConfirmDialog(Mainframe.this,
						"Da li želite potvrditi izlazak iz aplikacije?",
						"Izlaz iz App",JOptionPane.OK_CANCEL_OPTION);
				
				if (action == JOptionPane.OK_OPTION)
				System.exit(0);
				
			};
	});
		
		
		
		
		
		
		JMenu prikaz = new JMenu("Prikaži");
		
		
		menibar.add(meni);
		
		return menibar;
		
		
	
	
	
	

	
	}
	}


	
	
	

	
	
	

	
	

