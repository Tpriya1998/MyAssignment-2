package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int i ,m=0,flag = 0;
	
		int n =4;
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n+"is not Prime number");
			
		}
		else {
			for(i=2;i<m;i++) {
				if(n%i==0) {
					System.out.println(n+"is not Prime number");
					flag = 0;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n+ " is Prime number");
			}
		}

	}

}
