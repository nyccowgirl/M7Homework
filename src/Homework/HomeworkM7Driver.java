package Homework;

import java.util.*;

public class HomeworkM7Driver {

	public static void main(String[] args) {
		
		System.out.println("\n********************************************TESTING ARRAY REVERSER********************************************");
		// parameter 1: the array to be reversed
		// parameter 2: a description of the test
		testArrayReverse(new int[] {1, 2, 3, 4, 5}, "odd length array");
		testArrayReverse(new int[] {1, 2, 3, 4, 5, 6}, "even length array");
		testArrayReverse(new int[] {7, 8}, "array length 2");
		testArrayReverse(new int[] {5}, "array length 1");
		testArrayReverse(new int[] {}, "empty array");

				
		System.out.println("\n********************************************TESTING Q WITHOUT U********************************************");
		System.out.println("Does the word contain a \'q\' that is NOT immediately followed by a \'u\'? These words do!");
		// parameter 1: the word to test
		// parameter 2: the expected result (true if the word contains a q that is NOT immediately followed by a u)
		// parameter 3: a description of the test
		testQNotFollowedByU("qat",   true, "q-not-followed-by-u at the beginning of the word");
		testQNotFollowedByU("cinq",  true, "q-not-followed-by-u at the end of the word; even length");
		testQNotFollowedByU("drinq", true, "q-not-followed-by-u at the end of the word; odd length");
		testQNotFollowedByU("abqc",  true, "q-not-followed-by-u in the middle of the word, even length");
		testQNotFollowedByU("abqcd", true, "q-not-followed-by-u in the middle of the word, odd length");
		testQNotFollowedByU("squaq", true, "q-not-followed-by-u in a word that also has a \"qu\" before it");
		testQNotFollowedByU("bubqb", true, "q-not-followed-by-u in a word that also has a \"qu\" before it");
		testQNotFollowedByU("qaqu",  true, "q-not-followed-by-u in a word that also has a \"qu\" after it");
		testQNotFollowedByU("qiteu", true, "q-not-followed-by-u right away, but with a u later on, odd length");
		testQNotFollowedByU("qeut",  true, "q-not-followed-by-u right away, but with a u later on, even length ");
		testQNotFollowedByU("q",     true, "q all on its own- single letter");
		testQNotFollowedByU("qq",    true, "q all on its own- single letter");
		testQNotFollowedByU("uq",    true, "q all on its own- single letter");
		testQNotFollowedByU("QAT",   true, "q-not-followed-by-u in caps");

		System.out.println("\nThese words fail the test. They either have no \'q\' or they have a \'q\' that IS immediately followed by a \'u\'.");
		testQNotFollowedByU("hello",  false, "no q; odd length");
		testQNotFollowedByU("cats",   false, "no q; even length");
		testQNotFollowedByU("bulb",   false, "no q but has a u; odd length");
		testQNotFollowedByU("puts",   false, "no q but has a u; even length");
		testQNotFollowedByU("a",      false, "single letter, not a q");
		testQNotFollowedByU("",       false, "empty string");
		testQNotFollowedByU("quite",  false, "q-followed-by-u at the beginning of the word");
		testQNotFollowedByU("equal",  false, "q-followed-by-u in the middle of a word; odd length");
		testQNotFollowedByU("aqua",   false, "q-followed-by-u in the middle of a word; even length");
		testQNotFollowedByU("abcqu",  false, "q-followed-by-u q followed by u at the end of the word, odd length");
		testQNotFollowedByU("abcdqu", false, "q-followed-by-u q followed by u at the end of the word, even length");
		testQNotFollowedByU("qu",     false, "q-followed-by-u and nothing else");
		testQNotFollowedByU("QUOTE",  false, "q-followed-by-u in all-caps");


		System.out.println("\n********************************************TESTING GET FREQUENCY OF********************************************");
		// parameter 1: the contents of the bag
		// parameter 2: the target value
		// parameter 3: the expected return value- how often the target appears in the bag
		// parameter 4: a description of the test
		testGetFrequencyOf(new Integer[] {}, 12, 0, 	"empty bag");
		testGetFrequencyOf(new Integer[] {13}, 13, 1, 	"singleton bag that contains the target");
		testGetFrequencyOf(new Integer[] {13}, 5, 0, 	"singleton bag that does not contain the target");
		testGetFrequencyOf(new Integer[] {15, 2, 5, 4, 7, 5}, 15, 1,  "target is in the bag at the beginning");
		testGetFrequencyOf(new Integer[] {5, 2, 5, 4, 7, 25}, 25, 1,  "target is in the bag at the end");
		testGetFrequencyOf(new Integer[] {5, 2, 5, 4, 7, 5}, 4, 1, 	  "target is in the middle");
		testGetFrequencyOf(new Integer[] {5, 2, 5, 4, 7, 5}, 5, 3, 	  "target is in the bag multiple times");
		testGetFrequencyOf(new Integer[] {5, 2, 5, 4, 7, 5}, 8, 0, 	  "target not in the bag, even length");
		testGetFrequencyOf(new Integer[] {5, 2, 5, 4, 7, 5, 2}, 8, 0, "target not in the bag, odd length");
		testGetFrequencyOf(new String[] {"a", "b", "c", "d", "e", "a"}, new String("a"), 2, "test with Strings");


		System.out.println("\n********************************************TESTING EXTRA CREDIT COUNT POSITIVES********************************************");
		// parameter 1: the contents of the bag
		// parameter 2: the expected result- the number of positives
		// parameter 3: a description of the test
		testCountPositives(new int[] {2, -1, 3, 5, -2, 4, 1}, 	5, "odd number of elements");
		testCountPositives(new int[] {1, -4, -2, 5, 3, -1, 2}, 	4, "even number of elements");
		testCountPositives(new int[] {-3, -4, -2, -5, -8}, 		0, "no positives");
		testCountPositives(new int[] {6, 4, 3, 2, 1, 7, 9}, 	7, "all positives");
		testCountPositives(new int[] {}, 						0, "empty bag");
		testCountPositives(new int[] {6}, 						1, "singleton bag with positive");
		testCountPositives(new int[] {-6},		 				0, "singleton bag without positive");
	
	}

	public static boolean qNotFollowedByU(String word) {
		// Option 1
		return (word.length() == 0 ? false : qNotFollowedByU(word, 0));

		// Option 2
		/*
		if (word.length() == 0) {			// Base case if word is empty
			return false;
		} else {
			return qNotFollowedByU(word, 0);
		}
		 */
	}

	// Helper method
	private static boolean qNotFollowedByU(String word, int index) {
		if (index >= word.length()) {		// Base case if index is greater than or equal to size of word
			return false;
		} else {
			return (((word.toUpperCase().charAt(index) == 'Q') &&
					((index == word.length() - 1) || (word.toUpperCase().charAt(index + 1) != 'U'))) ||
					qNotFollowedByU(word, index + 1));
			// If character is Q and it is last letter OR it is NOT followed by U, return true; otherwise,
			// recursive case with index incremented by 1.
		}
	}

	public static void arrayReverse(int[] array) {
		arrayReverse(array, 0, array.length - 1);
	}

	// Helper methods
	private static void arrayReverse(int[] array, int start, int end) {
		if (start < end) {
			swap(array, start, end);
			arrayReverse(array, start + 1, end - 1);
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static int countPositives(BagInterface<Integer> bag) {
		if (!bag.isEmpty()) {					// If bag is not empty, remove one item at a time for conditional
			int number = bag.remove();
			int count = 0;

			if (number > 0) {
				count = 1;
			}

			count = count + countPositives(bag);

			bag.add(number);        			// Add item back into bag after recursion that removes all items
			return count;
		}

		return 0;
	}

	
	/*
	 * The methods below are designed to help support the tests cases run from main. You don't
	 * need to use, modify, or understand these methods. You can safely ignore them. :) 
	 * 
	 * Also, you can ignore the use of generics in the tester methods. These methods use
	 * generics at a level beyond which we use in our class. I only use them here to make this a robust 
	 * and useful testing file. You are NOT required to understand the use of generics in this way.
	 */
	
	public static void testArrayReverse(int[] array, String testDescription) {
		int[] arrayToReverse = Arrays.copyOf(array, array.length);
		int[] originalArray = Arrays.copyOf(array, array.length);
		int[] correctReverseArray = new int[array.length];
		for(int i=array.length-1, j=0; i>=0; i--, j++ ) {
			correctReverseArray[j] = originalArray[i];
		}
		arrayReverse(arrayToReverse);
		System.out.println("\nTest of original array  = " + Arrays.toString(originalArray));
		System.out.println("\tExpected result = " + Arrays.toString(correctReverseArray));
		System.out.println("\t  Actual result = " + Arrays.toString(arrayToReverse));

		if(!Arrays.equals(correctReverseArray, arrayToReverse)) {
			System.out.println("\t*****Test failed for: " + testDescription + "\n");
		}
	}
	
	public static void testQNotFollowedByU(String word, boolean expectedResult, String testDescription) {
		boolean actualResult =  qNotFollowedByU(word);
		System.out.print("Word = " + word);
		System.out.println("\tExpected result=" + expectedResult + "\n\t\t  Actual result=" + actualResult);
		if(actualResult != expectedResult) {
			System.out.println("\t***Test failed for: " + testDescription + "\n");			
		} 
	}
	
	public static <T> void testGetFrequencyOf(T[] bagContents, T value, int expectedResult, String testDescription) {
		LinkedBag<T> originalBag = new LinkedBag<T>();
		LinkedBag<T> copyBag = new LinkedBag<T>();
		for(T n : bagContents) {
			originalBag.add(n);
			copyBag.add(n);
		}
		int actualResult = originalBag.getFrequencyOf(value);
		System.out.println("Bag contains: " + Arrays.toString(bagContents) + "\tCounting " + value);
		System.out.println("\tExpected result=" + expectedResult + "\n\t  Actual result=" + actualResult);
		
		if(actualResult!=expectedResult) {
			System.out.println("\t***Test failed for: " + testDescription + "\n");
		} 
		Object[] originalBagContentsAfterRemove = originalBag.toArray();
		Arrays.sort(originalBagContentsAfterRemove);
		Object[] copyBagContents = copyBag.toArray();
		Arrays.sort(copyBagContents);
	
		if(!Arrays.equals(originalBagContentsAfterRemove, copyBagContents)) {
			System.out.println("\t***Test failed for: " + testDescription);
			System.out.println("\t   The bag has been modified.\n\t   Sorted contents after invoking frequency = " + Arrays.toString(originalBagContentsAfterRemove) + "\n");
		}
	}
	
	public static void testCountPositives(int[] bagContents, int expectedResult, String testDescription) {
		LinkedBag<Integer> originalBag = new LinkedBag<Integer>();
		LinkedBag<Integer> copyBag =  new LinkedBag<Integer>();
		for(int n : bagContents) {
			originalBag.add(n);
			copyBag.add(n);
		}
		int actualResult = countPositives(originalBag);
		Object[] originalBagContentsAfterCount = originalBag.toArray();
		Arrays.sort(originalBagContentsAfterCount);
		Object[] copyBagContents = copyBag.toArray();
		Arrays.sort(copyBagContents);

		System.out.println("Bag contains: " + Arrays.toString(copyBagContents));
		System.out.println("\tExpected result=" + expectedResult + "\n\t  Actual result=" + actualResult);
		
		if(actualResult!=expectedResult) {
			System.out.println("\t***Test failed for: " + testDescription + "\n");
		}
		if(!Arrays.equals(originalBagContentsAfterCount, copyBagContents)) {
			System.out.println("\t***Test failed for: " + testDescription);
			System.out.println("\t   The bag has been modified.\n\t   Sorted contents after invoking frequency = " + Arrays.toString(originalBagContentsAfterCount) + "\n");
		}
	}
}
