package com.trees;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Definition for a Node1.
class Node1 {
    public int val;
    public Node1 left;
    public Node1 right;
    public Node1 next;

    public Node1() {}
    
    public Node1(int _val) {
        val = _val;
    }

    public Node1(int _val, Node1 _left, Node1 _right, Node1 _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

public class Linear {

    public static void main(String args[]) {
        Node1 root = new Node1(1);
        Node1 rootLeft = new Node1(2);
        Node1 rootRight = new Node1(3);
        Node1 rootLeftLeft = new Node1(4);
        Node1 rootLeftRight = new Node1(5);
        Node1 rootRightleft = new Node1(6);
        Node1 rootrightRight = new Node1(7);
        root.left = rootLeft;
        root.right = rootRight;
        rootLeft.left = rootLeftLeft;
        rootLeft.right = rootLeftRight;
        rootRight.left = rootRightleft;
        rootRight.right = rootrightRight;
        Linear linear = new Linear();
        linear.print(root);
        linear.connect(root);
        linear.print(root);

        Node1 diamroot = new Node1(1);
        Node1 diamrootleft = new Node1(2);
        diamroot.left = diamrootleft;
        Diameter diameter = new Diameter();
        diameter.diameterOfBinaryTree(diamroot);
        System.out.println("Diameter of the tree "+ diameter.max);

//        linear.Print(root);
//        ArrayList<Node1> list = new ArrayList<>();
//        linear.fillArray(root,list);
//        for(int i = 0 ;i < list.size(); i++){
//            System.out.println(list.get(i).val);
//        }


    }

    public void print(Node1 root){
        if(root == null){
            return;
        }
        System.out.println(root.val + "->" + root.next);
        print(root.left);
        print(root.right);
    }

    public Node1 connect(Node1 root) {
        ArrayList<Node1> list = new ArrayList<>();
        fillArray(root, list);
        int i = 0;
        while( 2*i + 2 < list.size()){
//            Node1 temp = list.get(i);
            Node1 left = list.get(i*2+1);
            Node1 right = list.get(i*2+2);
            left.next = right;
            i++;
        }
        return root;
    }

    public void fillArray(Node1 root, ArrayList<Node1> list){
        Queue<Node1> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node1 temp = q.poll();
            list.add(temp);
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
    }
}

class Diameter {
    static int max = 0;
    public int diameterOfBinaryTree(Node1 root) {
        findDiameter(root);
        return max;
    }

    public void findDiameter(Node1 root){
        if(root == null){
            return ;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        int sum = left + right;
        if(sum > max){
            max = sum;
        }
        findDiameter(root.left);
        findDiameter(root.right);
    }
    public int getHeight(Node1 root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(getHeight(root.left),getHeight(root.right));
    }
}
