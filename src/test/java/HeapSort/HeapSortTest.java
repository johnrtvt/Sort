package HeapSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * JUnit test of the heapsort algorithm.
 * 
 * @author John Thompson
 **/

class HeapSortTest extends HeapSort {

	HeapSort sorter = new HeapSort();

	Integer[] arr1;
	Integer[] arr2;
	Integer[] arr3;
	Integer[] arr4;
	Integer[] arr5;
	Integer[] arr6;
	Integer[] exp1;
	Integer[] exp2;
	Integer[] exp3;
	Integer[] exp4;
	Integer[] exp5;
	Integer[] exp6;
	Integer[] empty;

	@Test
	void testMany() throws NullEntryException {
		arr1 = new Integer[] { 8, 6, 7, 2, 3, 4, 5, 9, 1, 10 };
		exp1 = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		sorter.sort(arr1);
		compare(arr1, exp1);

	}

	@Test
	void testThree() throws NullEntryException {
		arr2 = new Integer[] { 3, 2, 1 };
		arr3 = new Integer[] { 2, 2, 1 };
		arr4 = new Integer[] { 5, 0, 1 };
		arr5 = new Integer[] { 1, 2, 3 };
		exp2 = new Integer[] { 1, 2, 3 };
		exp3 = new Integer[] { 1, 2, 2 };
		exp4 = new Integer[] { 0, 1, 5 };
		exp5 = new Integer[] { 1, 2, 3 };
		sorter.sort(arr2);
		compare(arr2, exp2);

		sorter.sort(arr3);
		compare(arr3, exp3);

		sorter.sort(arr4);
		compare(arr4, exp4);

		sorter.sort(arr5);
		compare(arr5, exp5);
	}

	@Test
	void testOne() throws NullEntryException {
		arr6 = new Integer[] { 3 };
		exp6 = new Integer[] { 3 };
		sorter.sort(arr6);
		compare(arr6, exp6);
	}

	@Test
	void testEmpty() throws NullEntryException {
		empty = new Integer[] {};
		exp6 = new Integer[] {};
		sorter.sort(empty);
		compare(empty, exp6);
	}

	
	@Test
	void testNull() throws NullEntryException { 
		 arr6 = new Integer[] {null, 1}; 
		 arr1 = new Integer[] {1, null}; 
		 assertThrows(NullEntryException.class, ()->sorter.sort(arr6)); 
		 try {
			 sorter.sort(arr1);
		 }
		 catch (NullEntryException e) {
			 assertEquals(e.getMessage(), "There is a null entry in the list");
		 }
	 }
	 

	// Compares to be sorted
	private void compare(Integer[] arr, Integer[] exp) {
		for (int i = 0; i < arr.length; i++) {
			assertEquals(arr[i], exp[i]);
		}
		assertEquals(arr.length, exp.length);
	}

}
