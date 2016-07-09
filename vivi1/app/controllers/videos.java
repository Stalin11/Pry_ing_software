package controllers;

import java.util.List;

import models.Usuario;
import models.video;
import play.mvc.Before;

@CRUD.For(video.class)
public class videos extends CRUD {

	@Before
	public static void mostrarUsuario() {
		try {

			Usuario user = Usuario.find("byUsername", Security.connected())
					.first();

			// obteniendo datos del usuario que ha iniciado sesion
			if (Security.isConnected()) {
				renderArgs.put("conectado", user);

			}
		} catch (Exception ex) {

		}
	}

	public static void verVideo(Long id) {
		video s = video.findById(id);
		response.setContentTypeIfNotSet(s.videoVid.type());
		renderBinary(s.videoVid.get());
	}

	public static void fotos() {
		List<video> galerias = video.find("order by id desc").fetch();
		render(galerias);
	}

	public static void gerente() {
		render();
	}
}