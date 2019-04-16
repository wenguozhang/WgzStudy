package link;

/**
 * 测试双向链表
 * @author Administrator
 *
 */
public class TestDoublyLinkList {
	public static void main(String[] args) {
		DoublyLinkList theList = new DoublyLinkList(); 
		theList.insertFirst(20);
		theList.insertFirst(40);
		theList.insertFirst(60);
		theList.insertLast(10);
		theList.insertLast(30);
		theList.insertLast(50);
 
		theList.displayForward();
		theList.displayBackward();
		System.out.println(theList.size());
		
		theList.deleteFirst();
		theList.deleteLast();
		theList.deleteKey(10);
		
		theList.displayForward();
		System.out.println(theList.size());
		
		theList.insertAfter(20, 70);
		theList.insertAfter(30, 80);
		
		theList.displayForward();
		theList.displayBackward();
		System.out.println(theList.size());
	}
}