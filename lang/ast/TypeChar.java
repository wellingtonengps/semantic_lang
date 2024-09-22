/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.ast;

import lang.interpreter.Visitor;

public class TypeChar extends Type{
    public TypeChar(int line, int column){
        super(line, column);
    }    

    @Override
    public String toString(){
        return "Char";
    }

    @Override
    public void accept(Visitor v){ 
        v.visit(this);
    }
}
