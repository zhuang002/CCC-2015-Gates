/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gates;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class Gates {

    static Scanner sc=new Scanner(System.in);
	static int G;
	static int P;
	
	static int[] ar=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G=sc.nextInt();
		ar=new int[G];
		for (int i=0;i<G;i++)
			ar[i]=i;
		P=sc.nextInt();

		for (int i=0;i<P;i++) {
			int gi=sc.nextInt()-1;
			int previousGate=getAvailableGate(gi);
			if (previousGate<0) {
				System.out.println(i);
				return;
			}
		}
		
		System.out.println(P);
		
	}
	private static int getAvailableGate(int gi) {
		// TODO Auto-generated method stub
		if (gi<0) return gi;
		if (ar[gi]==gi) {
			ar[gi]=gi-1;
			return gi;
		} else {
			int pre=getAvailableGate(ar[gi]);
			ar[gi]=pre;
			return pre;
		}
	}
    
}
