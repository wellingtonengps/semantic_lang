/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.semantic;

import lang.ast.SuperNode;

// Adaptador para classe de semantic. a Função parseFile deve retornar null caso o parser resulte em erro. 
public interface SemanticAdaptor {
    public abstract SuperNode parseFile(String path);
}
