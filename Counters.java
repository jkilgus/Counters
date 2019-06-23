import java.util.Scanner;

public class Counters {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,3,2,4};
		int count = 1;
		int value = 4;
		int after = 0;
		int before = 6;
		int x = 7;
		
		System.out.println();
		
		System.out.println("countValues: Total number of occurrences found: " + countValues(nums, count, value));
		
		System.out.println();

		System.out.println("findFirst: Value " + value + " first found at index: " + findFirst(nums, count, value));
		
		System.out.println();
		
		System.out.println("findNext: Starting at index " + after + ", " + value + "'s next occurrence was found at index: " + findNext(nums, count, value, after));
		
		System.out.println();
		
		System.out.println("findPrev: Starting at index " + before + ", " + value + "'s previous occurrence was found at index: " + findPrev(nums, count, value, before));
		
		System.out.println();
		
		System.out.println("findLast: The largest index value where " + value + " was found was at index: " + findLast(nums, count, value));
		
		System.out.println();
		
		isPrime(x);
	}
	
	/**
	  * count the number of occurrences of value in the first count elements of nums
	  * @param nums the array of numbers to search, never null
	  * @param count the number of elements in array to consider,
	  *      must be >= 0, must be <= nums.length
	  * @param value the value being searched for in nums
	  * @return returns the number of occurrences of value in nums, always >= 0.
	  */
	public static int countValues(int[] nums, int count, int value) {
		int occurrences = 0;
		
		int k = 0;
		while (k < nums.length) {
			
			if (nums[k] == value) {
				System.out.println("countValues: Value " + value + " found at position: " + k);
				occurrences++;
			}
			k++;
		}
		return occurrences;
	}
	
	
	
	
	
	/**
	  * find the first occurrence of value in nums
	  * @param nums the array of numbers to search, never null
	  * @param count the number of elements in array to consider,
	  *      must be >= 0, must be <= nums.length
	  * @param value the value being searched for in nums
	  * @return the index of the occurrence (>= 0) or -1 if not found.
	  */
	public static int findFirst(int[] nums, int count, int value) {
		int found = -1;
		
		int k = 0;
		while (k < nums.length && found == -1) {
			
			if (nums[k] == value) {
				found = k;
			}
			k++;
		}
		return found;
	}
	
	
	
	
	
	/**
	  * find the next occurrence of value in the range num[after+1 .. count-1]
	  * @param nums the array of numbers to search, never null
	  * @param count the number of elements in array to consider,
	  *      must be >= 0, must be <= nums.length
	  * @param value the value being searched for in nums
	  * @param after  the earliest value not to consider, must be >= 0, < count
	  * @return the index of the occurrence (> after, < count) or -1 if not found.
	  */
	public static int findNext(int[] nums, int count, int value, int after) {
		boolean found = false;
		int k = after + 1;
		
		while (found == false) {
			
			if (nums[k] == value) {
				System.out.println("findNext: Value " + value + " found at position: " + k);
				found = true;
			}
			k++;
		}
		return k-1;
	}
	
	
	
	
	
	/**
	  * find the last occurrence of value in nums
	  * @param nums the array of numbers to search
	  * @param count the number of elements in array to consider,
	  *      must be >= 0, must be <= nums.length
	  * @param value the value being searched for in nums
	  * @return the index of the occurrence (>= 0, < count) or 
	  *     -1 if not found.
	  */
	public static int findLast(int[] nums, int count, int value) {
		
		int k = 0;
		while (k < nums.length) {
			
			if (nums[k] == value) {
			}
			k++;
		}
		return k-1;
	}
	
	
	
	
	
	
	/**
	  * find the previous occurrence of value in nums before before
	  * @param nums the array of numbers to search
	  * @param count the number of elements in array to consider,
	  *      must be >= 0, must be <= nums.length
	  * @param value the value being searched for in nums
	  * @param before consider only elements in nums between 0 and before-1,
	  *     must be <= count
	  * @return the index of the occurrence (>= 0, < count) or 
	  *     -1 if not found.
	  */
	public static int findPrev(int[] nums, int count, int value, int before) {
		boolean found = false;
		int k = before - 1;
		
		while (found == false) {
			
			if (nums[k] == value) {
				System.out.println("findPrev: Value " + value + " found at position: " + k);
				found = true;
			}
			k--;
		}
		return k+1;
	}
	
	/**
	 * determines if the number the user inputs is prime or not
	 * @param x - the number the user enters. Number must be a positive integer less than 2,147,483,648
	 * @return - returns the boolean seek which is a vestige of the original program from last year. The actual return
	 * value is not used, instead the function uses it's own print statements to give the user an answer.
	 * I tried to re-write the program but I was running out of time and this is as integrated as I could get it.
	 * I tried to get it to return a boolean but I have to wrap this up now while it works *at all* and submit it
	 * within the next 28 minutes.
	 */
	public static boolean isPrime(int x) {
		Scanner scan = new Scanner(System.in);
		int n = 2;
		int count = 1;
		boolean seek = true;
		int factor = 0;
		
		System.out.print("Choose a number to determine primality: ");
		count = scan.nextInt();
		scan.nextLine();
		
		while (seek == true)
		{
			while (n < count)
			{
				if (count % n == 0)
				{
					factor++;
				}
				n++;
			}
			
			if (factor == 0)
			{	
				System.out.println(count + " is prime.");
				break;
			} else {
				System.out.println(count + " is not prime.");
				seek = false;
			}
			
			count++;
			factor = 0;
			n = 2;
		}
		scan.close();
		return seek;
	}
}
