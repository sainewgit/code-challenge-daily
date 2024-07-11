package tree;

public class BinaryTree {
    public void preOrder(BinaryNode rootNode) {
        if (rootNode == null) {
            return;
        }
        System.out.println(rootNode.data);
        preOrder(rootNode.left);
        preOrder(rootNode.right);
    }
    public void levelOrder(BinaryTree rootNode)
    {

    }
}
