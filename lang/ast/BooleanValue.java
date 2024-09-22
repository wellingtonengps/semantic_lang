/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.ast;

import lang.interpreter.Visitor;

public class BooleanValue extends Expression{
    private Boolean value;

    public BooleanValue (int line, int column, Boolean value){
        super(line, column);
        this.value = value;
    }

    public void setValue(Boolean v) {
        this.value = v;
    }

    public Boolean getValue() {
        return value;
    }

    @Override
    public String toString(){
        return " " + value.toString() + " ";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
