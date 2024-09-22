/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */

package lang.interpreter;

public interface Visitable {
    public void accept (Visitor v);
}