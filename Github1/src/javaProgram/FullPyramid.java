package javaProgram;

public class FullPyramid {

	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++) {
			for(int space = 1; space < 12; space++) {
				if(space <= 6 - i || space >= 6 + i) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
