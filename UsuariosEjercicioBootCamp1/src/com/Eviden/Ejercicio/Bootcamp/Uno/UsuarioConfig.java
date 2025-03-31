package com.Eviden.Ejercicio.Bootcamp.Uno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //Añadimos esta anotacion para ahorrarnos el archivo XML
@ComponentScan("es.Eviden.BootCamp.Uno") //Mostramos la dirección del paquete con esta anotación
//@PropertySource("classpath:informacionTareas.properties")
public class UsuarioConfig {
	
	//Definimos beans para las interfaces
	
	/** ¿Cómo lo vamos a llevar a cabo?
	 * Primero llamamos a la interfaz y le ponemos un nombre clave, el nombre será el nombre del bean
	 * Despues realizamos un return en el cual, como java no permite instanciar las interfaces, llamaremos a la clase que si lo haga con esa interfaz
	 * En este caso ActividadUsuarios
	 */
	
	@Bean(name = "actividadesParaUsuarios")
	public ActividadUsuariosInterfaz actividadUsuario() {
		return new ActividadUsuarios();
	}
	
	
	//Definimos el bean para el Usuario clase e insertamos la depencendia
	
	/**¿Qué hacemos en esta segunda parte?
	 * Creamos un nuevo bean con la otra interfaz, con la que estamos trabajando principalmente, le damos un nombre usuariosClase
	 * A la hora de retornarla, al igual que hicimos antes, buscamos la clase que implementa a dicha interfaz y dentro de esta (nos lo va a pedir)
	 * Añadimos el id del bean anterior.
	 * Prueba a hacerlo sin añadir el bean del id anterior y veras como sale error
	 */
	
	@Bean
	public UsuariosInterfaces usuariosClase() {
		return new UsuariosClase(actividadUsuario());
	}
	
}
