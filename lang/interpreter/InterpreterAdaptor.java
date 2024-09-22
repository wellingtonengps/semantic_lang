/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */

package lang.interpreter;

import java.io.*;
import lang.ast.SuperNode;
import lang.parser.*;
import java.util.List;


public interface InterpreterAdaptor{
    public abstract SuperNode interpretFile(String path);
}
