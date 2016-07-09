package controllers;
import java.util.List;

import models.Usuario;
import models.contacto;
import play.mvc.*;
public class contactos extends Controller {
	
	
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
		
		//LISTA DEL MODELO
		List<contacto>contactos=contacto.findAll();
	    render(contactos);
        
    }
	public static void formulario() {
        render();
    }
	public static void editar(Long id){
		contacto contact =contacto.findById(id);
		render(contact);
	}
	
	
	public static void actualizarContacto(Long id, String nombreContacto, int telefonoContacto, String correoContacto){
		contacto contact = contacto.findById(id);
		contact.nombreContacto=nombreContacto;
		contact.telefonoContacto=telefonoContacto;
		contact.correoContacto=correoContacto;
		
		contact.save();
		redirect("/contactos");
		
		
	}
	
	public static void guardarContacto (String nombreContacto, int telefonoContacto, String correoContacto){
		//Instanciando un objeto
		contacto con= new contacto (nombreContacto, telefonoContacto, correoContacto);
		//Guardando
		con.save();
		//Volver a Equipo
		redirect("/contactos");
		}

		public static void eliminarContacto(Long id){
		contacto con=contacto.findById(id);
		con.delete();
		
		//Volver a Equipo
		redirect("/contactos");
		}

	//public static void direccion() {
	  //      render();
    //}
	
	
	

}



