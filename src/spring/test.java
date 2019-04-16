package spring;

import java.lang.reflect.Method;

import link.Node;
import link.NodeRe;

public class test {
	public static void main(String[] args) throws Exception{
		Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        
		String className = "link.NodeRe";
		Class clazz = Class.forName(className);
		NodeRe nodeR = (NodeRe) clazz.newInstance();
		Method[] mm = clazz.getDeclaredMethods();
		for(Method m : mm)
			System.out.println(m.getName());
		Method method = clazz.getMethod("reverse", Node.class);
		Node reHead = (Node) method.invoke(nodeR, head);
		
		while (null != reHead) {
            System.out.print(reHead.getData() + " ");
            reHead = reHead.getNext();
        }
	}
}
