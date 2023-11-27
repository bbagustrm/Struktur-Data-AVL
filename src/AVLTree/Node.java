package AVLTree;

public class Node {

    String data;
    Node left;
    Node right;
    int height;

    public Node(String data) {
        this.data = data;
        this.height = 1;
    }
}