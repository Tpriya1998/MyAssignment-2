package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
				//0,1,1,2
		//loop no. 1
		
		
		for(int fibo=0; fibo < 8; fibo++) {
			
			int newFibo = a+b;
			System.out.println(a);
			b = a;
			a = newFibo;
			
		}

	}

}
