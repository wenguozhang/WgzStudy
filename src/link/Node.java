package link;

public class Node {
    //Ϊ�˷��㣬������������ʹ��public��������private�Ͳ���Ҫ��дget��set�����ˡ�
    //������ݵı������򵥵㣬ֱ��Ϊint��
    public int data;
    //��Ž��ı���,Ĭ��Ϊnull
    public Node next;
    
    //���췽�����ڹ���ʱ���ܹ���data��ֵ
    public Node(int data){
        this.data = data;
    }
    
    public int getData(){
        return this.data;
    }
    
    public Node getNext(){
    	return this.next;
    }
    
    public void setNext(Node next){
        this.next = next;
    }

}