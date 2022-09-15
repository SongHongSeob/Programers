package Programers_level2;

import java.util.*;

public class EatTheGround {
	int solution(int[][] land) {
        // i+1의 최대값은 i에서 선택할 수 있는 최대값 + (i+1)에서의 값을 더하는 것이다
		for(int i=1; i<land.length; i++){
	           land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
	           land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
	           land[i][2] += Math.max(Math.max(land[i-1][1], land[i-1][0]), land[i-1][3]);
	           land[i][3] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][0]);
	       }
		
		// 마지막 행의 가능한 최대값들 값을 answer 배열에 저장
	    int[] answer = land[land.length-1];
	    
	    // 가능한 값들을 정렬
	    Arrays.sort(answer);
	    
	    System.out.println("answer["+(answer.length-1)+"] : "+answer[answer.length-1]);
	    
	    // 정렬된 값들 중 가장 마지막이 가능한 최대의 값이므로 마지막 열 값 리턴
	    return answer[answer.length-1];
    }
	
	public static void main(String[] args) {
		int[][] a = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		
		EatTheGround s = new EatTheGround();
		
		s.solution(a);
	}
}
