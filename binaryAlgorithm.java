package Session6.Assignment3;

import java.util.Scanner;

public class binaryAlgorithm {

	
	int searchBinary(int arr[], int last, int Frist, int x) 
	{ 
		if (Frist >= last) { 
			int mid = last + (Frist - last) / 2; 

			if (arr[mid] == x) 
				return mid; 

			if (arr[mid] > x) 
				return searchBinary(arr, last, mid - 1, x); 

			return searchBinary(arr, mid + 1, Frist, x); 
		} 

		return -1; 
	} 

	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		binaryAlgorithm ob = new binaryAlgorithm(); 
		int arr[] = { 10, 20, 40, 100, 200 }; 
		int n = arr.length;
		System.out.print("Enter the element you want to search: ");
		int x = sc.nextInt();
		int result = ob.searchBinary(arr, 0, n - 1, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at index " + result); 
	} 
} 
