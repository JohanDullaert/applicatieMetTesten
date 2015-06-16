package be.vdab.entities;

public class Isbn {
	
	private final long isbnnummer;
	private final static int ISBN_LENGTE = 13;

	public Isbn(long isbnnummer) {
		if (controleIsbn(isbnnummer)) {
			this.isbnnummer = isbnnummer;
		} else {
			throw new IllegalArgumentException("geen geldige isbn");
		}
	}

	private boolean controleIsbn(long isbnnummer) {
//		throw new UnsupportedOperationException();
		// controle kan mss beter met getallen ipv strings (hoewel dit hier flexibeler is dan de vb opl ;-)
		if (isbnnummer < 0) {
			return false;
		}
		String isbnString = String.valueOf(isbnnummer);
		if (isbnString.length() != ISBN_LENGTE) {			
			return false;
		}
		// uitleg bij controle of beter in de javadoc bij de methode zou proper zijn ...
		int somOnevenPosities = 0;
		int somEvenPosities = 0;
		for (int i = 1; i < ISBN_LENGTE; i++){
			// i-1 : String index is zero based
			
			int cijfer = new Integer(isbnString.substring(i-1, i));			
			if (i%2 == 0) {
				somEvenPosities += cijfer;
			} else {
				somOnevenPosities += cijfer;
			}
		}
		int som = somOnevenPosities + (somEvenPosities*3);		
		int controleGetal = (((som/10)+1)*10) - som;
		if (controleGetal == 10) {
			controleGetal = 0;
		}
		if (Integer.valueOf(isbnString.substring(ISBN_LENGTE-1)) == controleGetal) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Isbn [isbnnummer=" + isbnnummer + "]";
	}	

}
