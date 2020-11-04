package prototype;

public class MacBook extends ComputadorPrototype{
    
    protected MacBook(MacBook macbook) {
        this.valorComputador = macbook.getValorComputador();
    }
 
    public MacBook() {
    	valorComputador = 0.0;
    }
    
    @Override
    public String exibirInfo() {
    return "Modelo: MacBook Pro \nMarca: Apple \n" + "Valor: R$"
                + getValorComputador();
    }

    @Override
    public MacBook clonar() {
     return new MacBook(this);
    }
}