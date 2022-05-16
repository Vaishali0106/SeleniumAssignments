package week1.day1.assignments;



public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=17;
		int count=0;
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				count=1;
				break;
			}
			
				
		}
		if(count==1) {
			System.out.println(" Not Prime");
		}
		else {
			System.out.println("  Prime");
		}
	}

}
