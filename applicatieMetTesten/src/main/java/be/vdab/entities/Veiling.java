package be.vdab.entities;

public class Veiling {
	
	private int hoogsteBod = 0;
	
	public void doeBod(int bod){
		if (bod > hoogsteBod){
			hoogsteBod = bod;
		}
	}

	public int getHoogsteBod() {
		return hoogsteBod;
	}	

}
