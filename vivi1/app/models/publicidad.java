package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class publicidad extends Model {
	private int idPublicidad;
	private String descripcionPublicidad;
	private String tipoPublicidad;
	private String fechaPublicidad;
	private String imagenPublicidad;
	private String videoPublicidad;
	private String comentarioPublicidad;

	public publicidad(int idPublicidad, String descripcionPublicidad,
			String tipoPublicidad, String fechaPublicidad,
			String imagenPublicidad, String videoPublicidad,
			String comentarioPublicidad) {
		super();
		this.idPublicidad = idPublicidad;
		this.descripcionPublicidad = descripcionPublicidad;
		this.tipoPublicidad = tipoPublicidad;
		this.fechaPublicidad = fechaPublicidad;
		this.imagenPublicidad = imagenPublicidad;
		this.videoPublicidad = videoPublicidad;
		this.comentarioPublicidad = comentarioPublicidad;
	}

	public int getIdPublicidad() {
		return this.idPublicidad;
	}

	public void setIdPublicidad(int idPublicidad) {
		this.idPublicidad = idPublicidad;
	}

	public String getDescripcionPublicidad() {
		return this.descripcionPublicidad;
	}

	public void setDescripcionPublicidad(String descripcionPublicidad) {
		this.descripcionPublicidad = descripcionPublicidad;
	}

	public String getTipoPublicidad() {
		return this.tipoPublicidad;
	}

	public void setTipoPublicidad(String tipoPublicidad) {
		this.tipoPublicidad = tipoPublicidad;
	}

	public String getFechaPublicidad() {
		return this.fechaPublicidad;
	}

	public void setFechaPublicidad(String fechaPublicidad) {
		this.fechaPublicidad = fechaPublicidad;
	}

	public String getImagenPublicidad() {
		return this.imagenPublicidad;
	}

	public void setImagenPublicidad(String imagenPublicidad) {
		this.imagenPublicidad = imagenPublicidad;
	}

	public String getVideoPublicidad() {
		return this.videoPublicidad;
	}

	public void setVideoPublicidad(String videoPublicidad) {
		this.videoPublicidad = videoPublicidad;
	}

	public String getComentarioPublicidad() {
		return this.comentarioPublicidad;
	}

	public void setComentarioPublicidad(String comentarioPublicidad) {
		this.comentarioPublicidad = comentarioPublicidad;
	}

	public String toString() {
		return "nombre: (" + descripcionPublicidad + ")";
	}

}
