package Interfaces;

public interface BinarySearchTree<T>{
    void insert(T element);
    T min();
    T max();
    boolean contains (T element);
    int height(); //Height of node – The height of a node is the number of edges on the longest downward path between that node and a leaf.
    void remove(T element);
    void inOrderTraversal(); //DFS (Left-Root-Right)
    void preOrderTraversal(); //DFS (Root-Left-Right)
    void postOrderTraversal(); //DFS (Left-Right-Root)
    void breadthFirstTraversal(); //BFS or known as Level Order Traversal
}
