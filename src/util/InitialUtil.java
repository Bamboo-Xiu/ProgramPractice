package util;

import java.util.Random;

public class InitialUtil {

	/** initIArrayD ��I����int��D����disordered��1����һά
	 * ��ʼ��һ��һάint������������
	 * @param n ����Ԫ�ظ���
	 * @param rangeL ������Ԫ����Сֵ
	 * @param rangeR ������Ԫ�����ֵ
	 * @return ��������
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
