package exercicio_navio;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Viagem {

	static int ordenador = 0;
	
	private int id;
	private Date data;
	private Navio navio;
	private List<Carga> cargas;
	private float cargaTotal;
	
	public Viagem(Date data, Navio navio) {
		this.id = ++ordenador;
		this.data = data;
		this.navio = navio;
		this.cargas = new ArrayList<Carga>();
		
	}
	
	public void inserirCarga(Carga c) {
		
		if(this.cargas.isEmpty()) {
			this.navio.iniciaCarregamento();				
		}
	
		if(c.getPeso() < this.navio.getCapacidadeCarga()) {
			
			if(this.cargaTotal <= this.navio.getCapacidadeCarga()) {
			
				this.cargas.add(c);
				this.cargaTotal = this.cargaTotal + c.getPeso();
				
			}
			
			else {
				this.navio.bloqueiaCarregamento();
			}
			
		}
		
	}
	
	public void fecharViagem() {
		
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Navio getNavio() {
		return navio;
	}

	public void setNavio(Navio navio) {
		this.navio = navio;
	}

	public List<Carga> getCargas() {
		return cargas;
	}

	public void setCargas(List<Carga> cargas) {
		this.cargas = cargas;
	}

	public float getCargaTotal() {
		return cargaTotal;
	}

	public void setCargaTotal(float cargaTotal) {
		this.cargaTotal = cargaTotal;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Viagem: \nId: " + id + "\nNavio: " + navio + "\nCargas: " + cargas + "\nCarga Total: " + cargaTotal;
	}
	
	
	
}
