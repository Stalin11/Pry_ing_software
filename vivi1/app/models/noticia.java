package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class noticia extends Model {
	private int idNoti;
	private String encabezadoNoti;
	private String contenidoNoti;
	private String fechaNoti;
	private String tipoNoti;
	private String comentarioNoti;

	public noticia(int idNoti, String encabezadoNoti, String contenidoNoti,
			String fechaNoti, String tipoNoti, String comentarioNoti) {
		super();
		this.idNoti = idNoti;
		this.encabezadoNoti = encabezadoNoti;
		this.contenidoNoti = contenidoNoti;
		this.fechaNoti = fechaNoti;
		this.tipoNoti = tipoNoti;
		this.comentarioNoti = comentarioNoti;
	}

	public int getIdNoti() {
		return this.idNoti;
	}

	public void setIdNoti(int idNoti) {
		this.idNoti = idNoti;
	}

	public String getEncabezadoNoti() {
		return this.encabezadoNoti;
	}

	public void setEncabezadoNoti(String encabezadoNoti) {
		this.encabezadoNoti = encabezadoNoti;
	}

	public String getContenidoNoti() {
		return this.contenidoNoti;
	}

	public void setContenidoNoti(String contenidoNoti) {
		this.contenidoNoti = contenidoNoti;
	}

	public String getFechaNoti() {
		return this.fechaNoti;
	}

	public void setFechaNoti(String fechaNoti) {
		this.fechaNoti = fechaNoti;
	}

	public String getTipoNoti() {
		return this.tipoNoti;
	}

	public void setTipoNoti(String tipoNoti) {
		this.tipoNoti = tipoNoti;
	}

	public String getComentarioNoti() {
		return this.comentarioNoti;
	}

	public void setComentarioNoti(String comentarioNoti) {
		this.comentarioNoti = comentarioNoti;
	}
	
	public String toString()  {
        return "nombre: (" + encabezadoNoti + ")";
}

}
