package hacker.rank.test.simple;

import java.math.BigInteger;
import java.util.Scanner;

public class BigArraySum {

	public static void main(String args[]){
		Scanner scanIn = new Scanner(System.in);
		String size = scanIn.nextLine();
		String content = scanIn.nextLine();
		scanIn.close();
		
		BigInteger[] arrayInt = new BigInteger[Integer.valueOf(size)];
		int cnt=0;
		BigInteger sum=new BigInteger("0");
		for (String s: content.split(" ")){
			if (!s.trim().equals("")){
				arrayInt[cnt++]=new BigInteger(s);
				sum=sum.add(arrayInt[cnt-1]);
			}
		}
		System.out.println(sum);
	}
}
