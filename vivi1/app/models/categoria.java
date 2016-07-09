package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class categoria extends Model {
	public String Categoria;
	

	public categoria(String categoria) {
		super();
		Categoria = categoria;
	}	   
	   
}