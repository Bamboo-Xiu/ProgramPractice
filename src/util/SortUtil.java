package util;

public class SortUtil {
	
	/**
	 * ð������-����
	 * @param array
	 */
	public static void BubbleSort(int[] array){
		int length = array.length;
		int tmp=0;
		for(int i = 0; i < length-1; ++i){
			for(int j = 0; j < length-1-i; ++j){
				if(array[j] > array[j+1]){
					tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
	}
	
	
	/**
	 * ѡ������-����
	 * @param array
	 */
	public static void SelectSort(int[] array){
		int length = array.length;
		int tmp;
		int pos;//��¼��Сֵ������
		for(int i = 0; i < length-1; ++i){
			pos = i;
			for(int j = i; j < length; ++j){
				if(array[j] < array[pos]){
					pos = j;
				}
			}
			tmp = array[pos];
			array[pos] = array[i];
			array[i] = tmp;
		}
	}
	
	
	/**
	 * ��������-����
	 * @param array
	 */
	public static void InsertSort(int[] array){
		/*int length = array.length;
		int tmp;
		for(int i = 1; i < length; ++i){
			//��ѭ����δ����Ԫ��
			tmp = array[i];	//ȡ����һ��������Ԫ��
			int j = i-1; 	//�����������һ��������
			for(;j >=0; --j){
				//��ѭ���ǴӺ���ǰ���Ҵ�����Ԫ�ص�λ��
				if(tmp < array[j]){
					array[j+1] = array[j];
				}else{
					break;
				}
			}
			array[j+1] = tmp;
		}*/
		
		int lenght = array.length;
		int tmp;
		for(int i = 1; i < lenght; ++i){
			tmp = array[i];
			int j;
			for(j = i-1; j>=0 && tmp<array[j]; --j){
				array[j+1] = array[j];
			}
			array[j+1] = tmp;
		}
	}
	
	
	
}
