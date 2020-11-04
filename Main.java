package prototype;

public class Main {

	public static void main(String[] args) {
		{
	        
		    //Microsoft
			System.out.println("Novo:");
		    SurfaceX prototipoSurfaceX = new SurfaceX();
		    ComputadorPrototype SurfaceXNovo = prototipoSurfaceX.clonar();
		    SurfaceXNovo.setValorComputador(3500.0);
		    System.out.println(SurfaceXNovo.exibirInfo());
		    
		    System.out.println(" ");
		    
		    System.out.println("Usado:");
		    ComputadorPrototype SurfaceXUsado = prototipoSurfaceX.clonar();
		    SurfaceXUsado.setValorComputador(2000.0);
		    System.out.println(SurfaceXUsado.exibirInfo());
		   
		    System.out.println(" ");
		    
		    //Apple
		    System.out.println("Novo:");
		    MacBook prototipoMac = new MacBook();
		    ComputadorPrototype MacNovo = prototipoMac.clonar();
		    MacNovo.setValorComputador(6500.0);
		    System.out.println(MacNovo.exibirInfo());
		    
		    System.out.println(" ");
		    
		    System.out.println("Usado:");
		    ComputadorPrototype MacUsado = prototipoMac.clonar();
		    MacUsado.setValorComputador(4000.0);
		    System.out.println(MacUsado.exibirInfo());
		    
		    
		}
	}
}
