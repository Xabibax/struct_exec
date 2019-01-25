package lexer;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static lexer.Op.*;

public class Lexer {
	public InputStream in;
	public int i; // current ASCII character (coded as an integer)
	
	public Lexer(InputStream in) throws IOException {
		this.in = in;
		i = in.read(); // initialize current character
	}

	public int getI() {
		return this.i;
	}
	
	public List<Token> lex() throws UnexpectedCharacter, IOException {
		// return the list of tokens recorded in the file
		List<Token> tokens = new ArrayList<>();

		try {
			Token token = getToken();
	
			while (! (token instanceof EOF)) {
				tokens.add(token);
				token = getToken();
			}
			tokens.add(token); // this is the EOF token
		} catch (IOException e){
				in.close(); // close the reader
				throw e; // pass the exception up the stack
		}
		return tokens;
	}
	
	public Token getToken() throws UnexpectedCharacter, IOException {
		/*
		Program    ::= FuncDef* Body
		FuncDef    ::= '(' 'defun' Head Body ')'
		Head       ::= '(' FUNC_ID VAR_ID* ')'
		Body       ::= VarDef* Expression
		VarDef     ::= '(' '=' VAR_ID Expression ')'
		Expression ::= LITERAL
				 | VAR_ID
				 | '(' '-' Expression ')'
				 | '(' OP Expression Expression ')'
				 | '(' 'if' Expression Expression Expression ')'
				 | '(' FUNC_ID Expression* ')'
		OP         ::= '+' | '-' | '*' | '/' | '==' | '<'
		FUNC_ID    ::= ['a'-'z']['a'-'z''0'-'9']*
		VAR_ID     ::= ['a'-'z']['a'-'z''0'-'9']*
		LITERAL    ::= '0'|['1'-'9']['0'-'9']*
		 */
		StringBuilder currentElement = new StringBuilder();

		switch (i){
			// EOF //
		    case -1 :
			    in.close();
			    return new EOF();
			// LPAR //
			case '(' :
				currentElement.append((char) i);
				i = in.read();
				return new LPar(currentElement.toString());
			// BLANK //
			case ' ' : case '\t' : case '\n' : case '\r' :
				i = in.read();
				return getToken();
			// DEFVAR ::= '(' '=' VAR_ID Expression ')' //

			case '=' :
				currentElement.append((char) i);
				i = in.read();
				// OP //
				if(i == '=') {
					i = in.read();
					return EQUAL;
				}
				// OP //
				return new Defvar(currentElement.toString());
			// RPAR //
			case ')' :
				currentElement.append((char) i);
				i = in.read();
				return new RPar(currentElement.toString());
			// OP ::= '+' | '-' | '*' | '/' | '==' | '<' //
			case '+' :
				i = in.read();
				return PLUS;
			case '-' :
				i = in.read();
				return MINUS;
			case '/' :
				i = in.read();
				return DIVIDE;
			case '*' :
				i = in.read();
				return TIMES;
			case '<' :
				i = in.read();
				return LESS;

			// DEFAULT //
			default :
				// LITTERAL ::= '0'|['1'-'9']['0'-'9']* //
				if ( i == '0') {
					currentElement.append((char) i);
					i = in.read();
					return new Literal(currentElement.toString());
				} else if( i >= '1' && i <= '9' ) {
					currentElement.append((char) i);
					do {
						i = in.read();
						if (i >= '0' && i <= '9') {
							currentElement.append((char) i);
						}
					}while (i >= '0' && i <= '9');
					return new Literal(currentElement.toString());
				}
				// IDENTIFIER FUNC_ID ::= ['a'-'z']['a'-'z''0'-'9']*  VAR_ID ::= ['a'-'z']['a'-'z''0'-'9']* //
				else if ( i >= 'a' && i <= 'z' ) {
					currentElement.append((char) i);
					// IF //
					if (i == 'i') {
						i = in.read();
						currentElement.append((char) i);
						if ( i =='f' ) {
							i = in.read();
							if( !( (i >= '0' && i <= '9') || (i >= 'a' && i <= 'z') ) ) {
								return new If(currentElement.toString());
							}
						}
						currentElement.append((char) i);
					}
					// IF //
					// DEFUN //
					else if (i == 'd') {
						i = in.read();
						currentElement.append((char) i);
						if (i == 'e') {
							i = in.read();
							currentElement.append((char) i);
							if (i == 'f') {
								i = in.read();
								currentElement.append((char) i);
								if (i == 'u') {
									i = in.read();
									currentElement.append((char) i);
									if (i == 'n') {
										i = in.read();
										currentElement.append((char) i);
										if ( !( (i >= '0' && i <= '9') || (i >= 'a' && i <= 'z') ) ) {
											return new Defun(currentElement.toString());
										}
									}
								}
							}
						}
					}
					// DEFUN //
					while ( (i >= '0' && i <= '9') || (i >= 'a' && i <= 'z') ) {
						i = in.read();
						if ( (i >= '0' && i <= '9') || (i >= 'a' && i <= 'z') ) {
							currentElement.append((char) i);
						}
					}
					return new Identifier(currentElement.toString());
				}
				else {
					throw new UnexpectedCharacter(i);
				}
		}
	}
}


