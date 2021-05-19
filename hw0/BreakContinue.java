package com.example.demo;

public class BreakContinue {
	public static int[] windowPosSum(int[]a,int n) {
		for(int i=0;i<a.length;i++) {
			
			 if(a[i]<0) continue;
				for(int j=i+1;j<=i+n;j++) {
					if(j>=a.length) break;
					a[i] = a[i] + a[j];
				}
			}
		
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, -3, 4, 5, 4};
		int n = 3;
		windowPosSum(a, n);
		System.out.println(java.util.Arrays.toString(a));
	}
}