package hacker.rank.test.simple;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String args[]){
		Scanner scanIn = new Scanner(System.in);
		String size = scanIn.nextLine();
		String content = scanIn.nextLine();
		scanIn.close();
		
		int[] arrayInt = new int[Integer.valueOf(size)];
		int cnt=0;
		int sum=0;
		for (String s: content.split(" ")){
			if (!s.trim().equals("")){
				arrayInt[cnt++]=Integer.valueOf(s);
				sum+=arrayInt[cnt-1];
			}
		}
		System.out.println(Arrays.toString(content.split(" ")));
		System.out.println(Arrays.toString(arrayInt));
		System.out.println(sum);
	}
}
