/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.ast;

import lang.interpreter.Visitor;

public class TypeFloat extends Type{
    public TypeFloat(int line, int column){
        super(line, column);
    }    

    @Override
    public String toString(){
        return "Float";
    }

    @Override
    public void accept(Visitor v){ 
        v.visit(this);
    }
}
