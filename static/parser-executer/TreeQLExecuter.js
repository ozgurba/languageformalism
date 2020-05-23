var antlr4 = require('../antlr4/index');
var treeqlLexer = require('../generated-parser/TreeQLLexer');
var treeqlParser = require('../generated-parser/TreeQLParser');
var precedenceMap = new Map([[',' , 0], 
                                ['&&',1],['||',1],
                                ['==',2], ['!=',2], ['>',2], ['>=',2], ['<',2], ['<=',2],
                            ['+' , 3] ,['-', 3],
                            ['*' , 4] ,['/', 4],['%',4] 
                            ]);
const maxPrecedence=5;


function executeArithmeticLogicExpression(tree,ruleNames){
    console.log("tree:"+tree+"\n ruleNames:"+ruleNames+"\n Executed inTreeQLExecuter successfully!");

}

function convertToActionTree(tree){
    console.log("tree:"+tree+"\n Executed in TreeQLExecuter.convertToActionTree");
    var convertedTree=convertArithmeticLogicExpressionsForTree(tree);
    return convertedTree;

}

function convertArithmeticLogicExpressions(ctx){
    var binaryTree=new BinaryTree(); 
    var i=0;
    for(;i<ctx.getChildCount();i++){
        var precedence=precedenceMap.get(ctx.children[i].getText());
        if(precedence==undefined)
            precedence=maxPrecedence;
        console.log("TreeQLASTConverter.simplifyExpression:"+precedence);
        binaryTree.insert(ctx.children[i],precedence);
    }
    console.log(binaryTree);
    console.log("TreeQLExecuter.convertArithmeticLogicExpressions");
    return binaryTree;
}


function convertArithmeticLogicExpressionsForTree(ctx){
    var binaryTree=new BinaryTree(); 
    var i=0;
    if(ctx.constructor.name ==='BinaryOperandContext'){
        binaryTree.insert(ctx,maxPrecedence);
        return binaryTree;
    }
    for(;i<ctx.getChildCount();i++){
        var childCtx;
        if(ctx.constructor.name ==='BinaryOperatorContext' || ctx.constructor.name ==='UnaryOperandContext') {
            childCtx=ctx.children[i];
        } else {
            childCtx=convertArithmeticLogicExpressionsForTree(ctx.children[i]);
        }
        var precedence;
        if(childCtx.constructor.name==='BinaryTree'){
            binaryTree.insertTree(childCtx,maxPrecedence);
        } else{
            precedence=precedenceMap.get(childCtx.getText());
            if(precedence==undefined)
            precedence=maxPrecedence;
            binaryTree.insert(childCtx,precedence);
        }
        
    }
    console.log(binaryTree);
    console.log("TreeQLExecuter.convertArithmeticLogicExpressions");
    return binaryTree;
}






