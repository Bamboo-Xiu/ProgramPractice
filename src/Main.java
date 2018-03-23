import java.util.*;

import util.InitialUtil;
import util.ShowUtil;
import util.SortUtil;

public class Main {

	public static void main(String[] args) {
		/*
		 * int[] array = InitialUtil.initIArrayD1(10, 1, 100);
		 * ShowUtil.showIArrayD1(array); System.out.println();
		 */

		/*
		 * SortUtil.InsertSort(array); ShowUtil.showIArrayD1(array);
		 */
		
		Integer integer = new Integer(100);
		byte b = integer.byteValue();
		double d = integer.doubleValue();
		float f = integer.floatValue();
		long l = integer.longValue();
		String string = "j";
		Integer integer2 = Integer.valueOf(string);
		// ÏíÔªÄ£Ê½
		
		System.out.println(integer2);
		
	}

	public static int str2int(String str) {
		char[] strchar = str.toCharArray();
		int length = strchar.length;
		int num = 0;
		for (int i = 0; i < length; ++i) {
			num = num * 10 + (strchar[i] - '0');
		}
		return num;
	}

	public static void quickSort(int[] array, int L, int R) {
		int i = L;
		int j = R;
		int pivot = array[(L + R) / 2];
		while (i <= j) {
			while (array[i] < pivot)
				++i;
			while (array[j] > pivot)
				--j;
			if (i <= j) {
				int tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
				++i;
				--j;
			}
		}
		if (L < j)
			quickSort(array, L, j);
		if (i < R)
			quickSort(array, i, R);
	}
}
