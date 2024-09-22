/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.semantic;

// Define o tipo array para a analise semantica no TypeCheck
public class STypeArray extends SType{
    private SType a;

    public STypeArray(SType t) {
        a = t;
    }

    public SType getArg() {
        return a;
    }

    @Override
    public boolean match(SType v) {
        // Verifica se é array e o tipo do array
        return (v instanceof STypeError) || (v instanceof STypeArray) && (a.match(((STypeArray) v).getArg()));
    }

    @Override
    public String toString() {
        return a.toString() + "[]";
    }
}
