package com.nelioalves.cursomc.domain.enums;

public enum EstadoPagamento {
	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public EstadoPagamento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(EstadoPagamento curEstado: EstadoPagamento.values()) {
			if(curEstado.getCod() == cod) {
				return curEstado;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}
