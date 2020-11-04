package prototype;

public class SurfaceX extends ComputadorPrototype {

    protected SurfaceX(SurfaceX surfaceXPrototype) {
        this.valorComputador = surfaceXPrototype.getValorComputador();
    }
 
    public SurfaceX() {
    	valorComputador = 0.0;
    }
    
    @Override
    public String exibirInfo() {
    return "Modelo: Surface X \nMarca: Microsoft\n" + "Valor: R$"
                + getValorComputador();
    }

    @Override
    public ComputadorPrototype clonar() {
     return new SurfaceX(this);
    }
    
}