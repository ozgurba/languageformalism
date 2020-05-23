function objToString (obj) {
    var str = '';
    for (var p in obj) {
        if (obj.hasOwnProperty(p)) {
            str += p + ':' + obj[p]+" ";
        }
    }
    return str;
} 
// Node class 
class Node {
    constructor(data,precedence) {
        this.data = data;
        this.precedence = precedence;
        this.children=[];
        this.isBinary=true;
        this.left = null;
        this.right = null;
    }
    toString(){
         console.log(this.strExpression());
    }
    strExpression() {
        var token='';
        if(this.left) {
            token=token.concat('(');
            token=token.concat(this.left.strExpression());
            token=token.concat(')');
        }
        token=token.concat(' '+this.data.getText()+' ');
        if(this.right) {
            token=token.concat('(');
            token=token.concat(this.right.strExpression());
            token=token.concat(')');
        }
        return token;
    }
    setChildren(children){
        this.isBinary=false;
        this.children=children;
    }
    getChildren(){
        if(this.isBinary){
            if(this.right)
                return [this.left,this.right];
            if(this.left)
                return [this.left];
            return [];
        }
        return this.children;
    }
       
}

// Action tree class 
class ActionTree {
    constructor() {
        // root of a binary seach tree 
        this.root = null;
    }
    // helper method which creates a new node to 
    // be inserted and calls insertNode 
    insert(data,precedence) {
        // Creating a node and initailising 
        // with data 
        var newNode = new Node(data,precedence);
        if (this.root === null)
            this.root = newNode;
        else
            this.insertNode(this.root,newNode,null);
        
    }

    insertNode(node,newNode,parentNode){
        // node is null then node will 
        // be added to the tree and made root. 
        if(node==null){
            parentNode.right=newNode;
        }
        else if(newNode.precedence<=node.precedence){
            newNode.left=node;
            if(parentNode===null) {
                this.root=newNode;
            } else{
                parentNode.right=newNode;
            }
        } else{
            this.insertNode(node.right,newNode,node);
        }
    }

    insertTree(tree,precedence) {
        this.updatePrecedence(tree,precedence);
        if (this.root === null) {
            this.root = tree.root;
        }
        else {
            this.insertNode(this.root,tree.root,null);
        }   
    }

    updatePrecedence(tree,precedence){
        if(!tree.root)
            return;
        this.updatePrecedenceHelper(tree.root,precedence);

    }
    updatePrecedenceHelper(node,precedence){
        if(!node)
            return;
        this.updatePrecedenceHelper(node.left);
        node.precedence=precedence;     
        this.updatePrecedenceHelper(node.right);
    }

    

    inorderTraversal(){
        if(this.root!=null){
            this.inorder(this.root);
        }
    }
    // Performs inorder traversal of a tree 
    inorder(node) {
        if (node !== null) {
            this.inorder(node.left);
            console.log(node.data);
            this.inorder(node.right);
        }
    }

    // Performs preorder traversal of a tree	 
    preorder(node) {
        if (node !== null) {
            console.log(node.data);
            this.preorder(node.left);
            this.preorder(node.right);
        }
    }
    // Performs postorder traversal of a tree 
    postorder(node) {
        if (node !== null) {
            this.postorder(node.left);
            this.postorder(node.right);
            console.log(node.data);
        }
    }

    // returns root of the tree 
    getRootNode() {
        return this.root;
    }
    toString(){
        if(this.root)
            this.root.toString();
    }

}

class Operator{
    constructor(value,precedence){
        this.value=value;
        this.precedence=precedence;
    }
}
/*var operator15=new Operator(15,5);
var operator16=new Operator(16,5);
var operatorPlus=new Operator("+",3);
var operatorStar=new Operator("*",4);
var operator17=new Operator(17,5);
var operatorStar2=new Operator("*",4);
var operator18=new Operator(18,5);
var operatorOr=new Operator("||",2);
var operator10=new Operator(10,5);
var operatorStar3=new Operator("*",4);
var operator9=new Operator(9,5);

var operators=[operator15,operatorPlus,operator16,
    operatorStar,operator17,operatorStar2,operator18
    ,operatorOr,operator10,operatorStar3,operator9];
// create an object for the BinarySearchTree 
var binaryTree = new ActionTree();

for(operator of operators){
    binaryTree.insert(operator,operator.precedence);
}
console.log(binaryTree);
binaryTree.toString();

*/
module.exports={
    ActionTree:ActionTree,
    Node:Node
};