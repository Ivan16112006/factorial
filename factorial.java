public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(factorial1(33));
	}
	static int factorial(int a){
		if(a>0){
		int b = a*factorial(a-1);
		return b;
		}
		else return 1;
	}
	static long factorial1(int a){
		long cum = 1;
		for(int i = 1;i<=a;i++){
			cum*= i;
		}
		return cum;
	}
}