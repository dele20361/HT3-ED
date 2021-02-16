import org.junit.jupiter.api.Test;

import java.util.Arrays;

import org.junit.Assert;


class QuickSortTest {

	@Test
	void test() {
		int[] testList = new int[] {50, 2, 3, 20, 314, 77, 89, 5, 1, 9};
		Sorts s = new Sorts();
		s.quickSort(testList, 0, 9);
		System.out.println(Arrays.toString(testList));
		int [] arreglada = new int[] { 1, 2, 3, 5, 9, 20, 50, 77, 89, 314};
		Assert.assertArrayEquals(arreglada, testList);
	}

}
