grammar Calc;

// syntactic rules

/*
program  : funcDef* body
         ;
funcDef  : '(' 'defun' head body ')'
         ;
head     : '(' functionId variableId* ')'
         ;
*/
body     : varDef* expression EOF
         ;
varDef   : '(' '=' variableId expression ')'
         ;
expression : '(' expression ')'                                         #ParenthesisExp
           | variableId                                                 #VarId
           | ('-' | '!') expression                                     #UnaryOrMinus
           | expression '/' expression                                  #DivideBinary
           | expression '*' expression                                  #TimesBinary
           | expression '-' expression                                  #MinusBinary
           | expression '+' expression                                  #PlusBinary
           | expression '<' expression                                  #LessBinary
           | expression '<=' expression                                 #LessEqualBinary
           | expression '>' expression                                  #MoreBinary
           | expression '>=' expression                                 #MoreEqualBinary
           | expression '==' expression                                 #EqualBinary
           | expression '!=' expression                                 #NotEqualBinary
           | expression '&&' expression                                 #AndBinary
           | expression '||' expression                                 #OrBinary
           | <assoc = right> expression '?' expression ':' expression   #Conditionnal
           | LITERAL                                                    #Literal
//           | '(' functionId expression* ')'                     #Function
           ;
variableId : IDENTIFIER
           ;

/*
functionId : IDENTIFIER
           ;
*/
// lexical rules

OP       : '+' | '-' | '*' | '/' | '==' | '<' 
         ;
IDENTIFIER : ('a'..'z')('a'..'z' | '0'..'9')*
         ;
LITERAL  : '0' | ('1'..'9')('0'..'9')*              
         ;
WS : [ \t\n\r]+ -> channel(HIDDEN) ;
LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN) ;