/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.semantic;

public class STypeFloat extends SType{
    private static STypeFloat st = new STypeFloat();

    private STypeFloat(){
    }

    public static STypeFloat newSTyFloat() {
        return st;
    }

    @Override
    public boolean match(SType v) {
        return (v instanceof STypeError) || (v instanceof STypeFloat);
    }

    @Override
    public String toString() {
        return "Float";
    }
}
