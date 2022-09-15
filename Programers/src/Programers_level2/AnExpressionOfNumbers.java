package Programers_level2;

// 숫자의 표현

public class AnExpressionOfNumbers {
	public int solution(int n) {
        int answer = 0;
	        int t=1;
	        
	        while(true) {
	        	// 합계를 저장할 정수 객체
	        	int sum=0;
	        	
	        	// 연속된 수 저장 반복문 실행
	        	for(int i=t;i<=n;i++) {
		        	
		        	sum+=i;
		        	
		        	// 합계가 요청한 숫자와 같으면 개수 +1 후 for문에서 나옴
		        	if(sum==n) {
		        		answer++;
		        		break;
		        	}
		        	
		        	// 합계가 요청한 숫자를 초과하면 for문에서 나옴
		        	if(sum>n) {
		        		break;
		        	}
		        }
	        	
	        	t++;
	        	
	        	if(t>n)
	        		break;
	        }
	        
	        System.out.println("answer ; " +answer);
	        
	        return answer;
   }
	
	public static void main(String[] args) {
		int a = 15;
		
		AnExpressionOfNumbers s = new AnExpressionOfNumbers();
		
		s.solution(a);
	}
}
