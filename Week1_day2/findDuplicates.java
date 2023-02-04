package week1.day2;

import java.util.Arrays;

public class findDuplicates {

	public static void main(String[] args) {
		int nums[]= {2,5,7,7,5,9,2,3}; //this is list of numbers in the array with duplicates

		System.out.println("Duplicate numbers in the array are:" + " ");
//		for (int i = 0; i<nums.length; i++)//outer loop to look at each index of the given array 
//		{
//			for(int j=i+1; j<nums.length;j++) //inner loop to compare the number in i with the number in the next index
//			{
//				if(nums[i]==nums[j]) //compare the first and second number of the array. 
//				{
//					//If same will print the number else will break and execute the loop with number in the next index 
//
//					System.out.println(nums[i]); 
//					break;
//				}
//			}
//		}

		//another method

		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i+1]) {
				System.out.println(nums[i]);
			}
		}

	}

}
