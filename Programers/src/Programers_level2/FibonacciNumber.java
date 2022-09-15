package Programers_level2;

public class FibonacciNumber {
	public int solution(int n) {
		int answer = 0;
		int[] fibo = new int[n+1];
		fibo[0]=0;
		fibo[1]=1;
		
		for(int i=2;i<n+1;i++) {
			fibo[i]=(fibo[i-1]+fibo[i-2])%1234567;
		}
		
		
		
		answer=fibo[n];
		
		return answer;
	}
	
	public static void main(String[] args) {
		int a = 3;
		
		FibonacciNumber s = new FibonacciNumber();
		
		s.solution(a);
	}
}
