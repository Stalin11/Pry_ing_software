package controllers;

import java.util.List;

import models.Usuario;
import models.comentario;
import models.contacto;
import models.categoria;
import play.mvc.*;

public class Categoria extends Controller {
	

	@Before
	public static void mostrarUsuario(){
		try{

			Usuario user = Usuario.find("byUsername", Security.connected()).first();

			//obteniendo datos del usuario que ha iniciado sesion
			if(Security.isConnected()) {
		        renderArgs.put("conectado", user);
		       
		    }
			}catch(Exception ex){
				
			}
	}

	  public static void noticia() {
		  
		//LISTA DEL MODELO
			List<categoria>cate=categoria.findAll();
		    render(cate);
		  
	    }
	  
	    public static void registrar(String categoria )  {
	    	categoria registrar = new categoria (categoria);
			registrar.save();	
			noticia();
		}
	    
	    public static void eliminar(Long id){
			categoria elimina = categoria.findById ( id );
			elimina.delete ( );
			noticia ( );
		}
	    
	    public static void ver(){
	    	List <categoria>verfso=categoria.findAll();
	    	render(verfso);
	    }

}
