import java.io.Serializable;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Tecaj implements Serializable{
	
	int brTecaja;
	String datum;
	String drzava;
	int sifraValute;
	String valuta;
	int jedinica;
	float kupovni;
	float srednji;
	float prodajni;
	
public Tecaj( String datum, String drzava, int sifraValute, String valuta, int jedinica,
		float kupovni, float srednji, float prodajni) {
		
		
		this.datum = datum;
		this.drzava = drzava;
		this.sifraValute = sifraValute;
		this.valuta = valuta;
		this.jedinica = jedinica;
		this.kupovni = kupovni;
		this.srednji = srednji;
		this.prodajni = prodajni;
	}
//		"Broj te?ajnice":"187"
//			"Datum primjene":"27.09.2019"
//				"Država":"EMU"
//					"Šifra valute":"978"
//						"Valuta":"EUR"
//							"Jedinica":1
//							"Kupovni za devize":"7,383097"
//								"Srednji za devize":"7,405313"
//									"Prodajni za devize":"7,427529"
		
		
		
public static String zamjenaTocke(JsonElement ob) {
	
	String val=ob.getAsString();
	
	String zamjena=val.replace(",", ".");
	
	return zamjena;
}

}
