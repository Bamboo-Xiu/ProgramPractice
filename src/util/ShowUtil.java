package util;

public class ShowUtil {

	/** showIArrayD1 中I代表int；D代表disordered；1代表一维
	 * 显示一维int数组所有元素
	 * @param array
	 */
	public static void showIArrayD1(int[] array){
		for(int i = 0; i < array.length; ++i){
			System.out.print(array[i] + " ");
		}
	}
}
