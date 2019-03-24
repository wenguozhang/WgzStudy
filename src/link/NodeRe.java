package link;
 
/**
 * Created by david on 2018/8/16
 * ������ת
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
        // ���÷�ת����
        head = reverse(head);
 
        // ��ӡ��ת��Ľ��
        while (null != head) {
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
    }
 
    public static Node reverse(Node head){
        // head������ǰһ��㣬head.getNext()�ǵ�ǰ��㣬
        // reHead�Ƿ�ת���������ͷ���
        if(head == null || head.getNext() == null){
            // ��Ϊ�������ߵ�ǰ�����β��㣬��ֱ�ӻ���
            return head;
        }
        Node reHead = reverse(head.getNext());
        // ����ǰ����ָ����ָ��ǰһ���
        head.getNext().setNext(head);
        // ǰһ����ָ������Ϊnull;
        head.setNext(null);
        // ��ת���������ͷ���
        return reHead;
    }
}
