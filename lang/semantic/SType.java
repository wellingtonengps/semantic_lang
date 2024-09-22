/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.semantic;

public abstract class SType {
    // Metodo que verifica se coincide os tipos
    public abstract boolean match(SType v);
}