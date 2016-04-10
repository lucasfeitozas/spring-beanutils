package br.com.teste.framework.beanutils.dto;

public class PessoaDTO {

	private String nome;
	private Integer idade;
	private PessoaDTO conjuge;
	public PessoaDTO() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conjuge == null) ? 0 : conjuge.hashCode());
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
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
		PessoaDTO other = (PessoaDTO) obj;
		if (conjuge == null) {
			if (other.conjuge != null)
				return false;
		} else if (!conjuge.equals(other.conjuge))
			return false;
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
		return true;
	}

	public PessoaDTO(String nome, Integer idade, PessoaDTO conjuge) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.conjuge = conjuge;
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

	public PessoaDTO getConjuge() {
		return conjuge;
	}

	public void setConjuge(PessoaDTO conjuge) {
		this.conjuge = conjuge;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", conjuge=" + (conjuge != null? conjuge.getNome() : null) + "]";
	}
	
	
}
