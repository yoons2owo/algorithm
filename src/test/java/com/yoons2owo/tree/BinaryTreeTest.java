package com.yoons2owo.tree;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BinaryTreeTest {

    @Test
    public void givenBinaryTree_WhenNotAdding_ThenTreeIsEmpty() {
        BinaryTree binaryTree = new BinaryTree();
        assertTrue(binaryTree.isEmpty());
    }

    @Test
    public void givenBinaryTree_WhenAdding_ThenTreeNotEmpty() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(6);
        binaryTree.add(4);
        binaryTree.add(8);
        binaryTree.add(3);
        binaryTree.add(5);
        binaryTree.add(2);
        assertFalse(binaryTree.isEmpty());
    }

}
