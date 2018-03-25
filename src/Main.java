
import util.InitialUtil;
import util.ShowUtil;

public class Main {

	public static void main(String[] args) {

		/*
		 * int array[] = InitialUtil.initIArrayD1(10, 0, 10);
		 * ShowUtil.showIArrayD1(array); Arrays.sort(array); for(int i = 0; i <
		 * array.length - 1; ++i) { if(array[i] == array[i+1]) {
		 * System.out.println("重复的数字为：" + array[i]); break; } if(i==array.length-2) {
		 * System.out.println("没有元素相同"); } }
		 */

		boolean b = test1();
		if(!b) {
			System.out.println("没有元素相同");
		}
	}

	/**
	 * 剑指offer 面试题3.1
	 * @return
	 */
	public static boolean test1() {
		int array[] = InitialUtil.initIArrayD1(10, 0, 10);
		ShowUtil.showIArrayD1(array);
		int len = array.length;
		//检查数组是否满足条件
		for(int i = 0; i < len; ++i) {
			if(array[i] < 0 || array[i] > len - 1) {
				return false;
			}
		}
		for(int i = 0; i < len; ++i) {
			int tmp;
			while(i != array[i]) {
				tmp = array[i];
				if(array[i] == array[tmp]) {
					System.out.println();
					System.out.println("重复数字为：" + array[i]);
					return true;
				}
				array[i] = array[tmp];
				array[tmp] = tmp;
			}
		}
		return false;
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
