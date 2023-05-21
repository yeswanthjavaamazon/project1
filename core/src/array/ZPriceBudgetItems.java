package array;

// Java program to find the maximum
// number of items that can be bought
// from the given cost array
import java.io.*;
import java.util.*;

class ZPriceBudgetItems {

// Function to find the
// maximum number of items
// that can be bought from
// the given cost array
	static boolean canPurchase(int[] prices, int budget, int noOfItems) {
		int arrLength = prices.length;
		// Sort the given array
		Arrays.sort(prices);

		// Variables to store the prefix
		// sum, answer and the counter
		// variables
		int[] cart = new int[arrLength];
		int val, i, j, ans = 0;

		// Initializing the first element
		// of the prefix array
		cart[0] = prices[0];

		// If we can buy at least one item
		if (cart[0] <= budget)
			ans = 1;

		// Iterating through the first
		// K items and finding the
		// prefix sum
		for (i = 1; i < noOfItems - 1; i++) {
			cart[i] = cart[i - 1] + prices[i];

			// Check the number of items
			// that can be bought
			if (cart[i] <= budget)
				ans = i + 1;
		}
		cart[noOfItems - 1] = prices[noOfItems - 1];

		// Finding the prefix sum for
		// the remaining elements
		for (i = noOfItems - 1; i < arrLength; i++) {
			if (i >= noOfItems) {
				cart[i] += cart[i - noOfItems] + prices[i];
			}

			// Check the number of iteams
			// that can be bought
			if (cart[i] <= budget)
				ans = i + 1;
		}
		return ans > noOfItems ? true : false;
	}

// Driver code
	public static void main(String[] args) {
//		int n = 5;
		int[] arr = { 13, 1, 7, 9, 2, 8, 15 };
		int p = 26;
		int k = 3;

		System.out.println(canPurchase(arr, p, k));
	}
}

// This code is contributed by akhilsaini
