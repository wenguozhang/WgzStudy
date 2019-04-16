package link;

public class Node {
    //节点数据
    public int data;
    //前驱
    public Node before;
    //后继
    public Node next;
    
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getBefore() {
		return before;
	}
	public void setBefore(Node before) {
		this.before = before;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
    
	public Node(int date){
		this.data = date;
	}
	
	public void displayNode(){
		System.out.print(data+";");
	}
}