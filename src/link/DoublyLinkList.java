package link;
/**
 * 自定义一个双向链表
 * @author wgz
 *
 */
public class DoublyLinkList {
	private Node first;
	private Node last;
	private int size;
	
	public DoublyLinkList() {
		first = null;
		last = null;	
		size = 0;
	}
	
	//头部插入
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			last = newNode;
		}else {//如果不是第一个结点的情况
			first.before = newNode;	//将还没插入新结点之前链表的第一个结点的before指向newNode
			newNode.next = first;		//将新结点的next指向first
		}
		first = newNode;			//将新结点赋给first（链接）成为第一个结点
		size++;
	}
	
	//尾部插入
	public void insertLast(int data) {
		Node newNode = new Node(data);	
		if(isEmpty()) {
			first = newNode;		//若链表为空，则将first指向新的结点（newNode）
		}else {
			newNode.before = last;//将last的before指向last（last永远指向的是最后一个结点）【此时还没有插入新的结点newNode，所以last指向的是当前链表的最后一个结点】
			last.next = newNode;	//将last.next(当前链表最后一个结点的next域)指向新的结点newNode
		}
		last = newNode;				//由于插入了一个新的结点，又因为是尾部插入，所以将last指向newNode
		size++;
	}			
	
	//某个结点的后部插入
	public void insertAfter(int key,int data) {
		Node newNode = new Node(data);
		Node current = first;
		while((current!=null)&&(current.data!=key)) {
			current = current.next;
		}
		//若当前结点current为空
		if(current==null) {					//current为null,直接插入到最后
			insertLast(data);
		}else {
			if(current==last) {					//找到了key值
				newNode.next = null;			//1、这是最后一个节点
				last = newNode;					//将last指向newNode
			}else {
				newNode.next = current.next;		//2、两结点中间插入                       
				current.next.before = newNode;	
			}										
			current.next = newNode;					//将当前结点的next域指向newNode
			newNode.before = current;				//将新结点的before域指向current
 
		}
		size++;
	}
	
	//检查链表是否为空
	public boolean isEmpty() {
		return (first==null);
		
	}
	
	//从头部删除结点
	public Node deleteFirst() {
		Node temp = first;
		if(first.next==null) {			//若链表只有一个结点，删除后链表为空，将last指向null
			last = null;
		}else {
			first.next.before = null;		//若链表有两个（包括两个）以上的结点 ，因为是头部插入，则first.next将变成第一个结点，其before将变成null
		}
		first = first.next;				//将first.next赋给first
		size--;
		return temp;					//返回删除的结点
	}
	
	//从尾部删除结点
	public Node deleteLast() {
		Node temp = last;
		if(first.next == null) {		//如果链表只有一个结点，则删除以后为空表,last指向null
			first = null;
		}else {
			last.before.next = null;	//将上一个结点的next域指向null
		}
		last = last.before;			//上一个结点称为最后一个结点，last指向它
		size--;
		return temp;					//返回删除的结点
	}
	
	//按值删除
	public Node deleteKey(int key) {
		Node current = first;
		while(current!=null&&current.data!=key) {		//遍历链表寻找该值所在的结点
			current = current.next;
		}
		if(current==null) {						//若当前结点指向null则返回null，
			return null;						//两种情况当前结点指向null，一是该链表为空链表，而是找不到该值
		}else {
			if(current==first) {				//如果current是第一个结点
				first = current.next;			//则将first指向它，将该结点的before指向null,其余不变
				current.next.before = null;
			}else if(current==last){			//如果current是最后一个结点
				last = current.before;		//将last指向当前结点的上一个结点（我们将当前结点除名了以后它便不再是最后一个了）
				current.before.next = null;	//相应的要删除结点的上一个结点的next域应指向null
			}else {
				current.before.next = current.next;		//当前结点的上一个结点的next域应指向当前的下一个结点
				current.next.before  =current.before;	//当前结点的下一个结点的before域应指向当前结点的上一个结点
			}	
		}
		size--;
		return current;		//返回
	}
	
	
	//从头部开始演绎
	public void displayForward() {
		System.out.print("List(first--->last): ");
		Node current = first;
		while(current!=null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
	
	//从尾部开始演绎
	public void displayBackward() {
		System.out.print("List(last--->first): ");
		Node current = last;
		while(current!=null) {
			current.displayNode();
			current = current.before;
		}
		System.out.println();
	}
	
	public int size(){
		return size;
	}
}