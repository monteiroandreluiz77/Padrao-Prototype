package prototype;

public abstract class ComputadorPrototype{
    
    public double valorComputador;
        
    public abstract String exibirInfo();
 
    public abstract ComputadorPrototype clonar();
 
    public double getValorComputador() {
        return valorComputador;
    }
 
    public void setValorComputador(double valorComputador) {
        this.valorComputador = valorComputador;
    }
}
