package hacker.rank.test.simple;

import java.util.Scanner;

public class StairCase {
	static String size;
	static int total;
	public static void main(String args[]){
		Scanner scanIn = new Scanner(System.in);
		size = scanIn.nextLine();
		scanIn.close();
		total = Integer.valueOf(size)-1;
		String[][] stairs = new String[Integer.valueOf(size)][Integer.valueOf(size)];
		stairs = fillstairs(stairs, 0);
		printstairs(stairs, 0);	
	}
	private static void printstairs(String[][] stairs, int count){
		if (count>total)
			return;
		for (int i=0;i<=total;i++)
			System.out.print(stairs[count][i]==null?" ":stairs[count][i]);
		System.out.println();
		printstairs(stairs, count+1);
	}
	
	private static String[][] fillstairs(String[][] stairs, int count){
		if (count!=total){
			stairs = fillstairs(stairs, count+1);
		}
		int pos = total - count;
		for (int i=pos;i<=total;i++)
			stairs[count][i]="#";
		return stairs;
	}
}
