package exercicio_navio;

public class Navio_Container extends Navio {

	private int quantidadeGuindastes;
    private int quantidadeCamaras;
    
    public Navio_Container(int id, String nome, int quantidadePoroes, int capacidadeCarga, 
    					   int quantidadeGuindastes, int quantidadeCamaras){
        super(id, nome, quantidadePoroes, capacidadeCarga);
        
        
        this.quantidadeGuindastes = quantidadeGuindastes;
        this.quantidadeCamaras = quantidadeCamaras;
        
        
    }

    public int getQuantidadeGuindastes() {
        return quantidadeGuindastes;
    }

    public void setQuantidadeGuindastes(int quantidadeGuindastes) {
        this.quantidadeGuindastes = quantidadeGuindastes;
    }

    public int getQuantidadeCamaras() {
        return quantidadeCamaras;
    }

    public void setQuantidadeCamaras(int quantidadeCamaras) {
        this.quantidadeCamaras = quantidadeCamaras;
    }
	
}
