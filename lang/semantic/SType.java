/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.semantic;

// Define a classe abstrata de um "type" para a analise semantica no TypeCheckVisitor
public abstract class SType {
    // Metodo que verifica se coincide os tipos
    public abstract boolean match(SType v);
}