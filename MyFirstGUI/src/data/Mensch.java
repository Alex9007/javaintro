package data;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import javax.crypto.EncryptedPrivateKeyInfo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Mensch {
	
	private static ArrayList<Mensch> menschlist = new ArrayList<>();
	

	private String vorname;
	private String nachname;
	private String adresse;
	private Integer plz;
	private String ort;

	public Mensch() {
		
	}
	public Mensch(String vorname, String nachname, Integer plz, String adresse, String ort) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.plz = plz;
		this.adresse = adresse;
		this.ort = ort;
		
	}

	//
	@Override
	public String toString() {
		return getVorname() + " " + getNachname() + " " + getPlz() + " " +  getAdresse() +" "+ getOrt();
	}

	public String getVorname() {
		if (vorname == null)
			return "";
		else
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		if (nachname == null)
			return "";
		else
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getAdresse() {
		if (adresse == null)
			return "";
		else
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getOrt() {
		if(ort == null)
			return "";
		return ort;
	}
	public void setOrt(String ort) {
		
		this.ort = ort;
	}
	public Integer getPlz() {
		return plz;
	}
	public void setPlz(Integer plz) {
		this.plz = plz;
	}
	public static ArrayList<Mensch> getMenschlist() {
		return menschlist;
	}
	public static void Write2Jason() throws IOException{
		Writer writer1 = new FileWriter("C:\\temp\\output.json");
		Gson gson1 = new GsonBuilder().serializeNulls().create();
		gson1.toJson(Mensch.getMenschlist(), writer1);
		writer1.flush();
		writer1.close();
		System.out.println("Eintrag wurde geschrieben");
	} 


}
