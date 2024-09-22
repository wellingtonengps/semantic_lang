/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.ast;

import lang.interpreter.Visitor;

public class Subtraction extends BinOP{
    public Subtraction(int line, int column, Expression left, Expression right){
        super(line, column, left, right);
    }

    @Override
    public String toString(){
        return (left.toString() + " - " + right.toString());
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
