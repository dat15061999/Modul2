package Danhsach2;

public class Node {
    protected Node next;
    protected Object data;

    public Node(Object data) {
        this.data = data;
    }
    public Object getData() {
        return this.data ;
    }
}
