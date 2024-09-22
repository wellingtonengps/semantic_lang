/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.ast;

import lang.interpreter.Visitor;

public class Declaration extends Node{
    String id;   // Nome da variavel
    Type type;   // Tipo da variavel: Int, Char, Bool,...

    public Declaration(int line, int column, String id, Type type){
        super(line, column);
        this.id = id;
        this.type = type;
    }

    public String getId(){
        return id;
    }

    public Type getType(){
        return type;
    }

    @Override
    public String toString(){
        return id.toString() + " :: " + type.toString() + "; ";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
