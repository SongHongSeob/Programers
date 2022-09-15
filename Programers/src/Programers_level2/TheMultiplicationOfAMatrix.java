package Programers_level2;

//행렬의 곱셈

public class TheMultiplicationOfAMatrix {
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                for(int t=0;t<arr1[0].length;t++){
                    answer[i][j] += (arr1[i][t] * arr2[t][j]);
                }
                
                System.out.println("answer["+i+"]["+j+"] : "+ answer[i][j]);
            }
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[][] a = {{1,4},{3,2},{4,1},{2,3,2},{4,2,4},{3,1,4}};
		int[][] b = {{3,3},{3,3},{5,4,3},{2,4,1},{3,1,1}};
		
		TheMultiplicationOfAMatrix s = new TheMultiplicationOfAMatrix();
		
		s.solution(a,b);
	}
}
