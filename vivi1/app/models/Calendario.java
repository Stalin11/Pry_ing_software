package models;

import javax.persistence.Column;
import javax.persistence.Entity;

import play.db.jpa.Model;
@Entity
public class Calendario extends Model{
	
	public String titulo;
	@Column(columnDefinition="TEXT")	
	public String descripcion;
	public String otro;
	public String inicio;
	public String fin;
	
}