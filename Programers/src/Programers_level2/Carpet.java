package Programers_level2;

public class Carpet {
	public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        // 카펫에 사용되는 전체 격자의 수
        int sum = brown + yellow;
        
        // 노란 격자의 수가 최소값인 1개이면 갈생의 격자는 가로 세로가 최소 3개부터 시작이므로 가로 값 i의 최소값으로 시작
        for(int i=3;i<sum;i++) {
        	// 가로값으로 전체 격자의 수를 나눈 값
        	int j = sum/i;
        	
        	
        	// 가로, 세로의 공배수들 중 세로의 값이 최소 3이상인 값을 찾아내는 식
        	if(sum%i == 0 && j>=3) {
        		
        		// 가로의 길이가 세로값과 같거나 더 크다고 했으므로 확인된 값 중 큰값을 가로, 작은 값을 세로값으로 지정
        		int col = Math.max(i, j);
        		int row = Math.min(i, j);
        		
        		// 확인 된 값 중 가로 세로에 -2를 한 값
        		int center = (col-2) *(row-2);
        		
        		
        		// 중앙에 배치된 노란 격자들의 값이 center값과 같은지 확인 후 같을 경우 리턴값에 처리
        		if(center == yellow) {
        			answer[0] = col;
        			answer[1] = row;
        		}
        		
        	}
        }
        
        for(int i=0;i<answer.length;i++) {
        	System.out.println("answer["+i+"] : "+answer[i]);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int brown = 10;
		int yellow = 2;
		
		Carpet carpet = new Carpet();
		
		carpet.solution(brown, yellow);
	}
}
