/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */

package lang.semantic;

import lang.semantic.*;

// Define o tipo int para a analise semantica no TypeCheckVisitor
public class STyInt extends SType {

    private static STyInt st = new STyInt();

    private STyInt() {
    }

    public static STyInt newSTyInt() {
        return st;
    }

    @Override
    public boolean match(SType v) {
        return (v instanceof STyErr) || (v instanceof STyInt);
    }

    @Override
    public String toString() {
        return "Int";
    }

}
