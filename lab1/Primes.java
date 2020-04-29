class Primes {
	public static void main(String[] args) {
		for (int i=2; i<100; i+=1){
			if (isPrime(i)==true) {
				System.out.print(i);
				System.out.print(' ');
			}
		}
	}
	public static boolean isPrime(int n) {
	int c=0;
		for (int i=2; i<n; i+=1) {
		if (n%i==0) {
			c+=1;
			}
		
		}
		return c==0;
	}
}