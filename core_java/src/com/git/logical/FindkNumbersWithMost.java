package com.git.logical;
// JAVA program to find k numbers with most
// occurrences in the given array

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindkNumbersWithMost {
	static List<Integer>
	print_N_mostFrequentNumber(List<Integer> nums, int k)
	{
		List<Integer> ans = new ArrayList<>(k);
		// Map for counting the number of occurrences
		Map<Integer, Integer> counts = new HashMap<>();
		// Storing the frequency of each element
		for (int num : nums)
			counts.put(num,
					counts.getOrDefault(num, 0) + 1);
		// Creating a list for storing the frequency
		List<Map.Entry<Integer, Integer> > freqs
			= new ArrayList<>(counts.entrySet());
		// Using the user-defined function Collections.sort
		// to sort by frequency
		Collections.sort(
			freqs, (a, b) -> b.getValue() - a.getValue());
		// Adding the k most frequent numbers to the output
		// list
		for (int i = 0; i < k; i++)
			ans.add(freqs.get(i).getKey());
		// Returning the result in the out list
		return ans;
	}

	// Driver's code
	public static void main(String[] args)
	{
		List<Integer> arr = new ArrayList<>(
			Arrays.asList(3, 1, 4, 4, 5, 2, 6, 1,3));
		
		int a[]= {1,2,3,4,5,5};
		
//		int sum=arr.stream().collect(Collectors.summingInt(i->i.intValue()));	
//		int sum=IntStream.of(a).sum();
		OptionalDouble sum=Arrays.stream(a).average();
		System.out.println(sum);
							
		int k = 3;

		// Function call
		
		
		System.out.println(
			k + " numbers with most occurrences are:"+print_N_mostFrequentNumber(arr, k));

	}
}


