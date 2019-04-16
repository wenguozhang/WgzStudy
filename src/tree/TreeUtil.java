package tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wgz
 * 
 * @time 2019年4月2日下午3:48:04
 */
public class TreeUtil {
	public static void main(String[] args){
		TreeNode tree = init();
		System.out.println("深度："+getMaxDepth(tree));
		System.out.println("宽度："+getMaxWidth(tree));
		theFirstTraversal(tree);//前序：中左右
		System.out.println();
		theInOrderTraversal(tree);//中序：左中右
		System.out.println();
		thePostOrderTraversal(tree);//后序：左右中
	}
	public static TreeNode init() {//注意必须逆序建立，先建立子节点，再逆序往上建立，因为非叶子结点会使用到下面的节点，而初始化是按顺序初始化的，不逆序建立会报错  
		TreeNode J = new TreeNode(8, null, null);  
		TreeNode H = new TreeNode(4, null, null);  
		TreeNode G = new TreeNode(2, null, null);  
		TreeNode F = new TreeNode(7, null, J);  
		TreeNode E = new TreeNode(5, H, null);  
		TreeNode D = new TreeNode(1, null, G);  
		TreeNode C = new TreeNode(9, F, null);  
		TreeNode B = new TreeNode(3, D, E);  
		TreeNode A = new TreeNode(6, B, C);  
		return A;   //返回根节点  
	}
	
	/** 树的深度 */
	public static int getMaxDepth(TreeNode root) {
	    if (root == null)
	        return 0;
	    else {
	        int left = getMaxDepth(root.getLeftNode());
	        int right = getMaxDepth(root.getRightNode());
	        return 1 + Math.max(left, right);
	    }
	}
    /** 树的宽度 */
    public static int getMaxWidth(TreeNode root) {
    	if (root == null)
    		return 0;
    	Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
    	int maxWitdth = 1; // 最大宽度
    	queue.add(root); // 入队
	    while (true) {
	        int len = queue.size(); // 当前层的节点个数
	        if (len == 0)
	            break;
	        while (len > 0) {// 如果当前层，还有节点
	            TreeNode t = queue.poll();
	            len--;
	            if (t.getLeftNode() != null)
	                queue.add(t.getLeftNode()); // 下一层节点入队
	            if (t.getRightNode() != null)
	                queue.add(t.getRightNode());// 下一层节点入队
	        }
	        maxWitdth = Math.max(maxWitdth, queue.size());
	    }
	    return maxWitdth;
    }
    
    public static void printNode(TreeNode node){  
        System.out.print(node.getValue());  
    }  
    public static void theFirstTraversal(TreeNode root) {  //前序遍历  
        printNode(root);  
        if (root.getLeftNode() != null) {  //使用递归进行遍历左孩子  
            theFirstTraversal(root.getLeftNode());  
        }  
        if (root.getRightNode() != null) {  //递归遍历右孩子  
            theFirstTraversal(root.getRightNode());  
        }  
    } 
    public static void theInOrderTraversal(TreeNode root) {  //中序遍历  
        if (root.getLeftNode() != null) {  
            theInOrderTraversal(root.getLeftNode());  
        }  
        printNode(root);  
        if (root.getRightNode() != null) {  
            theInOrderTraversal(root.getRightNode());  
        }  
    }
    public static void thePostOrderTraversal(TreeNode root) {  //后序遍历  
        if (root.getLeftNode() != null) {  
            thePostOrderTraversal(root.getLeftNode());  
        }  
        if(root.getRightNode() != null) {  
            thePostOrderTraversal(root.getRightNode());  
        }  
        printNode(root);  
    }  
    
    public static void LaywerTraversal(TreeNode root){
       if(root==null) return;
       LinkedList<TreeNode> list = new LinkedList<TreeNode>();  
       list.add(root);
       TreeNode currentNode;
       while(!list.isEmpty()){
           currentNode=list.poll();
           printNode(currentNode);  
           if(currentNode.getLeftNode()!=null){
               list.add(currentNode.getLeftNode());
           }
           if(currentNode.getRightNode()!=null){
               list.add(currentNode.getRightNode());
           }
       }
   }
}

