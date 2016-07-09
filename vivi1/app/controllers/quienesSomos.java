package controllers;

import models.Usuario;
import models.quienesSomo;
import play.mvc.Before;
import play.mvc.Controller;

@CRUD.For(quienesSomo.class)
public class quienesSomos extends Controller {
	
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

	public static void historia() {
        render();
    }
	
	public static void detallehistoria() {
        render();
    }
	
	public static void mision() {
        render();
    }
	
	public static void vision() {
        render();
    }
	
	public static void actualidad() {
        render();
    }
	
	
}