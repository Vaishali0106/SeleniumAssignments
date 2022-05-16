package week1.day1.assignments;

public class FibonacciSeries {


	public static void main(String[] args) {

		int n1,n2,n3;
		n1=0;
		n2=1;
		System.out.print(n1+","+n2);
		for(int i=0;i<6;i++) {
			
			n3=n1+n2;
			System.out.print(","+ n3);
			n1=n2;
			n2=n3;
			
		}
	}
}
