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
const SELECT_PRIORITY=0;
const OTHER_PRIORITY=-1;


class TreeQLActionTreeCreator{    
    constructor(){
        this.leafNodeSet = new buckets.Set();
        this.leafNodeSet.add('BinaryOperatorContext');
        this.leafNodeSet.add('UnaryOperatorContext');
        this.leafNodeSet.add('Signed_numberContext');
        this.leafNodeSet.add('TerminalNodeImpl');

    }
    convertFromStatsExprToActionTree(tree){
        return this.convertExprToActionTree(tree);
    }

    convertExprToActionTree(tree){
        if(!tree)
            return;
        console.log(tree.constructor.name);
        switch(tree.constructor.name) {
            case 'SelectQueryContext':
                return this.convertSelectQueryExpressionsForTree(tree);
            case 'ArithmeticLogicExpressionContext':
                return this.convertArithmeticLogicExpressionsForTree(tree);  
            case 'TreeExpressionContext':
                return this.convertTreeExpressionsForTree(tree);
            default:
                break;
        }
        var i=0;
        var childArray=new Array();
        for(;i<tree.getChildCount();i++){
            childArray[i]=this.convertExprToActionTree(tree.children[i]);
        }
        return this.addNodeToActionTree(tree,childArray);
    }

    addNodeToActionTree(tree,childArray){
        var actionTree=new treeClasses.ActionTree(); 
        actionTree.insert(tree,OTHER_PRIORITY);    
        if(childArray.length!==0){
            actionTree.root.children=childArray;
            actionTree.root.isBinary=false;
        }

        return actionTree;
    }

     convertFromArithmeticLogicExprToActionTree(tree){
        var convertedTree=this.convertArithmeticLogicExpressionsForTree(tree);
        return convertedTree;
    }

    convertSelectQueryExpressionsForTree(tree) {
        if(!tree)
            return;
        var actionTree=new treeClasses.ActionTree();
        var i=0;
        actionTree.insert(tree,SELECT_PRIORITY);
        actionTree.root.children[0]=this.convertExprToActionTree(tree.children[1]); //treeExpression
        actionTree.root.children[1]=this.convertExprToActionTree(tree.children[3]); //treeQuery
        if(tree.getChildCount()==6){ //where context exists
            actionTree.root.children[2]=this.convertExprToActionTree(tree.children[5]);
        }
        return actionTree;
    }
    convertTreeExpressionsForTree(tree){
        var actionTree=new treeClasses.ActionTree();
        var i=0;
        actionTree.insert(tree,OTHER_PRIORITY);
        var childrenCount=0;
        for(;i<tree.getChildCount();i++) {
            if(tree.children[i].constructor.name==='TreeElementContext'){
                actionTree.root.children[childrenCount]=this.convertExprToActionTree(tree.children[i]);
                childrenCount++;
            } else if(tree.children[i].getText()==='*') {
                actionTree.root.children[childrenCount]=this.convertExprToActionTree(tree.children[i]);
                childrenCount++;
            }

        }
        return actionTree;
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




