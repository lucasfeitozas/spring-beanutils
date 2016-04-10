package br.com.teste.framework.beanutils.dto;

import br.com.teste.framework.beanutils.entity.EnumTipoDocumento;

public class PassageiroDTO {

	private String nome;
	private Integer idade;
	private EnumTipoDocumento tipoDocumento;
	
	public PassageiroDTO() {
		super();
	}
	
	public PassageiroDTO(String nome, Integer idade, EnumTipoDocumento tipoDocumento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.tipoDocumento = tipoDocumento;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public EnumTipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(EnumTipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipoDocumento == null) ? 0 : tipoDocumento.hashCode());
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
		PassageiroDTO other = (PassageiroDTO) obj;
		if (idade == null) {
			if (other.idade != null)
				return false;
		} else if (!idade.equals(other.idade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipoDocumento != other.tipoDocumento)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Passageiro [nome=" + nome + ", idade=" + idade + ", tipoDocumento=" + tipoDocumento + "]";
	}
}
