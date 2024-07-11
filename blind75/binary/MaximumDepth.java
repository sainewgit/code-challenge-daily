package blind75.binary;

public class MaximumDepth {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.left.left = new Node(5);
        root.right.right = new Node(6);
        int result = maxLength(root);
        System.out.println(result);
    }

    private static int maxLength(Node root) {
        if (root == null) return 0;
        int left = maxLength(root.left);
        int right = maxLength(root.right);
        return 1 + Math.max(left, right);
    }
}
