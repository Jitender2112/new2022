package org.sample;

public class SouthIndians extends Indians{
	
	@Override
	public void breakFast() {
		System.out.println("idly");

	}
	
	public static void main(String[] args) {
		SouthIndians s = new SouthIndians();
		s.breakFast();
		s.panCard();
		s.voterid();
	}
	
	

}
