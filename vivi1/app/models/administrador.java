package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class administrador extends Model {
	private int idAdministrador;
	private String nomAdministrador;
	
	
		public administrador(int idAdministrador, String nomAdministrador) {
		super();
		this.idAdministrador = idAdministrador;
		this.nomAdministrador = nomAdministrador;
	}
		
		 public int getIdAdministrador() {
				return this.idAdministrador;
			}

			public void setIdAdministrador(int idAdministrador) {
				this.idAdministrador = idAdministrador;
			}
		public String getNomAdministrador() {
				return this.nomAdministrador;
				}

		public void setnomAdministrador(String nomAdministrador) {
				this.nomAdministrador = nomAdministrador;
				}
				
		public boolean eliminar() {
		return false;
	}
		public String toString()  {
	        return "nombre: (" + nomAdministrador + ")";
	}

}
