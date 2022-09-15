package Programers_level2;

// 124 나라

public class TheNumberOf124Countries {
	public String solution(int n) {
        String answer = "";

	        int na = 0;
	        
	        // string 협병의 속도를 위한 사용
	        StringBuilder sb = new StringBuilder();
	        
	        // 몫이 0이 아닐때까지 반복
	        while(n != 0){
	        	
	        	// na : 나머지 값
	            na = n%3;  //1  1 1
	            // 몫 : n
	            n = n/3; //4  1 0

	            // 나머지가 0일때의 처리
	            if(na==0){
	                n=n-1;
	                na = 4;
	            }
	            
	            sb.append(na);
	        }
	        
	        // 처음 값부터 앞에 들어가기 떄문에 반전을 사용
	        sb.reverse();
	        
	        answer = sb.toString();
	        
	        System.out.println("answer : " + answer);

	        return answer;
    }
	
	public static void main(String[] args) {
		int a = 4;
		
		TheNumberOf124Countries s = new TheNumberOf124Countries();
		
		s.solution(a);
	}
}
