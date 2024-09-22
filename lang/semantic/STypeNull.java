/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.semantic;

public class STypeNull extends SType{
    private static STypeNull st = new STypeNull();

    private STypeNull() {
    }

    public static STypeNull newSTyNull() {
        return st;
    }

    @Override
    public boolean match(SType v) {
        return (v instanceof STypeError) || (v instanceof STypeNull);
    }

    @Override
    public String toString() {
        return "Null";
    }
}
