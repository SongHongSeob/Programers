package Programers_level2;

// 최솟값 만들기

import java.util.*;

// 2개의 배열의 값들의 곱의 최솟값을 구하려면 한 배열은 내림차순 다른 배열은 오른차순으로 정렬되어 그 값들을 곱한 값을 더하는 것

public class CreateAMinimum {
	public int solution(int []A, int []B)
    {
		
		// 두 배열 정렬
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        // 한 개의 배열 큰값이 맨 앞에 오도록 정렬하는 함수 
        reverseArrayInt(B);
        
        for(int i=0;i<A.length;i++) {
        	int c=A[i]*B[i];
        	answer+=c;
        }
        
        System.out.println("answer : "+answer);
        
        
        return answer;
    }

	public static void reverseArrayInt(int[] array) {
		 int temp;
	
		 for (int i = 0; i < array.length / 2; i++) {
			 temp = array[i];
		     array[i] = array[(array.length - 1) - i];
		     array[(array.length - 1) - i] = temp;
		 }
	 }
	
	public static void main(String[] args) {
		int[] a = {1,4,2};
		int[] b = {5,4,4};
		
		CreateAMinimum s = new CreateAMinimum();
		
		s.solution(a,b);
	}
}
