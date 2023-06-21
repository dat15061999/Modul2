package Map;

public class TreeNode <E>{
    protected E element;
    protected TreeNode<E>left;
    protected TreeNode<E>right;
    public TreeNode (E e) {
        element =  e;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(60);
        root.left = new TreeNode<>(55);
        root.right = new TreeNode<>(100);
    }
//    public boolean search(E element) {
//        TreeNode<E> current = root;
//    }
}
