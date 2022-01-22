package org.full;

public class HdfcBank implements RbiBank, WorldBank {

	@Override
	public void fixed() {
System.out.println("8");		
	}

	@Override
	public void saving() {
System.out.println("85");		
	}

	@Override
	public void deposite() {
System.out.println("966");		
	}
	
	
	public static void main(String[] args) {
		
HdfcBank h=new HdfcBank();
h.fixed();
h.saving();
h.deposite();

	}

}
