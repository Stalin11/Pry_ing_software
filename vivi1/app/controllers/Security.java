package controllers;

import models.Usuario;
import play.mvc.Before;


public class Security  extends Secure.Security{
	
	
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
	
	
	public static boolean authenticate(String username, String password){
		Usuario usuario=Usuario.find("byUsername",username).first();
		
		
		if (usuario!= null){
			if(usuario.password.equals(password)){
				flash.put("bienvenido", "--");
				return true;
			}else{
				
				flash.put("errorPassword","La contraseña ingresada es incorrecta");
				return false;
			}
		}else{
			flash.put("errorUsername","El usuario ingresado es incorrecto");
			return false;
		}
		
	}
	
	

	

}
