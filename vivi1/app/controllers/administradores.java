package controllers;

import models.Usuario;
import models.administrador;
import play.mvc.Before;
import play.mvc.Controller;

@CRUD.For(administrador.class)
public class administradores extends Controller {
	
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