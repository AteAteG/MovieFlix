package control;

import services.IFilmServices;
import utilities.DataReader;
import services.FilmServices;
import services.ICustomerServices;
import gUi.Menu;
import services.CustomerServices;

public class MovieFlix {

	// aqu� creamos dos objetos de tipo servicios para enlazar la capa control con
	// la capa de servicios
	private IFilmServices filmServices = new FilmServices();
	private ICustomerServices CustServices = new CustomerServices();

	// M�todo openMovieFlix - Este m�todo
	public void openMovieFlix() {
		boolean keepGoing = true;
		do {
			Menu.showMainMenu();
			keepGoing = this.selectOptions();
		} while (keepGoing);
		System.out.println("Sesi�n finalizada.");
	}

	// Men� con switch y m�todos para gestionar pel�culas y usuarios

	// IMPORTANTE: llamaremos desde aqu� a la capa SERVICIOS (CustomerServices o
	// FilmServices) no a la capa DATOS. 
	
	public boolean selectOptions() {
		
		boolean keepGoing = true;

		switch (DataReader.readInt()) {// declarar este m�todo en utilities.DataReader
		
			case 1:
			// IR A MENU DE GESTI�N DE USUARIOS
				Menu.showCustomerMenu();
					switch (DataReader.readInt()) {
						case 1:
						// ALTA USUARIO
						CustomerServices.addCustomer(); //m�todo NO CREADO TODAV�A
						break;
						
						case 2: 
						// ELIMINAR USUARIO
						CustomerServices.deleteCustomer(); //m�todo NO CREADO TODAV�A
						break;
						
						case 3:
						// LISTAR USUARIOS REGISTRADOS
						CustomerServices.listCustomers(); //m�todo NO CREADO TODAV�A
						break;
						
						case 4:
						// COMPROBAR SI UN USUARIO EST� REGISTRADO
						CustomerServices.checkIfSavedCustomer(); //m�todo NO CREADO TODAV�A
						break;
						
						case 5:
						// MODIFICAR DATOS DE UN USUARIO
						CustomerServices.modifyCustomer(); //m�todo NO CREADO TODAV�A
						break;
						
						case 6:
						// CASOS DE PRUEBA
						CustomerServices.test(); //m�todo NO CREADO TODAV�A
						break;
						
						case 0: 
						// SALIR
						CustomerServices.exit(); //m�todo NO CREADO TODAV�A, igual mejor renombrar
						break;
					}
				break;
				
			case 2:
			// IR A MENU DE GESTI�N DE PEL�CULAS
				//falta por rellenar todo esto
				Menu.showFilmMenu();
					switch (DataReader.readInt()) { //m�todo no creado todav�a
						case 1:
						// A�ADIR PELICULA
						FilmServices.addFilm(); //m�todo NO CREADO TODAV�A
						break;
						case 2:
						// ELIMINAR PELICULA
						FilmServices.deleteFilm(); //m�todo NO CREADO TODAV�A
						break;
						case 3:	
						// LISTAR PELICULAS	
						FilmServices.listFilms(); //m�todo NO CREADO TODAV�A
						break;
						case 4:
						// COMPROBAR SI UNA PEL�CULA EST� REGISTRADA
						case 5:
						// MODIFICAR DATOS DE UNA PELICULA
						FilmServices.modifyFilm(); //m�todo NO CREADO TODAV�A, igual mejor renombrar
						break;
						case 6:
						// CASOS DE PRUEBA
						FilmServices.test(); //m�todo NO CREADO TODAV�A
						break;
						case 0:
						// SALIR
						FilmServices.exit(); //m�todo NO CREADO TODAV�A
						break;
						
	
					}
				break;

		}


		return keepGoing;
	}
	// Excepciones
	// salir
}