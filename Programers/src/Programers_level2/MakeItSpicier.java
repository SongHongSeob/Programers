package Programers_level2;

import java.util.*;
//우선순위 큐의 사용법 PriorityQueue<Integer> overScoville = new PriorityQueue<>();
	
	// 첫번째 값을 반환하고 제거 비어있다면 null
	//overScoville.poll();

	// 첫번째 값 제거 비어있다면 예외 발생
	//overScoville.remove(); 

	// 첫번째 값을 반환만 하고 제거 하지는 않는다.
	// 큐가 비어있다면 null을 반환
	//overScoville.peek();

	// 첫번째 값을 반환만 하고 제거 하지는 않는다.
	// 큐가 비어있다면 예외 발생
	//overScoville.element();

	// 초기화
	//overScoville.clear();

public class MakeItSpicier {
	public int solution(int[] scoville, int K) {
        int answer = 0;
	    	
	    	PriorityQueue<Integer> overScoville = new PriorityQueue<>();		// 우선순위 큐 객체 선언
	    	
	    	for(int i : scoville) {
	    		overScoville.offer(i);		// scoville 배열의 값을 우선순위 큐에 집어넣음
	    	}
	    	
	    	while(overScoville.peek() < K) {	// 우선순위큐의 맨 앞의 값을 가져온 후 그 값이 요구하는 값보다 작은지 확인
	    		if(overScoville.size() ==1) {	// 값이 작으면서 큐가 다음 것과 요구 수식을 진행할 수 없는 1개만 있는지 확인
	    			answer = -1;				// 큐의 값이 1개만 있을 시 answer에 -1 처리
	    			break;						// 진행을 못하는 개수이므로 아래를 진행하지 않고 while문에서 빠져나옴
	    		}
	    		
	    		int a = overScoville.poll();	// 우선순위 큐에서 첫번쨰값을 가지고 나온 후 큐에서 제거
	    		int b = overScoville.poll();	// 제거 후 새로운 첫번째 값이 된 값을 가지고 온후 큐에서 제거
	    		
	    		int result = a+(b*2);			// 요구 수식 진행
	    		
	    		overScoville.offer(result);		// 새로운 값을 우선순위 큐에 추가
	    		
	    		answer++;						// 반복횟수 +1
	    	}

	        return answer;
    }
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 9, 10, 12};
		int b =7;
		
		MakeItSpicier s = new MakeItSpicier();
		
		s.solution(a,b);
	}
}
