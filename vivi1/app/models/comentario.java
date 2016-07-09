package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class comentario extends Model {
	public String Nombre;
	   public String Apellido;
	   public String Comentario;
	   public String Categoria;
	   
	   
	   
	   public comentario(String nombre, String apellido,String comentario,String categoria ) {
			super();
			this.Nombre = nombre;
			this.Apellido = apellido;
			this.Comentario = comentario;
			this.Categoria = categoria;
			
		}
}
