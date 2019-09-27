import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.xml.XMLConstants;
import javax.xml.crypto.dsig.XMLObject;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;



public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL url = new URL("http://api.hnb.hr/tecajn/v1?valuta=EUR");

		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		
		String line=new Scanner(url.openStream(),"UTF-8").useDelimiter("\\A").next();
		System.out.println(line);
		StringBuilder str=new StringBuilder(line);
		
		str.deleteCharAt(0);
		str.deleteCharAt(str.length()-1);
		line=str.toString();
		
		Gson g=new Gson();
		JsonObject json=new JsonParser().parse(line).getAsJsonObject();
		
		
			
		
		Tecaj tec=new Tecaj(json.get("Datum primjene").getAsString(),json.get("Država").getAsString(),
				json.get("Šifra valute").getAsInt(),json.get("Valuta").getAsString(),json.get("Jedinica").getAsInt(),Float.parseFloat(Tecaj.zamjenaTocke(json.get("Kupovni za devize"))), 
				Float.parseFloat(Tecaj.zamjenaTocke(json.get("Srednji za devize"))), Float.parseFloat(Tecaj.zamjenaTocke(json.get("Prodajni za devize"))));
	
		System.out.println("Datum: "+ tec.datum);
		System.out.println("Država: "+ tec.drzava);
		System.out.println("Valuta: "+ tec.valuta);
		System.out.println("Kupovni: "+ tec.kupovni);
		System.out.println("Srednji: "+ tec.srednji);
		System.out.println("Prodajni: "+ tec.prodajni);
//		for(String i:ob) {
//			
//		}
		
		/*
		while ((line = in.readLine()) != null) {
			
			
			try {
				//Object o=pars.parse(line);
				
			//	JSONArray jArr=(JSONArray) o;
				
				System.out.println("Ovo je JSON: ");
				
				for(String i:pars.parse(line)) {
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		in.close();*/
		//System.out.println(line);

		
		new Mainframe();

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {

			}
		});

	}

}
