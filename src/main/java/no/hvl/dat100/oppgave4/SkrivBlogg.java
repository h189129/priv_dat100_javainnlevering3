package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.oppgave3.Blogg;

public class SkrivBlogg {


	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        
		try (PrintWriter skriver = new PrintWriter(mappe + "/" + filnavn)) {
            skriver.print(samling.toString());
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
	}
}
