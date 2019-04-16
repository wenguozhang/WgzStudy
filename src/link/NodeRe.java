package link;
 
/**
 * Created by wgz on 2018/8/16
 * 链表
 */
public class NodeRe {
 
    public static void main(String[] args) {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        
//        head = reverse(head);
 
        while (null != head) {
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
    }
 
    public  Node reverse(Node head){
        if(head == null || head.getNext() == null){
            return head;
        }
        Node reHead = reverse(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return reHead;
    }
}
