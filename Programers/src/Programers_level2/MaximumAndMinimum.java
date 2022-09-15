package Programers_level2;

// 최댓값과 최솟값

import java.util.*;

public class MaximumAndMinimum {
	public String solution(String s) {
		String answer = "";
		String[] d;
		
		d=s.split(" ");
		int[] m = new int[d.length];
		
		for(int i=0;i<d.length;i++) {
			m[i]=Integer.parseInt(d[i]);
		}
		
		Arrays.sort(m);
		
		answer=m[0]+" "+m[d.length-1];
		
		System.out.println("answer[0] : "+answer);
		
		return answer;
	}
	
	public static void main(String[] args) {
		String s = "1 2 3 4";
		
		MaximumAndMinimum maxMin = new MaximumAndMinimum();
		
		maxMin.solution(s);
	}
}
