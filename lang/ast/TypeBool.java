/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.ast;

import lang.interpreter.Visitor;

public class TypeBool extends Type{
    public TypeBool(int line, int column){
        super(line, column);
    }    

    @Override
    public String toString(){
        return "Bool";
    }

    @Override
    public void accept(Visitor v){ 
        v.visit(this);
    }
}
