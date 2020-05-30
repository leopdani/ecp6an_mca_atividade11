package exercicio11.eng2020_1_a11.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Previsao implements Serializable {
	private static final long serialVersionUID = 1L;	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;	
	private Double temperaturaMin;
	private Double temperaturaMax;
	private Double umidadeRelAr;
	private LocalDate localDate;
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="id_cidade")
	private Cidade cidade;
	
	@OneToOne
	@JoinColumn(name="id_semana")
	private Semana semana;
	
	public Semana getSemana() {
		return semana;
	}
	
	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public void setSemana(Semana semana) {
		this.semana = semana;
	}

	public Double getTemperaturaMin() {
		return temperaturaMin;
	}
	public void setTemperaturaMin(Double temperaturaMin) {
		this.temperaturaMin = temperaturaMin;
	}
	public Double getTemperaturaMax() {
		return temperaturaMax;
	}
	public void setTemperaturaMax(Double temperaturaMax) {
		this.temperaturaMax = temperaturaMax;
	}
	public Double getUmidadeRelAr() {
		return umidadeRelAr;
	}
	public void setUmidadeRelAr(Double umidadeRelAr) {
		this.umidadeRelAr = umidadeRelAr;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Previsao other = (Previsao) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Previsao [id=" + id + ", temperaturaMin=" + temperaturaMin + ", temperaturaMax=" + temperaturaMax
				+ ", umidadeRelAr=" + umidadeRelAr + ", localDate=" + localDate + ", descricao=" + descricao
				+ ", cidade=" + cidade + ", semana=" + semana + "]";
	}
	
	

}