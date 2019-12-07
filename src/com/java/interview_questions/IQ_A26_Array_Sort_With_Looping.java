package com.java.interview_questions;

public class IQ_A26_Array_Sort_With_Looping {

	public static void main(String[] args) {
		int temp;
		int Arr[] = { 1, 55, 23, 78, 10 };

		int i, j;

		for (i = 0; i < Arr.length; i++) {
			for (j = i + 1; j < Arr.length; j++) {
				if (Arr[i] > Arr[j]) {
					temp = Arr[j];
					Arr[j] = Arr[i];
					Arr[i] = temp;

				}

			}
		}
		
		for(int k:Arr)
		{
			System.out.println(k);
		}

	}

}
