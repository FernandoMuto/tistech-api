/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.tistech.services;

import api.tistech.models.BinaryTree;

/**
 *
 * @author Fernando Muto
 */
public class BinaryTreeService {
    
    public static BinaryTree root;

    public BinaryTreeService() {
         
    }
    
    public void insertNode(int valor){
        BinaryTree newNode = new BinaryTree(valor);
        
        if(root == null){
            root = newNode;
        }else{
            
          BinaryTree currentNode = root;
          BinaryTree previewNode;
          
          while(true){
             previewNode = currentNode ;
             if(valor <= currentNode.getValue()){
                 currentNode = currentNode.getLeft();
                 if(currentNode == null){
                   previewNode.setLeft(newNode);  
                   return;
                 }
             }else{
               currentNode = currentNode.getRight();
               if(currentNode == null){
                   previewNode.setRight(newNode); 
                   return;
               }
             }
          }
        }
    }
    
    public int sumSubsequent(int value){
       return auxSumSubsequent(findNode(value));
    }
    
    public BinaryTree findNode(int value){
         if(root == null) return null;
         BinaryTree currentNode = root;
         while (currentNode.getValue() != value) {            
            if(value < currentNode.getValue())
                currentNode = currentNode.getLeft();
            else
                currentNode = currentNode.getRight();
            if(currentNode == null) return null;
        }
         
        return currentNode;
    }
    
    public int auxSumSubsequent(BinaryTree node){
        return auxSum(node.getLeft())+auxSum(node.getRight());
    }
    
    public int auxSum(BinaryTree node){
         if(node==null) return 0;
         else{
           int sum = 0;
           sum += auxSum(node.getLeft());
           sum += auxSum(node.getRight());
           sum += node.getValue();
           return sum;
         }
    }
    
    
}
