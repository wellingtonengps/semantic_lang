/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */

package lang.semantic;

public class STypeInt extends SType {

    private static STypeInt st = new STypeInt();

    private STypeInt() {
    }

    public static STypeInt newSTyInt() {
        return st;
    }

    @Override
    public boolean match(SType v) {
        return (v instanceof STypeError) || (v instanceof STypeInt);
    }

    @Override
    public String toString() {
        return "Int";
    }

}
