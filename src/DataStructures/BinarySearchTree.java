package DataStructures;

public class BinarySearchTree<T extends Comparable<T>> implements Interfaces.BinarySearchTree<T> {

    private Node root;

    public BinarySearchTree(){
    }

    public void insert(T element){
        root = insert(root, element);
    }

    /*
        //Iterative version of insert
        public void insert(T element){

            Node newNode = new Node(element);

            if(root == null){
                root = newNode;
            }

            else {

                Node<T> currentNode = root;
                boolean notInserted = true;

                while(notInserted){

                    if(element.compareTo(currentNode.element) <= 0){

                        if(currentNode.leftChild == null){
                            currentNode.leftChild = newNode;
                            notInserted = false;
                        }

                        else{ currentNode = currentNode.leftChild;}
                    }

                    else{

                        if(currentNode.rightChild == null){
                            currentNode.rightChild = newNode;
                            notInserted = false;
                        }

                        else{currentNode = currentNode.rightChild;}
                    }
                }
            }

        }
    */

    private Node<T> insert(Node<T> root, T element){

        if (root == null){
            return new Node<>(element);
        }

        //if element to be inserted is less than or equal to current root element, go to left child
        if(element.compareTo(root.element) <= 0){
            root.leftChild = insert(root.leftChild, element);
        }

        //if element to be inserted is more than current root element, go to right child
        else{
            root.rightChild = insert(root.rightChild, element);
        }

        return root;
    }

    public boolean contains(T element){
        return contains(root, element);
    }

    private boolean contains(Node<T> root, T element){
        if (root == null){
            return false;
        }

        if(element.compareTo(root.element) == 0){
            return true;
        }

        if(element.compareTo(root.element) < 0){
            return contains(root.leftChild, element);
        }

        else{
            return contains(root.rightChild, element);
        }

    }

    public T min(){
        Node<T> minNode= getMin(root);
        return minNode.element;
    }

    private Node<T> getMin(Node<T> root){

        Node<T> currentNode = root;

        if(root == null){
            return new Node(-1);
        }

        while(currentNode.leftChild != null){
            currentNode = currentNode.leftChild;
        }

        return currentNode;
    }

    public T max(){
        Node<T> maxNode= getMax(root);
        return maxNode.element;
    }

    private Node<T> getMax(Node<T> root){

        Node<T> currentNode = root;

        if(root == null){
            return new Node(-1);
        }

        while(currentNode.rightChild != null){
            currentNode = currentNode.rightChild;
        }

        return currentNode;
    }

    @Override
    public int height() {
        return getHeight(root);
    }

    private int getHeight(Node<T> root){

        if(root == null){
            return -1;
        }

        int leftHeight = 1 + getHeight(root.leftChild);

        int rightHeight = 1 + getHeight(root.rightChild);

        return Math.max(leftHeight, rightHeight);
    }

    public void printTreeLtR(){
        printTree(root, 0);
    }

    private void printTree(Node<T> nNode,int pos){
        if (nNode==null) {

            for(int i=0;i<pos;i++)
                System.out.print("\t");

            System.out.println("*");

            return;
        }

        printTree(nNode.rightChild,pos+1);

        for(int i=0;i<pos;i++)
            System.out.print("\t");

        System.out.println(nNode.element);

        printTree(nNode.leftChild,pos+1);
    }

    public void printExternalLeaves(){
        printExternalLeaves(root);
    }

    private void printExternalLeaves(Node<T> root){

        if(root == null){
            return;
        }

        if (root.rightChild == null && root.leftChild == null){
            System.out.print(root.element + " ");
        }

        printExternalLeaves(root.leftChild);
        printExternalLeaves(root.rightChild);
    }

    @Override
    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node<T> root){

        if(root == null){
            return;
        }

        inOrderTraversal(root.leftChild);
        System.out.print(root.element + " ");
        inOrderTraversal(root.rightChild);
    }

    public void preOrderTraversal(){
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node<T> root){
        if(root == null){
            return;
        }

        System.out.print(root.element + " ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    public void postOrderTraversal(){
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node<T> root){
        if(root == null){
            return;
        }

        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.element + " ");
    }

    public void breadthFirstTraversal(){
        breadthFirstTraversal(root);
    }

    private void breadthFirstTraversal(Node<T> root){

        if(root == null){
            return;
        }

        QueueArray<Node<T>> q = new QueueArray<>();
        q.enQueue(root);
        Node<T> currentNode;

        while(q.sizeOfQueue() > 0){

            currentNode = q.deQueue();

            System.out.print(currentNode.element + " ");

            if(currentNode.leftChild != null){
                q.enQueue(currentNode.leftChild);
            }

            if(currentNode.rightChild != null){
                q.enQueue(currentNode.rightChild);
            }
        }

    }

    public void remove(T element){
        if(contains(element)){
            root = remove(root, element);
        }

        else{
            System.out.println("Element to be removed not found!");
        }
    }

    private Node<T> remove(Node<T> root, T element){

        if(element.compareTo(root.element) != 0){

            if(element.compareTo(root.element) < 0){
                root.leftChild = remove(root.leftChild, element);
            }

            else{
                root.rightChild = remove(root.rightChild, element);
            }

        }

        else{
            //Case #1: Node to to be removed has no children
            if(root.rightChild == null && root.leftChild == null){
                return null;
            }

            //Case #2: Node to be removed has only one left node
            else if(root.rightChild == null){
                return root.leftChild;
            }

            //Case #2: Node to be removed has only a right node
            else if(root.leftChild == null){
                return root.rightChild;
            }

            //Case #3: Node to be removed has two children
            else{
                root.element = getMin(root.rightChild).element;
                root.rightChild = remove(root.rightChild, root.element);
            }
        }

        return root;
    }

    private class Node<T>{

        Node<T> leftChild;
        Node<T> rightChild;
        T element;

        public Node(T element) {
            this.element = element;
        }
    }
}



