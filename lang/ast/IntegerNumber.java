/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.ast;

import lang.interpreter.Visitor;

public class IntegerNumber extends LValue{
    private Integer value;
    
    public IntegerNumber(int line, int column, Integer value){
        super(line, column);
        this.value = value;
    }

    public void setValue(Integer value){
        this.value = value;
    }

    public Integer getValue(){
        return value;
    }

    @Override
    public String toString(){
        return value.toString() + "";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getId() {
        return null;
    }
}

