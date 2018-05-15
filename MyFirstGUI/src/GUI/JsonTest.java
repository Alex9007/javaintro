package GUI;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import data.Mensch;

public class JsonTest {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("C:\\temp\\output.json");
		
		Gson gson = new GsonBuilder().serializeNulls().create();
		//gson.toJson("Hallo", writer);
		//gson.toJson(12345, writer);
		//
		ArrayList<Mensch> Personen = new ArrayList<>();
		Mensch p = new Mensch();
		p.setVorname("Alex");
		p.setNachname("Feng");
		p.setOrt("Klosterneuburg");
		p.setAdresse("Hafnergraben");
		p.setPlz(1190);
		//
		Personen.add(p);
		Personen.add(p);
		Personen.add(p);
		//
		gson.toJson(Personen, writer);
		
		writer.flush();
		writer.close();
		
		Reader r = new FileReader("C:\\temp\\output.json");
		//
		ArrayList<Mensch> personenRead = new ArrayList<>();
		//
		Type listType = new TypeToken <ArrayList<Mensch>>(){}.getType();
		personenRead = gson.fromJson(r, listType);
		//
		for (Mensch p1 : personenRead)
			System.out.println(p1);
		
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
