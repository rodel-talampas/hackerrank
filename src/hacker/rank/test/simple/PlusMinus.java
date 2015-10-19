/**
 * 
 */
package hacker.rank.test.simple;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author rodel.talampas
 *
 */
public class PlusMinus {

	static String size;
	static int[] arrayInt;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		size = scanIn.nextLine();
		String content = scanIn.nextLine();
		scanIn.close();
		
		arrayInt = new int[Integer.valueOf(size)];
		int cnt=0;
		for (String s: content.split(" ")){
			if (!s.trim().equals(""))
				arrayInt[cnt++]=Integer.valueOf(s);
		}
		int[] count = new int[3];
		count = total(count, 0);
		
		System.out.println(Arrays.toString(count));
		DecimalFormat format = new DecimalFormat("######.####");
		for (int i=0; i<count.length; i++){
			double per = (double)count[i]/Integer.valueOf(size).intValue();
			System.out.println(format.format(per));
		}
			
		
	}
	
	private static int[] total(int[] count, int pos){
		if (pos!=Integer.valueOf(size)-1)
			count=total(count,pos+1);

		count[0]+=(negpos(arrayInt[pos])==1?1:0);
		count[1]+=(negpos(arrayInt[pos])==-1?1:0);
		count[2]+=(negpos(arrayInt[pos])==0?1:0);
		
		System.out.println(count[0]+":"+count[1]+":"+count[2]);
		
		return count;
	}
	
	private static int negpos(int value){
		if (value>0) return 1;
		else if (value<0) return -1;
		else return 0;
	}

}
