package week1.day2.assignments.mandatory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original="changeme";
		char[] chngeChar= original.toCharArray();
		for(int i=0;i<chngeChar.length;i++) {
			//System.out.print(chngeChar[i]);
			
			if(i%2!=0) {
				char ch=original.charAt(i);
				System.out.println(Character.toUpperCase(ch));
			}
				else {
				System.out.println(chngeChar[i]);
			}
			
		}

	}

}
	
	
