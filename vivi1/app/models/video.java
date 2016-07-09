package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class video extends Model{
    //public int idGal;
    public Blob videoVid;    
   // public Date fechaVid;
    public String descripcionVid;
    public String comentarioVid;
	
	public String toString() {
		return "nombre: (" + videoVid + ")";
	}
    
}
