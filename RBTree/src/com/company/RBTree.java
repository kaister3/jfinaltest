package com.company;

public class RBTree<Integer> {
    private RBTNode root;
    final int COLOR_RED = 1;
    final int COLOR_BLK = 0;

    private class RBTNode<Integer> {
        boolean color;
        int val;
        RBTNode left;
        RBTNode right;
        RBTNode parent;
        RBTNode(int v, RBTNode par, RBTNode left, RBTNode right, boolean color){
            this.color = color;
            this.parent = par;
            this.left = left;
            this.right = right;
            this.val = v;
        }
    }

    private void leftSpin(RBTNode x){
        RBTNode y = x.right;
        if (y.left!=null){
            x.right = y.left;
        }
        y.parent = x.parent;

        if (x.parent==null){
            this.root = y;
        }
        else if (x.parent.left == x){
            x.parent.left = y;
        }
        else if (x.parent.right == x){
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    private void rightSpin(RBTNode x){
        RBTNode y = x.left;
        if (y.right != null){
            x.left = y.right;
        }
        y.parent = x.parent;

        if (x.parent.left == x){
            x.parent.left = y;
        }
        else if (x.parent.right == x){
            x.parent.right = y;
        }
        else if (x.parent == null){
            this.root = y;
        }
        y.right = x;
        x.parent = y;
    }


}
