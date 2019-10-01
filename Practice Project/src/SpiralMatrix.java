import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the size of matrix : ");
		int size=scan.nextInt();
		int[][] matrix=new int[size][size];
		System.out.println("enter the value of matrix : ");
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				matrix[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("input matrix is : ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		/*
		 * printing the required pattern : clockwise-spiral
		 * */
		System.out.println("printing the required pattern : clockwise-spiral");
		boolean flag=true;
		for(int i=0;i<size;i++) {
			if(flag) {
				for(int j=0;j<size;j++) {
					System.out.print(matrix[j][i]+" ");
				}
				flag=false;
			}else {
				for(int j=0;j<size;j++) {
					System.out.print(matrix[j][i]+" ");
				}
				flag=true;
			}
		}
		
		
		scan.close();
	}

}
