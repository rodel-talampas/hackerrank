/**
 * 
 */
package hacker.rank.test.simple;

import java.util.Scanner;

/**
 * @author rodel.talampas
 *
 */
public class UtopianTree {

	
	static int size;
	static int[] cycle;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		size = Integer.valueOf(scanIn.nextLine());
		cycle = new int[size];
		for (int i=0;i<=size-1;i++){
			cycle[i]= Integer.valueOf(scanIn.nextLine());
		}
		scanIn.close();
		computeCycle(cycle, 0);
	}
	
	private static void computeCycle(int[] cycle, int pos){
		if (pos>size-1)
			return;
		
		int height = 1;
		int cval = cycle[pos];
		for (int i=1;i<=cval;i++)
			height=(i%2==1?height*2:height+1);
		System.out.println(height);
		computeCycle(cycle, pos+1);
	}

}
