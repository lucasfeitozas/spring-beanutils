package br.com.teste.framework.beanutils.entity;

import java.util.List;

public class Barco {

	private Integer id;
	private String nome;
	private double capacidade;
	private List<Passageiro> listaPassageiro;
	public Barco() {
		super();
	}
	public Barco(Integer id, String nome, double capacidade, List<Passageiro> listaPassageiro) {
		super();
		this.id = id;
		this.nome = nome;
		this.capacidade = capacidade;
		this.listaPassageiro = listaPassageiro;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	public List<Passageiro> getListaPassageiro() {
		return listaPassageiro;
	}
	public void setListaPassageiro(List<Passageiro> listaPassageiro) {
		this.listaPassageiro = listaPassageiro;
	}
	@Override
	public String toString() {
		return "Barco [id=" + id + ", nome=" + nome + ", capacidade=" + capacidade + ", listaPassageiro="
				+ listaPassageiro + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(capacidade);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((listaPassageiro == null) ? 0 : listaPassageiro.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Barco other = (Barco) obj;
		if (Double.doubleToLongBits(capacidade) != Double.doubleToLongBits(other.capacidade))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (listaPassageiro == null) {
			if (other.listaPassageiro != null)
				return false;
		} else if (!listaPassageiro.equals(other.listaPassageiro))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
