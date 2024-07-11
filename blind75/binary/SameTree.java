package blind75.binary;

public class SameTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.left.left = new Node(5);
        root.right.right = new Node(6);
        
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.right.left = new Node(4);
        root1.right.left.left = new Node(5);
        root1.right.right = new Node(6);
        
       System.out.println(sameTree(root,root1));
    }

    private static boolean sameTree(Node p, Node q) {
        if (p==null || q==null) return (p==q);
        return( p.data==q.data) && sameTree(p.left,q.left)&& sameTree(p.right,q.right);
    }
}
