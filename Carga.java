package exercicio_navio;

public class Carga {

	private int id;
	private float peso;
	private Character tipo;
	
	public Carga(int id, float peso, Character tipo) {
		this.id = id;
		this.peso = peso;
		this.tipo = tipo;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public Character getTipo() {
		return tipo;
	}
	
	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}
	
	public int getId() {
		return id;
	}
		
}
