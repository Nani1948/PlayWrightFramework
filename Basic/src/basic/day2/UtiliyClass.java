package basic.day2;

import java.util.Arrays;

public class UtiliyClass {
	//Utility Class: it is a class which has set of methods  and attributes that can be utilized by external word  in order to perform any action.
// Searching : Find an element in a particular array.
	//Linear Search
	//Binary Search
	//Sort : Arranging elements in a certain order.
	//ascending order, descending order , insertion order
	//Array follow the insertion order.
	//Character or String ,The program will be identify by considering the ascii key values.
	// To sort method array:
	//insertion sort,bubble sort, selection,insertion , merge ,quick 
	public static void main(String []args) {
	int arr[]= {1,4,5,6,7};
	Arrays.sort(arr);
	for(int a:arr) {
		System.out.print(a);
	}
	
int pos=Arrays.binarySearch(arr,4);
System.out.println(pos);
//Arrays.compareTo
}
}