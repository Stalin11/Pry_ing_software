package models;

import javax.persistence.Column;
import javax.persistence.Entity;

import play.data.validation.Unique;
import play.db.jpa.Model;

@Entity
public class Usuario extends Model {
	
	
	public String username;	
	public String password;
	public String nombre;
	public String apellido;

	public String toString(){
		
		return nombre+" "+apellido;
	}
    
}
