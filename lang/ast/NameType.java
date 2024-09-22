/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.ast;

import lang.interpreter.Visitor;

public class NameType extends Type{ 
// public class NameType extends Expression{
    private String val;

    public NameType (int line, int column, String val){
        super(line, column);
        this.val = val;
    }

    public String getID(){
        return this.val;
    }

    @Override
    public String toString(){
        return String.valueOf(val);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
