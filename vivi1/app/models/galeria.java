package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class galeria extends Model{
    //public int idGal;
    public Blob imagenGal;    
   // public Date fechaGal;
    public String descripcionGal;
    public String comentarioGal;
	
 
 
	
	public String toString() {
		return "nombre: (" + imagenGal + ")";
	}
    
}
