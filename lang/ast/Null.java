/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.ast;

import lang.interpreter.Visitor;
public class Null extends Expression {
    private String value = null;
    
    public Null (int line, int column){
        super(line, column);
    }

    public String getValue(){
        return value;
    }

    @Override
    public String toString(){
        //return "null";
        return value.toString();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
