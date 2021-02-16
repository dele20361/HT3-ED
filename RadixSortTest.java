import org.junit.jupiter.api.Test;
import org.junit.Assert;


class RadixSortTest {

	@Test
	void test() {
		int[] testList = new int[] {1, 50, 3, 20, 314, 77, 89, 5, 2, 9};
		Sorts s = new Sorts();
		//s.radixSort(testList);
		int [] arreglada = new int[] { 1, 2, 3, 5, 9, 20, 50, 77, 89, 314};
		//Assert.assertArrayEquals(arreglada, testList);
	}

}