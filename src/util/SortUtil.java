package util;

public class SortUtil {
	
	/**
	 * 冒泡排序-升序
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
	 * 选择排序-升序
	 * @param array
	 */
	public static void SelectSort(int[] array){
		int length = array.length;
		int tmp;
		int pos;//记录最小值的索引
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
	 * 插入排序-升序
	 * @param array
	 */
	public static void InsertSort(int[] array){
		/*int length = array.length;
		int tmp;
		for(int i = 1; i < length; ++i){
			//外循环是未排序元素
			tmp = array[i];	//取出第一个待插入元素
			int j = i-1; 	//有序数列最后一个数索引
			for(;j >=0; --j){
				//内循环是从后往前查找待插入元素的位置
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
