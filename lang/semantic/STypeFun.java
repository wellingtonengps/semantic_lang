/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.semantic;


public class STypeFun extends SType {
    private String id;                  // Nome da função
    private SType parameterType[];      // Tipos do parametro
    private String nameParams[];        // Nome dos parametros
    private SType returnType[];         // Tipos de retorno

    public STypeFun(SType t[], SType retornos[]) {
        parameterType = t;
        returnType = retornos;
    }

    public STypeFun(SType t[], SType retornos[], String[] names, String nomeFuncao) {
        parameterType = t;
        returnType = retornos;
        nameParams = names;
        id = nomeFuncao;
    }

    public SType[] getTypes() {
        return parameterType;
    }

    public SType[] getReturnTypes() {
        return returnType;
    }

    public String[] getTypesName() {
        return nameParams;
    }

    public boolean match(SType v) {
        boolean r = false;
        if (v instanceof STypeFun) {
            if (((STypeFun) v).getTypes().length == parameterType.length) {
                r = true;
                for (int i = 0; i < parameterType.length; i++) {
                    r = r && parameterType[i].match(((STypeFun) v).getTypes()[i]);
                }
            }
        }
        return r;
    }

    @Override
    public String toString() {
        String s = "";
        if (parameterType.length > 0) {
            s = parameterType[0].toString();
            for (int i = 1; i < parameterType.length; i++) {
                s += "->" + parameterType[i].toString();
            }
        }
        return s;
    }
}
