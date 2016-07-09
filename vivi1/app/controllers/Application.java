package controllers;


import java.util.List;

import models.Calendario;
import models.Usuario;
import play.mvc.Before;
import play.mvc.Controller;




public class Application extends Controller {
	
	
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

    public static void index() {
    	render();
    }
        	
    	public static void articulosemana() {
        	render();
    	}

    	public static void notasInteres() {
        	render();
    	}
    	
    	public static void LunesAViernes() {

    		List<Calendario> calend = Calendario.findAll();
    		render(calend);

    	}
}