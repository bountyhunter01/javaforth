package object;

public class file5 {

	public static void main(String[] args) {
		/*for (int i = 1; i <= 500; i++) {
			for (int a = 1; a <= 500; a++) {
				if (i <= 100) {
					Math.sqrt(i)(
					
					(a % i != 0));
					
			System.out.println(a);
				break;
				}
			}
		}*/
		        int sum = 0;
		        for (int i = 2; i <= 500; i++) {
		            if (isPrime(i)) {
		                sum += i;
		            }
		        }
		        System.out.println("1부터 500까지의 소수의 합: " + sum);
		    }

		    public static boolean isPrime(int num) {
		        if (num <= 1) {
		            return false;
		        }
		        for (int i = 2; i * i <= num; i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }
		

}


