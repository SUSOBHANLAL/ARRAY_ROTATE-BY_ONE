package com.one;

public class susobhan {

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,1};
		int rotation =1;
		int n = arr.length;
		int arr2[] = new int[12];
		int j =0;
		for(int i=rotation;i<n;i++) {
			arr2[j]=arr[i];
			j++;
			//i have put the last value at the last as it is the one rotation
			arr2[n-1]=arr[0];
			
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr2[i]+" ");
		}

	}

}
