import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel {
	
	protected static final String CYAN = null;
	protected static final Color Color = null;
	private JLabel trenutna;
	private JLabel zeljena;
	private JLabel unos;
	private JButton convert;
	private JTextField unostxt;
	private JComboBox trenbox,zeljbox;
	private JCheckBox boja,boja2;
	private JButton clear;
	
	private JButton azuriraj;
	
	//private JLabel ime;
	//private JTextField imetext;
	//private JLabel banka;
	//private JTextField bankatext;
	
	private FormListener formListener;
	
	public FormPanel () {
		
		Dimension dim = getPreferredSize();
		dim.width=250;
		setPreferredSize(dim);
		//ime = new JLabel ("Vaše ime");
		//banka = new JLabel ("Vaša banka");
		trenutna = new JLabel("Odabir trenutne valute:  ");
		zeljena = new JLabel("Odabir zeljene valute:  ");
		unos = new JLabel("Iznos valute:  ");
		convert = new JButton("Pretvori	");
		azuriraj = new JButton("Ažuriraj");
		unostxt = new JTextField();
		//imetext = new JTextField();
		//bankatext = new JTextField();
		trenbox = new JComboBox();
		zeljbox = new JComboBox();
		boja = new JCheckBox("Cyan", true);
		boja2 = new JCheckBox("Default", false);
		clear = new JButton("Izbriši");
		
		
		
		
		
		
		
		
		HashMap<String, Integer> valute = new HashMap<String, Integer>();
		
		valute.put("HRK",4);
		valute.put("USD",6);
		valute.put("EUR",7);
		
		
		//System.out.println(valute);
		
		
		
		
		unostxt.setPreferredSize( new Dimension( 200, 24 ) );
		
		DefaultComboBoxModel zelj = new DefaultComboBoxModel();
		zelj.addElement("HRK");
		zelj.addElement("USD");
		zelj.addElement("EUR");
	
		zeljbox.setModel(zelj);
		
		
		
		DefaultComboBoxModel tren = new DefaultComboBoxModel();
		tren.addElement("HRK");
		tren.addElement("USD");
		tren.addElement("EUR");
		
		trenbox.setModel(tren);
		
		
		
		layoutComponents();
		
		boja.setSelected(false);
		
		
		
		
		boja.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				boolean isTicked = boja.isSelected();
				setBackground(Color.CYAN);
				
			}
			
			
		});
		
		
		
		boja2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				boolean isTicked = boja2.isSelected();
				setBackground(Color);
				
			}
			
			
			
		});
		
		
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				
				unostxt.setText(null);
			}
			
			
		});
		
		azuriraj.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Mainframe2 frame2 = new Mainframe2();
				frame2.setVisible(true);
				
			}
			
			
		});
	
		
				
				convert.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String Conv = unostxt.getText();
						//ono sto je uneseno puta odabrano
						FormEvent ev = new FormEvent(this,Conv);
						
						if(formListener != null) {
							formListener.formEventOccurred(ev);
						
					}
					
					
					}});
				
				Border innerBorder = BorderFactory.createTitledBorder("Unos valuta");
				Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
				setBorder(BorderFactory.createCompoundBorder(outerBorder , innerBorder));
				
				
				unostxt.setBorder(BorderFactory.createLineBorder(Color.orange));
				trenbox.setBorder(BorderFactory.createLineBorder(Color.orange));
				zeljbox.setBorder(BorderFactory.createLineBorder(Color.orange));
				
		

				}
		
		
		public void definiranjevaluta () {
			
			
			
			
		}
		
		public void layoutComponents() {
			
			setLayout(new GridBagLayout());
			
			GridBagConstraints gc = new GridBagConstraints();
			
			
			gc.gridy = 0;
			
			gc.weightx = 1;
			gc.weighty = 0.1;
			
			
			gc.gridx = 0;
			
			
			
			gc.fill = GridBagConstraints.NONE;
			gc.anchor = GridBagConstraints.LINE_END;
			gc.insets = new Insets(0, 0, 0, 0);
			
			add(trenutna, gc);
			
			
			gc.gridx = 1;
			gc.gridy = 0;
			gc.anchor = GridBagConstraints.LINE_START;
			gc.insets = new Insets(0, 0, 0, 0);
			add(trenbox, gc);
			
			///////////////
			
			gc.gridy ++;	
			
			gc.weightx = 1;
			gc.weighty = 0.1;
			
			
				
			gc.gridx = 0;
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.LINE_END;
			add(zeljena, gc);
			
			
			gc.gridx = 1;
			gc.anchor = GridBagConstraints.LINE_START;
			gc.insets = new Insets(0, 0, 0, 0);
			add(zeljbox,gc);
			////////////////////////////
			
			gc.gridy++;
			
			gc.weightx = 1;
			gc.weighty = 0.2;
			
			
			
			gc.gridx = 0;
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.FIRST_LINE_END;
			add(unos, gc);
				
				
			gc.gridx = 1;
			gc.anchor = GridBagConstraints.FIRST_LINE_START;
			gc.insets = new Insets(0, 0, 0, 0);
			add(unostxt,gc);
			//////////////////////////////////////
			gc.gridy++;
			
			gc.weightx = 1;
			gc.weighty = 0.2;
			
			
					
					
			gc.gridx = 1;
			gc.anchor = GridBagConstraints.FIRST_LINE_START;
			gc.insets = new Insets(0, 0, 0, 0);
			add(convert,gc);
			
			
			///////////////////////////////////
			gc.gridy++;
			
			gc.weightx = 1;
			gc.weighty = 0.2;
				
				
			gc.gridx = 0;
			gc.insets = new Insets(0, 0, 0, 0);
			gc.anchor = GridBagConstraints.FIRST_LINE_END;
			add(boja, gc);
						
						
			gc.gridx = 1;
			gc.anchor = GridBagConstraints.FIRST_LINE_START;
			gc.insets = new Insets(0, 0, 0, 0);
			add(boja2,gc);
			
			gc.gridy++;
			
			gc.weightx = 1;
			gc.weighty = 0.2;
					
							
							
			gc.gridx = 1;
			gc.anchor = GridBagConstraints.FIRST_LINE_START;
			gc.insets = new Insets(0, 0, 0, 0);
			add(clear,gc);
			
			gc.gridy++;
			
			gc.weightx = 1;
			gc.weighty = 0.3;
					
							
							
			gc.gridx = 1;
			gc.anchor = GridBagConstraints.FIRST_LINE_START;
			gc.insets = new Insets(0, 0, 0, 0);
			add(azuriraj,gc);
			
			
		
		
	}
		public void setFormListener(FormListener listener) {
			this.formListener = listener;
		}
		
		
		public void TextPanel() {
			
			
		}
			
		}
		


		
		
		
	


