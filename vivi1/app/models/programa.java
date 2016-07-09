package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class programa extends Model {
	private int idPrograma;
	private String diaPrograma;
	private String horaPrograma;

	public programa(int idPrograma, String diaPrograma, String horaPrograma) {
		super();
		this.idPrograma = idPrograma;
		this.diaPrograma = diaPrograma;
		this.horaPrograma = horaPrograma;
	}

	public int getIdPrograma() {
		return this.idPrograma;
	}

	public void setIdPrograma(int idPrograma) {
		this.idPrograma = idPrograma;
	}

	public String getDiaPrograma() {
		return this.diaPrograma;
	}

	public void setDiaPrograma(String diaPrograma) {
		this.diaPrograma = diaPrograma;
	}

	public String getHoraPrograma() {
		return this.horaPrograma;
	}

	public void setHoraPrograma(String horaPrograma) {
		this.horaPrograma = horaPrograma;
	}

	public String toString() {
		return "nombre: (" + diaPrograma + ")";
	}

}
