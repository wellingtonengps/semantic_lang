/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.semantic;

// Define o tipo char para a analise semantica no TypeCheckVisitor
public class STyCharacter extends SType {

    private static STyCharacter st = new STyCharacter();

    private STyCharacter(){
    }

    public static STyCharacter newSTyCharacter() {
        return st;
    }

    public boolean match(SType v) {
        return (v instanceof STyErr) || (v instanceof STyCharacter);
    }

    public String toString() {
        return "Char";
    }

}
