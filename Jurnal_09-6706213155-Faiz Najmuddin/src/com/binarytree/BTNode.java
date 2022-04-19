package com.binarytree;

/* Class BTNode */
class BTNode<E>{
    BTNode left, right;
    E data;
    /* Constructor */
    public BTNode()
    {
        left = null;
        right = null;
        data = null;
    }
    /* Constructor */
    public BTNode(E item)
    {
        left = null;
        right = null;
        data = item;
    }
    /* Function to set left node */
    public void setLeft(BTNode n)
    {
        left = n;
    }
    /* Function to set right node */
    public void setRight(BTNode n)
    {
        right = n;
    }
    /* Function to get left node */
    public BTNode getLeft()
    {
        return left;
    }
    /* Function to get right node */
    public BTNode getRight()
    {
        return right;
    }
    /* Function to set data to node */
    public void setData(E d)
    {
        data = d;
    }
    /* Function to get data from node */
    public E getData()
    {
        return data;
    }
}