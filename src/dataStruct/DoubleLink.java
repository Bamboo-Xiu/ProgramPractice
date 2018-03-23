package dataStruct;

/**
 * 手动实现的双向循环链表
 * @author Wen
 *
 */
public class DoubleLink<T> {
	
	//表头
	private DNode<T> mHead;
	//节点个数
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

	//构造函数
	public DoubleLink(){
		//创建表头，注意表头没有数据的
		mHead= new DNode<T>(null, null, null);
		mHead.prev = mHead.next = mHead;
		mCount = 0;
	}
	
	//返回节点数目
	public int size(){
		return mCount;
	}
	
	//判断是否为空
	public boolean isEmpty(){
		return mCount == 0;
	}
	
	//获取index位置的节点值
	private DNode<T> getNode(int index){
		//检查index是否合法
		if(index < 0 || index > mCount-1)
			throw new IndexOutOfBoundsException();
		//从前往后顺序查找
		if(index < mCount/2){
			
		}
		return null;
	}
}
