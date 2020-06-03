"use strict";
var antlr4 = require('../antlr4/index');
var treeqlLexer = require('../generated-parser/TreeQLLexer');
var treeqlParser = require('../generated-parser/TreeQLParser');
var treeClasses=require('../lib/BinaryTree');
var buckets = require('../lib/buckets');
var precedenceMap = new Map([[',' , 0], 
                                ['&&',1],['||',1],
                                ['==',2], ['!=',2], ['>',2], ['>=',2], ['<',2], ['<=',2],
                            ['+' , 3] ,['-', 3],
                            ['*' , 4] ,['/', 4],['%',4] 
                            ]);
const maxPrecedence=5;

class TreeQLActionTreeCreator{    
    constructor(){
        this.leafNodeSet = new buckets.Set();
        this.leafNodeSet.add('BinaryOperatorContext');
        this.leafNodeSet.add('UnaryOperatorContext');
        this.leafNodeSet.add('Signed_numberContext');
        this.leafNodeSet.add('TerminalNodeImpl');

    }
    convertFromStatsExprToActionTree(tree){
        return this.convertExprToActionTree();
    }

    convertExprToActionTree(tree){
        if(!tree||!tree.root)
            return;
        var i=0;
        var childArray[];
        for(;i<tree.getChildCount();i++)
            child[i]=this.convertExprToActionTree(tree.children[i]);
        this.addNodeToActionTree(tree.root);
    }

     convertFromArithmeticLogicExprToActionTree(tree){
        var convertedTree=this.convertArithmeticLogicExpressionsForTree(tree);
        return convertedTree;
    }
    convertArithmeticLogicExpressionsForTree(ctx){
        var actionTree=new treeClasses.ActionTree(); 
        var i=0;
        if(this.leafNodeSet.contains(ctx.constructor.name)){
            actionTree.insert(ctx,maxPrecedence);
            return actionTree;
        }
        for(;i<ctx.getChildCount();i++){
            var childCtx=ctx.children[i];
            if(!this.leafNodeSet.contains(childCtx.constructor.name)) {
                childCtx=this.convertArithmeticLogicExpressionsForTree(ctx.children[i]);
            }
            var precedence;
            if(childCtx.constructor.name==='ActionTree'){
                actionTree.insertTree(childCtx,maxPrecedence);
            } else{
                precedence=precedenceMap.get(childCtx.getText());
                if(precedence==undefined)
                precedence=maxPrecedence;
                actionTree.insert(childCtx,precedence);
            }
            
        }
        return actionTree;
    }    
}
module.exports=TreeQLActionTreeCreator;




