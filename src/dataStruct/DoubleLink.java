package dataStruct;

/**
 * �ֶ�ʵ�ֵ�˫��ѭ������
 * @author Wen
 *
 */
public class DoubleLink<T> {
	
	//��ͷ
	private DNode<T> mHead;
	//�ڵ����
	private int mCount;
	
	public class DNode<T>{
		public DNode prev;
		public DNode next;
		public T value;
		
		public DNode(T value,DNode prev,DNode next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}

	//���캯��
	public DoubleLink(){
		//������ͷ��ע���ͷû�����ݵ�
		mHead= new DNode<T>(null, null, null);
		mHead.prev = mHead.next = mHead;
		mCount = 0;
	}
	
	//���ؽڵ���Ŀ
	public int size(){
		return mCount;
	}
	
	//�ж��Ƿ�Ϊ��
	public boolean isEmpty(){
		return mCount == 0;
	}
	
	//��ȡindexλ�õĽڵ�ֵ
	private DNode<T> getNode(int index){
		//���index�Ƿ�Ϸ�
		if(index < 0 || index > mCount-1)
			throw new IndexOutOfBoundsException();
		//��ǰ����˳�����
		if(index < mCount/2){
			
		}
		return null;
	}
}
