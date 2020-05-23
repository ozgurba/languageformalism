/**
 * Binary Tree
 * (c) 2014 Ben Lesh <ben@benlesh.com>
 * MIT license
 */

/*
 * A simple Binary Tree implementation in JavaScript
 */

function BinaryTree() {
    var self = this;
    var root;
    var left;
    var right;
    function postorderTraversal() {
        this.postorderHelper(self.root);
    }
    
    function postOrderHelper(root) {
        if (root !== null) {
           postOrderHelper(left);
           postOrderHelper(right);
           console.log(root);
        }
     }

     self.search = function(value){
         return searchHelper(self,value);
     }

     function searchHelper(binaryTree,value) {
         if(binaryTree.root==value){
             return root;
         }
         if(binaryTree.left!=null) 
            searchHelper(binaryTree.left,value);
        if(binaryTree.right!=null)
            searchHelper(binaryTree.right,value);
         return null;
     }

     self.toString=function(){
        self.left?self.left.toString():undefined; 
        console.log(self.root);
        self.right?self.right.toString():undefined;
     }

};

console.log("test");

var binaryTree=new BinaryTree();
binaryTree.root="3";
var binaryTreePlus=new BinaryTree();
binaryTreePlus.root="+";
binaryTreePlus.left=binaryTree;
console.log(binaryTreePlus);
//binaryTreePlus.toString();
console.log(binaryTreePlus.search("3"));