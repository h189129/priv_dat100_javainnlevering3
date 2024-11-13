package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	protected String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super.id = id;
        super.bruker = bruker;
        super.dato = dato;
        super.likes = 0;
        super.tekst = tekst;
        this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super.id = id;
        super.bruker = bruker;
        super.dato = dato;
        super.likes = likes;
        super.tekst = tekst;
        this.url = url;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "BILDE\n" + id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + tekst + "\n" + url + "\n";

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
