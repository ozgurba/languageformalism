// Generated from TreeQL.g4 by ANTLR 4.5.1
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete listener for a parse tree produced by TreeQLParser.
function TreeQLListener() {
	antlr4.tree.ParseTreeListener.call(this);
	return this;
}

TreeQLListener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
TreeQLListener.prototype.constructor = TreeQLListener;

// Enter a parse tree produced by TreeQLParser#stats.
TreeQLListener.prototype.enterStats = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#stats.
TreeQLListener.prototype.exitStats = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#definition.
TreeQLListener.prototype.enterDefinition = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#definition.
TreeQLListener.prototype.exitDefinition = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#assignmentExpr.
TreeQLListener.prototype.enterAssignmentExpr = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#assignmentExpr.
TreeQLListener.prototype.exitAssignmentExpr = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#treeQuery.
TreeQLListener.prototype.enterTreeQuery = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#treeQuery.
TreeQLListener.prototype.exitTreeQuery = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#selectQuery.
TreeQLListener.prototype.enterSelectQuery = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#selectQuery.
TreeQLListener.prototype.exitSelectQuery = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#joinQuery.
TreeQLListener.prototype.enterJoinQuery = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#joinQuery.
TreeQLListener.prototype.exitJoinQuery = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#mergeQuery.
TreeQLListener.prototype.enterMergeQuery = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#mergeQuery.
TreeQLListener.prototype.exitMergeQuery = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#conflictspec.
TreeQLListener.prototype.enterConflictspec = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#conflictspec.
TreeQLListener.prototype.exitConflictspec = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#explodeQuery.
TreeQLListener.prototype.enterExplodeQuery = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#explodeQuery.
TreeQLListener.prototype.exitExplodeQuery = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#rangeVariableDeclaration.
TreeQLListener.prototype.enterRangeVariableDeclaration = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#rangeVariableDeclaration.
TreeQLListener.prototype.exitRangeVariableDeclaration = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#abstractTreeName.
TreeQLListener.prototype.enterAbstractTreeName = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#abstractTreeName.
TreeQLListener.prototype.exitAbstractTreeName = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#selectExpression.
TreeQLListener.prototype.enterSelectExpression = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#selectExpression.
TreeQLListener.prototype.exitSelectExpression = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#expression.
TreeQLListener.prototype.enterExpression = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#expression.
TreeQLListener.prototype.exitExpression = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#arithmeticLogicExpression.
TreeQLListener.prototype.enterArithmeticLogicExpression = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#arithmeticLogicExpression.
TreeQLListener.prototype.exitArithmeticLogicExpression = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#binaryOperand.
TreeQLListener.prototype.enterBinaryOperand = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#binaryOperand.
TreeQLListener.prototype.exitBinaryOperand = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#unaryOperand.
TreeQLListener.prototype.enterUnaryOperand = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#unaryOperand.
TreeQLListener.prototype.exitUnaryOperand = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#treeExpression.
TreeQLListener.prototype.enterTreeExpression = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#treeExpression.
TreeQLListener.prototype.exitTreeExpression = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#treeElement.
TreeQLListener.prototype.enterTreeElement = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#treeElement.
TreeQLListener.prototype.exitTreeElement = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#typeType.
TreeQLListener.prototype.enterTypeType = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#typeType.
TreeQLListener.prototype.exitTypeType = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#primitiveType.
TreeQLListener.prototype.enterPrimitiveType = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#primitiveType.
TreeQLListener.prototype.exitPrimitiveType = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#complexType.
TreeQLListener.prototype.enterComplexType = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#complexType.
TreeQLListener.prototype.exitComplexType = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#json.
TreeQLListener.prototype.enterJson = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#json.
TreeQLListener.prototype.exitJson = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#json_value.
TreeQLListener.prototype.enterJson_value = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#json_value.
TreeQLListener.prototype.exitJson_value = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#obj.
TreeQLListener.prototype.enterObj = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#obj.
TreeQLListener.prototype.exitObj = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#pair.
TreeQLListener.prototype.enterPair = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#pair.
TreeQLListener.prototype.exitPair = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#arr.
TreeQLListener.prototype.enterArr = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#arr.
TreeQLListener.prototype.exitArr = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#binaryOperator.
TreeQLListener.prototype.enterBinaryOperator = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#binaryOperator.
TreeQLListener.prototype.exitBinaryOperator = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#unaryOperator.
TreeQLListener.prototype.enterUnaryOperator = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#unaryOperator.
TreeQLListener.prototype.exitUnaryOperator = function(ctx) {
};


// Enter a parse tree produced by TreeQLParser#signed_number.
TreeQLListener.prototype.enterSigned_number = function(ctx) {
};

// Exit a parse tree produced by TreeQLParser#signed_number.
TreeQLListener.prototype.exitSigned_number = function(ctx) {
};



exports.TreeQLListener = TreeQLListener;