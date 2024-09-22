/*
 * Gustavo De Angelis Bartholomeu (201935009)
 * Wellington Pereira Silva (201935041)
 */
package lang.semantic;
// Define o tipo data para a analise semantica no TypeCheckVisitor
public class STypeData extends SType{
    private String name;

    @Override
    public boolean match(SType v) {
        return (v instanceof STypeError) || (v instanceof STypeData);
    }
    
    @Override
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public STypeData(String name) {
        this.name = name;
    }
}
