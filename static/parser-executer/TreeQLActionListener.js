const TreeQLParser = require('../generated-parser/TreeQLParser').TreeQLParser;
const TreeQLListener = require('../generated-parser/TreeQLListener').TreeQLListener;
var buckets = require('../lib/buckets');


class TreeQLActionListener extends TreeQLListener {

    promote(){

    }

    enterArithmeticLogicExpression(ctx){
        //console.log("TreeQLActionListener.enterArithmeticLogicExpression");
    }

    exitArithmeticLogicExpression(ctx){

        //console.log(ctx);
        //console.log("TreeQLActionListener.exitArithmeticLogicExpression");
    }
}
exports.TreeQLActionListener = TreeQLActionListener;