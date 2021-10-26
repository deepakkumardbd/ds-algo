package com.trees;

public class Tree {
    Node root;
    public Tree(Employee emp){
        this.root = new Node(emp);
    }
    public void addNode(Employee emp){
        Node prev = null;
        Node curr = root;
        Node newNode = new Node(emp);
        while(curr != null){
            if(emp.getEid() <= curr.getEmp().getEid()){
                prev = curr;
                curr = curr.getLeft();
            }else{
                prev = curr;
                curr = curr.getRight();
            }
        }
        if(emp.getEid() <= prev.getEmp().getEid()){
            prev.setLeft(newNode);
        }else{
            prev.setRight(newNode);
        }
    }

    public void print(){
        System.out.println("Printing preorder");
        preorder(root);
        System.out.println("Printing post order");
        postorder(root);
        System.out.println("Printing Inorder");
        inorder(root);
    }

    public void preorder(Node curr){
        if(curr == null){
            return;
        }
        System.out.print(curr.getEmp().getEid()+" ");
        preorder(curr.getLeft());
        preorder(curr.getRight());
    }
    public void postorder(Node curr){
        if(curr == null){
            return ;
        }
        postorder(curr.getLeft());
        postorder(curr.getRight());
        System.out.print(curr.getEmp().getEid()+" ");
    }
    public  void inorder(Node curr){
        if(curr == null){
            return;
        }
        inorder(curr.getLeft());
        System.out.print(curr.getEmp().getEid()+" ");
        inorder(curr.getRight());
    }

    public void deleteNode(Employee emp){
        Node curr = root;

    }
}
