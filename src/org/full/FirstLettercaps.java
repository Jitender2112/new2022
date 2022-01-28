package org.full;

public class FirstLettercaps {
	
	public class FirstLetterCaps {

		public void main(String[] args) {
			
			String Output = " ";
				
				String s = "welcome to programming class";
				
				String[] split = s.split(" ");
				
				for (String a : split) {
					
					char ca = a.charAt(0);
					char upperCase = Character.toUpperCase(ca);
					String substring = a.substring(1);
					
					Output = upperCase + substring + " ";
					
					System.out.println(Output);
					
					
				}
				
				
				
				
			
		}}


}
