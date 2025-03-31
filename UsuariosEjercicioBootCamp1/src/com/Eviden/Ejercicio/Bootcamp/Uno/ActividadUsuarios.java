package com.Eviden.Ejercicio.Bootcamp.Uno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import es.Eviden.BootCamp.Uno.ActividadUsuariosInterfaz;

public class ActividadUsuarios implements ActividadUsuariosInterfaz {
	
	

	@Override
	public String getTrabajoSemanal() {
		// TODO Auto-generated method stub
		return "El trabajo semanal realizada se ha centrado en: " ;
	}

	@Override
	public String getInformeSemanal() {
		// TODO Auto-generated method stub
		return "-Tareas con Java \n "
				+ "-Creacion de proyectos con Spring \n "
				+ "-Trabajo con anotaciones \n "
				+ "-Cuaderno BootCamp 1";
	}
	
	
	/**
	//Esto nos servira para importar información externa del documento informacionTareas, con la anotacion Value. El atributo no tiene porque tener
	//El mismo nombre, pero los valores entre {} si tienen que tener el nombre que aparecen en el archivo informaciónTareas
	@Value("${Tarea1}")
	private String tarea1;
	
	@Value("${Tarea2}")
	private String tarea2;
	
	@Value("${Tarea3}")
	private String tarea3;
	
	public String getTarea1() {
		return tarea1;
	}

	public String getTarea2() {
		return tarea2;
	}

	public String getTarea3() {
		return tarea3;
	}
	 */
	

}