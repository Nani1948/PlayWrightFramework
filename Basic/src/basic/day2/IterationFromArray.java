package basic.day2;

import java.util.Scanner;

public class IterationFromArray {

	public static void main(String[] args) {
		//Iteration :it is a traverse all from the start of element to till end of the element for array
	/*int []ob2= {3,4,5,6,7};
	for(int i=0;i<ob2.length;i++) {
		System.out.print(ob2[i]);
	}
	System.out.println();*/
		int ob[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		for(int i=0;i<ob.length;i++) {
		ob[i]=sc.nextInt();	
		}
		System.out.println("Print Array:");
		/*for(int i=0;i<ob.length;i++) {
			System.out.println(ob[i]);
		}*/
		//Enhanced for loop
		for(int o:ob) {
			System.out.println(o);
		}
	}

}