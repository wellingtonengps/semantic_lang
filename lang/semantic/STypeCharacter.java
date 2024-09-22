/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.semantic;

public class STypeCharacter extends SType {

    private static STypeCharacter st = new STypeCharacter();

    private STypeCharacter(){
    }

    public static STypeCharacter newSTyCharacter() {
        return st;
    }

    public boolean match(SType v) {
        return (v instanceof STypeError) || (v instanceof STypeCharacter);
    }

    public String toString() {
        return "Char";
    }

}
