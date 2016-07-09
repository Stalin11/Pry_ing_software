package controllers;
import models.Usuario;
import play.mvc.Before;
import play.mvc.With;


@CRUD.For(Usuario.class)
@With(Secure.class)
public class usuarios extends CRUD {
	
	
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

}
