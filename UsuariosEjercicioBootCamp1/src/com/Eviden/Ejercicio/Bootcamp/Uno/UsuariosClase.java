package com.Eviden.Ejercicio.Bootcamp.Uno;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//Si usamos el siguiente @Scope("property") el PostConstruct y el PreDestroy no funcionarán.
public class UsuariosClase implements UsuariosInterfaces {
	
	//Para marcar el comienzo del Bean
	@PostConstruct
	public void lanzarBean() {
		System.out.println("Estamos comenzando el lanzamiento de nuestros beans" + "\n");
	}
	
	//Para marcar el final del Bean
	@PreDestroy
	public void cerrarBean() {
		System.out.println("Cerrando los beans lanzados");
	}
	
	
	public String insertarNombre(String nombre) {
		// TODO Auto-generated method stub
		return "Mi nombre es:  " +nombre;
	}

	
	public String insertarApellidos(String apellido1, String apellido2) {
		// Si los apellidos se corresponden con los que son realmente en mi caso
	    if (apellido1.equals("Campanero")  && apellido2.equals("Arévalo")) {
	        return "Primer apellido: " +apellido1+ " segundo apellido: " +apellido2;
	    } 
	    else {
	        return "Revisa bien los apellidos, has debido de cometer un error";
	    }
	}

	
	public String mostrarInformacion(String email, String DAS) {
		// TODO Auto-generated method stub
		return "Mi correo es: " +email+ " \n Mi DAS para Eviden es: " +DAS;
	}

	
	public String lanzarMensaje() {
		// TODO Auto-generated method stub
		return "Este es el proyecto final, correspondiente al ejercicio 2.7 del bootcamp 1 de Spring";
	}

	
	public String mostrarActividad() {
		// TODO Auto-generated method stub
		return "Acciones semanales realizadas:  \n " +usuarioActividades.getInformeSemanal() + "\n";
	}
	
	public UsuariosClase(ActividadUsuariosInterfaz usuarioActividades) {
		this.usuarioActividades = usuarioActividades;
	}
	
	public UsuariosClase() {
		
	}
	
	@Autowired
	@Qualifier("actividadesParaUsuarios")
	private ActividadUsuariosInterfaz usuarioActividades;

}
