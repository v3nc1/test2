import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL url = new URL("http://api.hnb.hr/tecajn/v1");
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		String line;
		
		while((line = in.readLine()) != null) {
			System.out.println(line);
			
		}
		
		in.close();
		
		new Mainframe();
		
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run()  {
				
				
			}
		});

	}

}
