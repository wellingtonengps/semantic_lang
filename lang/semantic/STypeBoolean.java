/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.semantic;


public class STypeBoolean extends SType{
    private static STypeBoolean st = new STypeBoolean();

    private STypeBoolean(){
    }

    public static STypeBoolean newSTyBool() {
        return st;
    }

    public boolean match(SType v) {
        return (v instanceof STypeError) || (v instanceof STypeBoolean);
    }

    public String toString() {
        return "Bool";
    }
}
