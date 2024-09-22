/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.ast;

import lang.interpreter.Visitor;

public abstract class Command extends Node {
    // Classe abstrata para tratar os nós derivados de 'cmd' na gramática
    public Command(int line, int column) {
        super(line, column);
    }
    
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}