class TreeNode{
    int value;
    TreeNode left, right;
    TreeNode(int value){
        this.value = value;
        left=right=null;
    }
}
public class TreeTraversal2{
    public void preorder(TreeNode node){
        if(node==null){
            return;
        }
    
    System.out.print(node.value+" ");
    preorder(node.left);
    preorder(node.right);
    } 
    public void inorder(TreeNode node){
        if(node==null){
            return;
        }
    inorder(node.left);
    System.out.print(node.value+" ");
    inorder(node.right);
    } 
    public void postorder(TreeNode node){
        if(node==null){
            return;
        }
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.value+" ");
    } 

    public static void main(String[] args) {
        TreeNode root= new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(3);
        root.left.left.right=new TreeNode(9);
        root.left.left.right.left=new TreeNode(1);
        root.right.left=new TreeNode(7);
        root.right.right=new TreeNode(6);
        root.right.right.left=new TreeNode(8);

        TreeTraversal2 tree=new TreeTraversal2();
        System.out.println("Pre order traversal :");
        tree.preorder(root);
        System.out.println("\nIn order traversal :");
        tree.inorder(root);
        System.out.println("\nPost order traversal :");
        tree.postorder(root);
}
}
