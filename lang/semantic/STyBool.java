/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.semantic;
// Define o tipo booleano para a analise Semantica no TypeCheckVisitor
public class STyBool extends SType{
    private static STyBool st = new STyBool();

    private STyBool(){
    }

    public static STyBool newSTyBool() {
        return st;
    }

    public boolean match(SType v) {
        return (v instanceof STyErr) || (v instanceof STyBool);
    }

    public String toString() {
        return "Bool";
    }
}
