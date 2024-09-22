/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.semantic;

public class STypeError extends SType {

    private static STypeError st = new STypeError();

    private STypeError() {
    }

    public static STypeError newSTyErr() {
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
