/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.ast;

import lang.interpreter.Visitor;

public abstract class LValue extends Expression{
    // Função importante para os valores literais
    public abstract String getId();

    public LValue(int line, int column){
        super(line, column);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
