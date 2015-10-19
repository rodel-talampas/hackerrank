/**
 * 
 */
package hacker.rank.test.simple;

import java.util.Scanner;

/**
 * @author rodel.talampas
 *
 */
public class DiagonalDiff {
	static String size = "";
	static int[][] matrix;
	public static void main(String args[]){
		Scanner scanIn = new Scanner(System.in);
		size = scanIn.nextLine();
		matrix = new int[Integer.valueOf(size)][Integer.valueOf(size)];
		for (int i=0;i<Integer.valueOf(size); i++){
			String content = scanIn.nextLine();
			int col=0;
			for (String s: content.split(" ")){
				if (!s.trim().equals("")){
					matrix[i][col++]=Integer.valueOf(s);
				}
			}
		}
		scanIn.close();
		int sum1=sum(0,0,false);
		int sum2=sum(0,Integer.valueOf(size),true);
		
		System.out.println(Math.abs(sum1 - sum2));
	}
	
	private static int sum(int row, int col, boolean rev){
		if(!rev){
			if (col==Integer.valueOf(size)-1)
				return matrix[row][col];
			else
				return sum(row+1, col+1,rev) + matrix[row][col] ;
		}else{
			if (col-1 ==0)
				return matrix[row][col-1];
			else
				return sum(row+1, col-1,rev) + matrix[row][col-1] ;
		}
	}
}
