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
//           | variableId                                                 #VarId
           // Unary Expression //
           | ('-' | '!') expression                                     #UnaryOrMinus
           // Binary Expression //
           | expression operatorMult expression                         #MultBinary
           | expression operatorAdd expression                          #AddBinary
           | expression operatorRel expression                          #RelBinary
           | expression operatorEqual expression                        #EqualBinary
           | expression operatorAnd expression                          #AndBinary
           | expression operatorOr expression                           #OrBinary
           // Conditionnal Expression //
           | <assoc = right> expression '?' expression ':' expression   #Ternary
           | BOOLEAN                                                    #BooleanLiteral
           | INTEGER                                                    #IntegerLiteral
//           | '(' functionId expression* ')'                     #Function
           ;
operatorMult : '/'
             | '*'
             ;
operatorAdd : '-'
            | '+'
            ;
operatorRel : '<'
            | '<='
            | '>'
            | '>='
            ;
operatorEqual : '=='
              | '!='
              ;
operatorAnd : '&&'
            ;
operatorOr : '||'
           ;
variableId : IDENTIFIER
           ;
/*
functionId : IDENTIFIER
           ;
*/
// lexical rules

INTEGER  : '0' | ('1'..'9')('0'..'9')*
         ;
OP       : '+' | '-' | '*' | '/' | '==' | '<' 
         ;
BOOLEAN  : 'true' | 'false'
         ;
IDENTIFIER : ('a'..'z')('a'..'z' | '0'..'9')*
         ;
WS : [ \t\n\r]+ -> channel(HIDDEN) ;
LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN) ;