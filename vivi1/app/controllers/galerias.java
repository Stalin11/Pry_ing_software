package controllers;

import java.util.List;

import models.Usuario;
import models.galeria;
import play.mvc.Before;

@CRUD.For(galeria.class)
public class galerias extends CRUD {
	
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
	
	 public static void verImagen(Long id){
	    	galeria s=galeria.findById(id);
	    	response.setContentTypeIfNotSet(s.imagenGal.type());
	        renderBinary(s.imagenGal.get());
	 }

	public static void fotos() {
		List<galeria> galerias=galeria.find("order by id desc").fetch();
        render(galerias);
    }
	
	public static void gerente() {
        render();
    }
}