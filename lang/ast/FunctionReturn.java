/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.ast;

import lang.interpreter.Visitor;

public class FunctionReturn extends Expression {
    private String id;
    private FCallParams fCallParams;
    private Expression exp;

    public FunctionReturn (int line, int column, String id, FCallParams fCallParams, Expression exp){
        super(line, column);
        this.id = id;
        this.fCallParams = fCallParams;
        this.exp = exp;
    }

    @Override
    public String toString(){
        return id + " ( " + (fCallParams != null ? fCallParams : "") + " ) [ " + exp + " ] ";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FCallParams getFCallParams() {
        return fCallParams;
    }

    public void setFCallParams(FCallParams fCallParams) {
        this.fCallParams = fCallParams;
    }

    // RETORNA O INDICE DA POSICAO QUE O USUARIO DESEJA RECEBER DAS VARIAVEIS DA FUNCAO
    public Expression getExpIndex() {
        return exp;
    }

    public void setExpIndex(Expression exp) {
        this.exp = exp;
    }
}