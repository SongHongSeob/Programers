package Programers_level2;

// 올바른 괄호

public class CorrectParentheses {
	boolean solution(String s) {
        boolean answer = false;
    	
    	// 문자열의 변수를 확인하여 값을 저장할 정수 변수 생성
    	int cnt = 0;
		
    	// 문자열의 맨처음과 마지막 값 확인
		if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') {
		}else {
			// 문자열의 맨처음 글자부터 마지막 글자까지 반복
			for(int i=0; i<s.length();i++) {
				// 문자열의 i번째 문자가 '(' 일 경우 cnt +1
				if(s.charAt(i) == '(') {
					cnt++;
				// 문자열의 i번째 문자가 ')'일 경우 처리
				}else {
					// '(' 문자의 숫자가 있을 경우 cnt -1
					if(cnt>0) {
						cnt--;
					// '(' 문자가 ')' 문자 앞에 없을 경우 cnt -1 후 반복문을 빠져 나감
					}else {
						cnt--;
						answer = false;
						break;
					}
				}	
			}
			
			// 확인용 정수 변수가 0이면 정상 문자로 확인
			if(cnt==0) answer = true;
		}
		
		System.out.println("answer : "+answer);
    	
        return answer;
    }
	
	public static void main(String[] args) {
		String a = "()()";
		
		CorrectParentheses s = new CorrectParentheses();
		
		s.solution(a);
	}
}
