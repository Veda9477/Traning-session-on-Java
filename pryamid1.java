package Loop;

public class pryamid1 {
	public static void pattern() {
		int k =5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(i == 5 && j>2) {
					System.out.print(k);
					k--;
				}else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern();
		

	}

}
