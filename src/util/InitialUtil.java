package util;

import java.util.Random;

public class InitialUtil {

	/** initIArrayD 中I代表int；D代表disordered；1代表一维
	 * 初始化一个一维int类型乱序数组
	 * @param n 数组元素个数
	 * @param rangeL 数组中元素最小值
	 * @param rangeR 数组中元素最大值
	 * @return 返回数组
	 */
	public static int[] initIArrayD1(int n,int rangeL,int rangeR){
		int[] result = new int[n];
		Random random = new Random();
		for(int i = 0; i < n; ++i){
			result[i] = random.nextInt(rangeR)%(rangeR-rangeL+1)+rangeL;
		}
		return result;
	}
}
