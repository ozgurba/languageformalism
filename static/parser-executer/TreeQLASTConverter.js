
var antlr4 = require('../antlr4/index');
var TreeQLListener = require('../generated-parser/TreeQLListener').TreeQLListener;
var TreeqlLexer = require('../generated-parser/treeqlLexer');
var TreeqlParser = require('../generated-parser/treeqlParser');
var buckets = require('../lib/buckets');
var precedenceMap = new Map([[',' , 0], 
                                ['&&',1],['||',1],
                                ['==',2], ['!=',2], ['>',2], ['>=',2], ['<',2], ['<=',2],
                            ['+' , 3] ,['-', 3],
                            ['*' , 4] ,['/', 4],['%',4] 
                            ]);
const maxPrecedence=4;
TreeQLASTConverter = function() {    
    TreeQLListener.call(this); // inherit default listener
    return this;
};
// inherit default listener
TreeQLASTConverter.prototype = Object.create(TreeQLListener.prototype);
TreeQLASTConverter.prototype.constructor = TreeQLASTConverter;


// Enter a parse tree produced by TreeQLParser#arithmeticLogicExpression.
TreeQLASTConverter.prototype.enterArithmeticLogicExpression = function(ctx) {
    };

TreeQLASTConverter.prototype.createASTTree=function(ctx) {
    var binaryTree=new BinaryTree();
    binaryTree.root=new BinaryTreeNode(value, item);
    console.log(binaryTree);

};

TreeQLASTConverter.prototype.simplifyExpression = function(ctx) {
    var updatedCtx=ctx;
    var updatedChildren=[];
    var precedenceArray=new Array(maxPrecedence);
    var i=1;
    for(;i<ctx.getChildCount();i++){
        var precedence=precedenceMap.get(ctx.children[i].getText());
        if(precedence==undefined)
            precedence=maxPrecedence-1;
        console.log("TreeQLASTConverter.simplifyExpression:"+precedence);
        if(precedenceArray[precedence]==undefined){
            precedenceArray[precedence]=new buckets.LinkedList();
        }
        precedenceArray[precedence].add(ctx.children[i]);
        this.promote(updatedChildren,precedenceArray);
    }
};

TreeQLASTConverter.prototype.promote = function(children,precedenceArray) {
    this.testTree(children,precedenceArray);
    var i=0;
    for(;i<precedenceArray.length;i++){
        if(precedenceArray[i]!=undefined){
            console.log("precedenceArray: "+i+":")
            var j=0;
            for(;j<precedenceArray[i].size();j++) {
                console.log(precedenceArray[i].elementAtIndex(j).getText());
            }
        }
    }
};
TreeQLASTConverter.prototype.testTree = function(children,precedenceArray) {
    var binaryTree=new BinaryTree();
    binaryTree.root=new BinaryTreeNode(value, item);
    console.log(binaryTree);

}
exports.TreeQLASTConverter = TreeQLASTConverter;