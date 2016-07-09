package controllers;

import models.Usuario;
import models.programa;
import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.With;

@CRUD.For(programa.class)

public class programas extends Controller {
	
	
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
        render();
    }
	
	public static void video() {
        render();
    }
	
	public static void horarioProgramacion() {
        render();
    }
	
	public static void LunesAViernes() {
        render();
    }
	public static void FinSemana() {
        render();
    }
	
}

