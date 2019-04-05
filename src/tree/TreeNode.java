package tree;
public class TreeNode {
	// 左节点
	private TreeNode leftNode;
	// 右节点
	private TreeNode rightNode;
	// 数据
	private int value;
	
	private boolean isDelete;
	
	public TreeNode getLeftNode() {
	 return leftNode;
	}
	
	public void setLeftNode(TreeNode leftNode) {
	 this.leftNode = leftNode;
	}
	
	public TreeNode getRightNode() {
	 return rightNode;
	}
	
	public void setRightNode(TreeNode rightNode) {
	 this.rightNode = rightNode;
	}
	
	public int getValue() {
	 return value;
	}
	
	public void setValue(int value) {
	 this.value = value;
	}
	
	public boolean isDelete() {
	 return isDelete;
	}
	
	public void setDelete(boolean isDelete) {
	 this.isDelete = isDelete;
	}
	
	public TreeNode() {
	 super();
	}
	
	public TreeNode(int value) {
	 this(null, null, value, false);
	}
	
	public TreeNode(TreeNode leftNode, TreeNode rightNode, int value,
	  boolean isDelete) {
	 super();
	 this.leftNode = leftNode;
	 this.rightNode = rightNode;
	 this.value = value;
	 this.isDelete = isDelete;
	}
	
	 public TreeNode(int value, TreeNode leftNode, TreeNode rightNode){
		 this.leftNode = leftNode;
		 this.rightNode = rightNode;
		 this.value = value;
	 }
	
	@Override
	public String toString() {
	 return "TreeNode [leftNode=" + leftNode + ", rightNode="
	   + rightNode + ", value=" + value + ", isDelete=" + isDelete
	   + "]";
	}
	

}