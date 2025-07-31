package br.com.desafio;

import br.com.desafio.dominio.Conteudo;

public class Curso extends Conteudo {
	
    private int cargaHoraria;

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public double calcularXp() {
		
		return this.XP_PADRAO + (this.getCargaHoraria() * 2);
	}

	@Override
	public String toString() {
		return " \nTitulo Curso = " + getTitulo() +
			   "; Descrição = " + getDescricao() + 
			   "; Carga Horária = " + getCargaHoraria();
	}
	
}
