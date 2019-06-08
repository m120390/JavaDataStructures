package Test;

import DataStructures.BinarySearchTree;

public class testBinarySearchTree {

    public static void main(String[] arg){

        //Test Case #1: Create a BST and add 6 elements to it. Print binary tree out to confirm stored correctly
        BinarySearchTree BST = new BinarySearchTree();
        BST.insert(8);
        BST.insert(6);
        BST.insert(10);
        BST.insert(14);
        BST.insert(3);
        BST.insert(7);
        BST.insert(2);
        BST.insert(9);
        BST.printTreeLtR();

        /*

        //Test Case #2: Find the minimum value in a binary search tree
        System.out.println("\nThe minimum value in this BST is: " + BST.min());

        //Test Case #3: Find the maximum value in a binary search tree
        System.out.println("The maximum value in this BST is: " + BST.max());

        //Test Case #4: Does it contain elements
            //Run a test case where the desired element is not contained in the BST
            System.out.println("Does the BST contain 20: " + BST.contains(20));

            //Run a test case where the desired element is contained in the BST
            System.out.println("Does the BST contain 8: " + BST.contains(8));

        //Test Case #5: Test the height of the tree
        System.out.println("The height of the BST is: " + BST.height());

        //Test Case #6: Print the binary tree through inOrderTraversal
        System.out.print("In Order: ");
        BST.inOrderTraversal();

        //Test Case #7: Print the binary tree through preOrderTraversal
        System.out.print("\nPre Order: ");
        BST.preOrderTraversal();

        //Test Case #8: Print the binary tree through preOrderTraversal
        System.out.print("\nPost Order: ");
        BST.postOrderTraversal();

        //Test Case #9: Print the binary tree through breadthFirstTraversal
        System.out.print("\nBreadth First Traversal or Level Order: ");
        BST.breadthFirstTraversal();

        System.out.println();
        //Test Case #10: Remove a leaf node, remove a node with one child, remove a node with two children, remove the
        //root node
        //BST.remove(14);
        //BST.remove(3);
        //BST.remove(6);
        //BST.remove(8);
        //BST.printTreeLtR();

        //Test Case #11: Print external leaves
        System.out.print("All external leaves: ");
        BST.printExternalLeaves();

        */

    }
}
