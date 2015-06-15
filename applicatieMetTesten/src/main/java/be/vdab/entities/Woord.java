package be.vdab.entities;

public class Woord {
	
	private final String woord;

	public Woord(String woord) {
		this.woord = woord;
	}

	public String getWoord() {
		return woord;
	}
	
	public boolean isPalindroom(){
		//throw new UnsupportedOperationException(); 
		return (woord != null) ? woord.equalsIgnoreCase((new StringBuilder(woord).reverse()).toString()) : false;
	}

}
