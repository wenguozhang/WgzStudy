package link;
 
/**
 * Created by david on 2018/8/16
 * 单链表反转
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
        // 调用反转方法
        head = reverse(head);
 
        // 打印反转后的结果
        while (null != head) {
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
    }
 
    public static Node reverse(Node head){
        // head看作是前一结点，head.getNext()是当前结点，
        // reHead是反转后新链表的头结点
        if(head == null || head.getNext() == null){
            // 若为空链或者当前结点在尾结点，则直接还回
            return head;
        }
        Node reHead = reverse(head.getNext());
        // 将当前结点的指针域指向前一结点
        head.getNext().setNext(head);
        // 前一结点的指针域令为null;
        head.setNext(null);
        // 反转后新链表的头结点
        return reHead;
    }
}
