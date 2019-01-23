package control;
/*
import services.IFilmServices;
import services.FilmServices;
import services.ICustomerServices;
import services.CustomerServices;
import utilities.DataReader;
*/

import services.IFilmServices;
import services.FilmServices;
import services.ICustomerServices;
import services.CustomerServices;

public class MovieFlix {
	
	//aquí creamos dos objetos de tipo servicios para enlazar la capa control con la capa de servicios
	 private IFilmServices filmServices = new FilmServices();
	 private ICustomerServices CustServices = new CustomerServices();
	 
	//Método openMovieFlix - hay que rellenarlo!!!!! :)
	 public void openMovieFlix() {}
	//Menú con switch y métodos para gestionar películas y usuarios
	//Excepciones
	//salir
}
