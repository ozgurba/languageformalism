// Generated from treelan.g4 by ANTLR 4.5.1
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete listener for a parse tree produced by treelanParser.
function treelanListener() {
	antlr4.tree.ParseTreeListener.call(this);
	return this;
}

treelanListener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
treelanListener.prototype.constructor = treelanListener;

// Enter a parse tree produced by treelanParser#stats.
treelanListener.prototype.enterStats = function(ctx) {
};

// Exit a parse tree produced by treelanParser#stats.
treelanListener.prototype.exitStats = function(ctx) {
};


// Enter a parse tree produced by treelanParser#varDecl.
treelanListener.prototype.enterVarDecl = function(ctx) {
};

// Exit a parse tree produced by treelanParser#varDecl.
treelanListener.prototype.exitVarDecl = function(ctx) {
};


// Enter a parse tree produced by treelanParser#formalParameters.
treelanListener.prototype.enterFormalParameters = function(ctx) {
};

// Exit a parse tree produced by treelanParser#formalParameters.
treelanListener.prototype.exitFormalParameters = function(ctx) {
};


// Enter a parse tree produced by treelanParser#formalParameter.
treelanListener.prototype.enterFormalParameter = function(ctx) {
};

// Exit a parse tree produced by treelanParser#formalParameter.
treelanListener.prototype.exitFormalParameter = function(ctx) {
};


// Enter a parse tree produced by treelanParser#block.
treelanListener.prototype.enterBlock = function(ctx) {
};

// Exit a parse tree produced by treelanParser#block.
treelanListener.prototype.exitBlock = function(ctx) {
};


// Enter a parse tree produced by treelanParser#stat.
treelanListener.prototype.enterStat = function(ctx) {
};

// Exit a parse tree produced by treelanParser#stat.
treelanListener.prototype.exitStat = function(ctx) {
};


// Enter a parse tree produced by treelanParser#parExpr.
treelanListener.prototype.enterParExpr = function(ctx) {
};

// Exit a parse tree produced by treelanParser#parExpr.
treelanListener.prototype.exitParExpr = function(ctx) {
};


// Enter a parse tree produced by treelanParser#expr.
treelanListener.prototype.enterExpr = function(ctx) {
};

// Exit a parse tree produced by treelanParser#expr.
treelanListener.prototype.exitExpr = function(ctx) {
};


// Enter a parse tree produced by treelanParser#builtinfunction.
treelanListener.prototype.enterBuiltinfunction = function(ctx) {
};

// Exit a parse tree produced by treelanParser#builtinfunction.
treelanListener.prototype.exitBuiltinfunction = function(ctx) {
};


// Enter a parse tree produced by treelanParser#primary.
treelanListener.prototype.enterPrimary = function(ctx) {
};

// Exit a parse tree produced by treelanParser#primary.
treelanListener.prototype.exitPrimary = function(ctx) {
};


// Enter a parse tree produced by treelanParser#exprList.
treelanListener.prototype.enterExprList = function(ctx) {
};

// Exit a parse tree produced by treelanParser#exprList.
treelanListener.prototype.exitExprList = function(ctx) {
};


// Enter a parse tree produced by treelanParser#typeType.
treelanListener.prototype.enterTypeType = function(ctx) {
};

// Exit a parse tree produced by treelanParser#typeType.
treelanListener.prototype.exitTypeType = function(ctx) {
};


// Enter a parse tree produced by treelanParser#literal.
treelanListener.prototype.enterLiteral = function(ctx) {
};

// Exit a parse tree produced by treelanParser#literal.
treelanListener.prototype.exitLiteral = function(ctx) {
};


// Enter a parse tree produced by treelanParser#primitiveType.
treelanListener.prototype.enterPrimitiveType = function(ctx) {
};

// Exit a parse tree produced by treelanParser#primitiveType.
treelanListener.prototype.exitPrimitiveType = function(ctx) {
};


// Enter a parse tree produced by treelanParser#complexType.
treelanListener.prototype.enterComplexType = function(ctx) {
};

// Exit a parse tree produced by treelanParser#complexType.
treelanListener.prototype.exitComplexType = function(ctx) {
};



exports.treelanListener = treelanListener;