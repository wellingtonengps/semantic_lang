/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.semantic;


// Define o tipo de erro semantico no TypeCheckVisitor
public class STyErr extends SType {

    private static STyErr st = new STyErr();

    private STyErr() {
    }

    public static STyErr newSTyErr() {
        return st;
    }

    @Override
    public boolean match(SType v) {
        return true;
    }

    @Override
    public String toString() {
        return "TyError";
    }

}
