package tree;

public class Test {
    public static void main(String[] args) {
        BinaryNode bn = new BinaryNode(1);
        bn.right = new BinaryNode(2);
        bn.left = new BinaryNode(3);
        BinaryTree bt=new BinaryTree();
        bt.preOrder(bn);

    }
}
