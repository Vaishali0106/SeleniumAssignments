package week1.day1.assignments;



public class ArmstrongNumber {

	

	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=122;
		int original=num;
		int cal=0;

		while(original>0){
			int remainder=original%10;
			cal=cal+(remainder*remainder*remainder);
			original=original/10;

		}
		System.out.println(cal);
		if(cal==num) {
			System.out.println("Number is Armstrong");
		}
		else
			System.out.println("Not Armstrong");
		

	}
}
