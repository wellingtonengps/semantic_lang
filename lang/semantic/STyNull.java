/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.semantic;

// Define o tipo Null para a analise semantica no typeCheckVisitor
public class STyNull extends SType{
    private static STyNull st = new STyNull();

    private STyNull() {
    }

    public static STyNull newSTyNull() {
        return st;
    }

    @Override
    public boolean match(SType v) {
        return (v instanceof STyErr) || (v instanceof STyNull);
    }

    @Override
    public String toString() {
        return "Null";
    }
}
