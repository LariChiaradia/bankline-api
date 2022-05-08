package com.dio.santander.bankline.api.dto;

import java.time.LocalDateTime;

import com.dio.santander.bankline.api.model.MovimentacaoTipo;

public class NovaMovimentacao {
private LocalDateTime dataHora;
	
	private String descricao;
	private Double valor;
	
	private MovimentacaoTipo tipo;
	
	private Integer idConta;

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public MovimentacaoTipo getTipo() {
		return tipo;
	}

	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	
}
