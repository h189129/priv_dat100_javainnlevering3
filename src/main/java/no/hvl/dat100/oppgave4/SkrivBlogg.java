package no.hvl.dat100.oppgave4;

import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.dat100.oppgave3.Blogg;

public class SkrivBlogg {


	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        
		try (PrintWriter skriver = new PrintWriter(mappe + "/" + filnavn)) {
            skriver.print(samling.toString());
            return true;
        } catch (IOException e) {
            System.err.println("Feil ved skriving til filen: " + mappe + "/" + filnavn);
            e.printStackTrace();
            return false;
        }
	}
}
