package exercicio_navio;

public abstract class Navio {

	private int id;
    private String nome;
    private int quantidadePoroes;
    private float capacidadeCarga;
    private String disponibilidade;
    
    public Navio(int id, String nome, int qntdPoroes, float capacidadeCarga){
        this.id = id;
        this.nome = nome;
        this.quantidadePoroes = qntdPoroes;
        this.capacidadeCarga = capacidadeCarga;
        this.disponibilidade = "Vazio";
    }
    
    public void iniciaCarregamento(){
        this.disponibilidade.equals("Disponível");
    }
    
    public void bloqueiaCarregamento(){
        this.disponibilidade = "Lotado";
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadePoroes() {
        return quantidadePoroes;
    }

    public void setQuantidadePoroes(int quantidadePoroes) {
        this.quantidadePoroes = quantidadePoroes;
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

	@Override
	public String toString() {
		return "Navio [id=" + id + ", nome=" + nome + ", quantidadePoroes=" + quantidadePoroes + ", capacidadeCarga="
				+ capacidadeCarga + ", disponibilidade=" + disponibilidade + "]";
	}
    
    
	
}
