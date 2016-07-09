package controllers;

import java.util.List;

import models.Usuario;
import models.comentario;
import models.contacto;
import play.mvc.*;

public class Comentarios extends Controller {
	

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
			List<comentario>comentarios=comentario.findAll();
			
		    render(comentarios);
		  
	    }
	  
	  
	    public static void registrar(String nombre, String apellido,String comentario,String categoria )  {
	    	comentario registrar = new comentario (nombre, apellido, comentario,categoria);
			registrar.save();	
			noticia();
		} 
	    
	    public static void eliminar(Long id){
			comentario elimina = comentario.findById ( id );
			elimina.delete ( );
			noticia ( );
		}

}
