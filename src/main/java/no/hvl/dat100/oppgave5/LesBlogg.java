package no.hvl.dat100.oppgave5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import no.hvl.dat100.oppgave2.Bilde;
import no.hvl.dat100.oppgave2.Tekst;
import no.hvl.dat100.oppgave3.Blogg;

public class LesBlogg {

	protected static String TEKST = "TEKST";
	protected static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {

		Blogg blogg = null;

        try (BufferedReader leser = new BufferedReader(new FileReader(mappe + "/" + filnavn))) {
            String linje = leser.readLine();
            int antall = Integer.parseInt(linje);
            blogg = new Blogg(antall);

            for (int i = 0; i < antall; i++) {
                linje = leser.readLine();
                if (linje.equals("TEKST")) {
                    int id = Integer.parseInt(leser.readLine());
                    String bruker = leser.readLine();
                    String dato = leser.readLine();
                    int likes = Integer.parseInt(leser.readLine());
                    String tekst = leser.readLine();
                    Tekst innlegg = new Tekst(id, bruker, dato, likes, tekst);
                    blogg.leggTil(innlegg);
                } else if (linje.equals("BILDE")) {
                    int id = Integer.parseInt(leser.readLine());
                    String bruker = leser.readLine();
                    String dato = leser.readLine();
                    int likes = Integer.parseInt(leser.readLine());
                    String tekst = leser.readLine();
                    String url = leser.readLine();
                    Bilde innlegg = new Bilde(id, bruker, dato, likes, tekst, url);
                    blogg.leggTil(innlegg);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Filen ble ikke funnet: " + mappe + "/" + filnavn);
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Feil ved parsing av tall i filen: " + mappe + "/" + filnavn);
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.err.println("Uventet slutten på filen: " + mappe + "/" + filnavn);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IO-feil ved lesing av filen: " + mappe + "/" + filnavn);
            e.printStackTrace();
        }

        return blogg;

	}
}
