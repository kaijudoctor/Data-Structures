package com.example.demo;

public class DrawTriangle{
	
	// Three Methods
	
	// Single for loop

	public static void drawTriangle(int N){
		String star = "*";
		for(int i = 0; i<N; i++){
			System.out.println(star);
			star = star + "*";
		}
	}

	public static void main(String[] args){
		drawTriangle(15);
	}
	
	// Two for loops
	static void drawTriangleFor() {
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	// Two while loops
	static void drawTriangle() {
		int N = 5;
		int row=0;
		while(row<N) {
		
		int col=0;
			while(col<=row) {
				System.out.print('*');
				col++;
			}
			System.out.println();
			row++;
		}
	}
}