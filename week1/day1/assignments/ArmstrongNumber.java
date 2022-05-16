package week1.day1.assignments;



public class ArmstrongSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=153;
		int original=num;
		int cal=0;
		
		while(original>0) {
			int remainder=original%10;
			cal=cal+(remainder*remainder*remainder);
			original=original/10;
		}
		
		System.out.println("Sum of cubes is : "+cal);
		
		if(cal==num) {
			System.out.println("Number is Armstrong");
		}
		else
			System.out.println("Number is not armstrong");

	}

}

