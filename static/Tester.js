var antlr4 = require('./antlr4/index');
var treeqlLexer = require('./generated-parser/TreeQLLexer');
var treeqlParser = require('./generated-parser/TreeQLParser');
var treeqlActionListener = require('./parser-executer/TreeQLActionListener');
var TreeQLActionTreeCreator = require('./parser-executer/TreeQLActionTreeCreator');


var evaluateArithmeticLogicExpression=function(input){
    var chars = new antlr4.InputStream(input);
    var lexer = new treeqlLexer.TreeQLLexer(chars);
    var tokens  = new antlr4.CommonTokenStream(lexer);
    var parser = new treeqlParser.TreeQLParser(tokens);
    var actionTreeCreator = new TreeQLActionTreeCreator();
    var actionListener = new treeqlActionListener.TreeQLActionListener();
    parser.buildParseTrees = true;
    var tree = parser.arithmeticLogicExpression();
    var actionTree=actionTreeCreator.convertFromArithmeticLogicExprToActionTree(tree);
    actionTree.toString();
    //antlr4.tree.ParseTreeWalker.DEFAULT.walk(actionListener, actionTree);
}





var evaluateStatsExpression=function(input){
    var chars = new antlr4.InputStream(input);
    var lexer = new treeqlLexer.TreeQLLexer(chars);
    var tokens  = new antlr4.CommonTokenStream(lexer);
    var parser = new treeqlParser.TreeQLParser(tokens);
    var actionTreeCreator = new TreeQLActionTreeCreator();
    var actionListener = new treeqlActionListener.TreeQLActionListener();
    parser.buildParseTrees = true;
    var tree = parser.stats();
    var actionTree=actionTreeCreator.convertFromStatsExprToActionTree(tree);
    actionTree.toString();
    //antlr4.tree.ParseTreeWalker.DEFAULT.walk(actionListener, actionTree);
}


//evaluateArithmeticLogicExpression("-18+45*true&&false+\"test\"");
evaluateStatsExpression("select country.name from country where 3*5+8==9");