package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class contacto extends Model {
	public String nombreContacto;
	public int telefonoContacto;
	public String correoContacto;
	
	//Constructor
	public contacto(String nombreContacto, int telefonoContacto,
			String correoContacto) {
		super();
		this.nombreContacto = nombreContacto;
		this.telefonoContacto = telefonoContacto;
		this.correoContacto = correoContacto;
	}

	

}
