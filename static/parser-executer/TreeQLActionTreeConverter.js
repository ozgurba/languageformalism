const TreeQLParser = require('../generated-parser/TreeQLParser').TreeQLParser;
const TreeQLListener = require('../generated-parser/TreeQLListener').TreeQLListener;
var buckets = require('../lib/buckets');
var precedenceMap = new Map([[',' , 0], ['+' , 1] ,['-', 1],['*' , 2] ,['/', 2],['%',2]]);

class TreeQLActionTreeConverter extends TreeQLListener {

    actionTree=null;

    promote(){

    }

    getBinaryOperator(ctx) {
        return ctx.getText();   
    }

    enterArithmeticLogicExpression(ctx){
        //console.log(ctx);
        if(ctx.getChildCount()>3){
            //ctx.children=[ctx.children[0],ctx.children[1],ctx.children[2]];
            var binaryOperator=this.getBinaryOperator(ctx.children[1]); //BinaryOperatorContext
            //console.log("TreeQLActionTreeConverter.precedenceMap:"+precedenceMap.get(binaryOperator));
        }
        console.log("TreeQLActionTreeConverter.enterArithmeticLogicExpression:"+ctx.children[0]);
    }

    exitArithmeticLogicExpression(ctx){

        console.log(ctx);
        console.log("TreeQLActionTreeConverter.exitArithmeticLogicExpression");
    }
}
exports.TreeQLActionTreeConverter = TreeQLActionTreeConverter;