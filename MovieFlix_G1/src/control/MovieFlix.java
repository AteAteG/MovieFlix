package control;

import services.IFilmServices;
import utilities.DataReader;
import services.FilmServices;
import services.ICustomerServices;
import gUi.Menu;
import services.CustomerServices;

public class MovieFlix {

	// aquí creamos dos objetos de tipo servicios para enlazar la capa control con
	// la capa de servicios
	private IFilmServices filmServices = new FilmServices();
	private ICustomerServices CustServices = new CustomerServices();

	// Método openMovieFlix - Este método
	public void openMovieFlix() {
		boolean keepGoing = true;
		do {
			Menu.showMainMenu();
			keepGoing = this.selectOptions();
		} while (keepGoing);
		System.out.println("Sesión finalizada.");
	}

	// Menú con switch y métodos para gestionar películas y usuarios

	// IMPORTANTE: llamaremos desde aquí a la capa SERVICIOS (CustomerServices o
	// FilmServices) no a la capa DATOS. 
	
	public boolean selectOptions() {
		
		boolean keepGoing = true;

		switch (DataReader.readInt()) {// declarar este método en utilities.DataReader
		
			case 1:
			// IR A MENU DE GESTIÓN DE USUARIOS
				Menu.showCustomerMenu();
					switch (DataReader.readInt()) {
						case 1:
						// ALTA USUARIO
						CustomerServices.addCustomer(); //método NO CREADO TODAVÍA
						break;
						
						case 2: 
						// ELIMINAR USUARIO
						CustomerServices.deleteCustomer(); //método NO CREADO TODAVÍA
						break;
						
						case 3:
						// LISTAR USUARIOS REGISTRADOS
						CustomerServices.listCustomers(); //método NO CREADO TODAVÍA
						break;
						
						case 4:
						// COMPROBAR SI UN USUARIO ESTÁ REGISTRADO
						CustomerServices.checkIfSavedCustomer(); //método NO CREADO TODAVÍA
						break;
						
						case 5:
						// MODIFICAR DATOS DE UN USUARIO
						CustomerServices.modifyCustomer(); //método NO CREADO TODAVÍA
						break;
						
						case 6:
						// CASOS DE PRUEBA
						CustomerServices.test(); //método NO CREADO TODAVÍA
						break;
						
						case 0: 
						// SALIR
						CustomerServices.exit(); //método NO CREADO TODAVÍA, igual mejor renombrar
						break;
					}
				break;
				
			case 2:
			// IR A MENU DE GESTIÓN DE PELÍCULAS
				//falta por rellenar todo esto
				Menu.showFilmMenu();
					switch (DataReader.readInt()) { //método no creado todavía
						case 1:
						// AÑADIR PELICULA
						FilmServices.addFilm(); //método NO CREADO TODAVÍA
						break;
						case 2:
						// ELIMINAR PELICULA
						FilmServices.deleteFilm(); //método NO CREADO TODAVÍA
						break;
						case 3:	
						// LISTAR PELICULAS	
						FilmServices.listFilms(); //método NO CREADO TODAVÍA
						break;
						case 4:
						// COMPROBAR SI UNA PELÍCULA ESTÁ REGISTRADA
						case 5:
						// MODIFICAR DATOS DE UNA PELICULA
						FilmServices.modifyFilm(); //método NO CREADO TODAVÍA, igual mejor renombrar
						break;
						case 6:
						// CASOS DE PRUEBA
						FilmServices.test(); //método NO CREADO TODAVÍA
						break;
						case 0:
						// SALIR
						FilmServices.exit(); //método NO CREADO TODAVÍA
						break;
						
	
					}
				break;

		}


		return keepGoing;
	}
	// Excepciones
	// salir
}