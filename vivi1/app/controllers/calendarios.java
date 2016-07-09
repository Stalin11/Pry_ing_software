package controllers;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import models.Calendario;
import models.Usuario;
import play.mvc.Before;
import play.mvc.Controller;

public class calendarios extends Controller {

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

	public static void calendar() {

		List<Calendario> calend = Calendario.findAll();
		render(calend);

	}
	public static void horarioProgramacion() { // renderizando la pagina de horarios de programacion
        render();
    }
	public static void LunesAViernes() {
        render();
    }
	public static void FinSemana() {
        render();
    }
	
	


	public static void leerCalendario() {

		List<Calendario> calendario = Calendario.findAll();
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm a")
				.create();
		String json = gson.toJson(calendario);
		renderJSON(json);

	}

	public static boolean actualizar(String models) {

		// {"titulo":"Documentales","descripcion":"Informacion estudiantil","inicio":"2016-02-04T20:00:00.000Z","fin":"2016-02-04T20:30:00.000Z","id":24}
		Gson gson = new Gson();
		JsonElement element = gson.fromJson(obtenerValor(models),
				JsonElement.class);
		JsonObject objetoJson = element.getAsJsonObject();

		String idTexto = String.valueOf(objetoJson.get("id"));

		Long id = Long.parseLong(idTexto);

		Calendario calendario = Calendario.findById(id);

		String titulo = String.valueOf(objetoJson.get("titulo"));
		String descripcion = String.valueOf(objetoJson.get("descripcion"));
		String otro = String.valueOf(objetoJson.get("otro"));
		String inicio = String.valueOf(objetoJson.get("inicio"));
		String fin = String.valueOf(objetoJson.get("fin"));

		titulo = obtenerValor(titulo);
		descripcion = obtenerValor(descripcion);
		otro = obtenerValor(otro);
		inicio = obtenerValor(inicio);
		fin = obtenerValor(fin);
		calendario.titulo = titulo;
		calendario.descripcion = descripcion;
		calendario.otro = otro;
		calendario.inicio = inicio;
		calendario.fin = fin;

		calendario.save();

		return true;

	}

	public static boolean eliminar(String models) {

		Gson gson = new Gson();
		JsonElement element = gson.fromJson(obtenerValor(models),
				JsonElement.class);
		JsonObject objetoJson = element.getAsJsonObject();

		String idTexto = String.valueOf(objetoJson.get("id"));

		Long id = Long.parseLong(idTexto);

		Calendario calendario = Calendario.findById(id);
		calendario.delete();
		return true;

	}

	public static Boolean guardar(String models) {

		Gson gson = new Gson();
		JsonElement element = gson.fromJson(obtenerValor(models),
				JsonElement.class);
		JsonObject objetoJson = element.getAsJsonObject();
		String titulo = String.valueOf(objetoJson.get("titulo"));
		String descripcion = String.valueOf(objetoJson.get("descripcion"));
		String otro = String.valueOf(objetoJson.get("otro"));
		String inicio = String.valueOf(objetoJson.get("inicio"));
		String fin = String.valueOf(objetoJson.get("fin"));
		titulo = obtenerValor(titulo);
		descripcion = obtenerValor(descripcion);
		otro = obtenerValor(otro);
		inicio = obtenerValor(inicio);
		fin = obtenerValor(fin);
		Calendario nuevoCalendario = new Calendario();
		nuevoCalendario.titulo = titulo;
		nuevoCalendario.inicio = inicio;
		nuevoCalendario.fin = fin;
		nuevoCalendario.descripcion = descripcion;
		nuevoCalendario.otro = otro;
		nuevoCalendario.save();
		return true;
	}

	public static boolean actualizar2(String models) {

		return false;

	}

	public static boolean eliminar2(String models) {

		return false;

	}

	public static Boolean guardar2(String models) {
		return false;
	}

	public static String obtenerValor(String cadena) {
		int longitud = cadena.length();
		return cadena.substring(1, longitud - 1);

	}

}