package br.com.teste.framework.beanutils.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Agenda implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private BigDecimal valor;
	private Date data;
	private Integer versao;
	
	public Agenda() {
		super();
	}
	public Agenda(String nome, BigDecimal valor, Date data, Integer versao) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.data = data;
		this.versao = versao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Integer getVersao() {
		return versao;
	}
	public void setVersao(Integer versao) {
		this.versao = versao;
	}
	@Override
	public String toString() {
		return "Agenda [nome=" + nome + ", valor=" + valor + ", data=" + data + ", versao=" + versao + "]";
	}
	
}
