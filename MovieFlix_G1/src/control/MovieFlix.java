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
	
	//aqu� creamos dos objetos de tipo servicios para enlazar la capa control con la capa de servicios
	 private IFilmServices filmServices = new FilmServices();
	 private ICustomerServices CustServices = new CustomerServices();
	 
	//M�todo openMovieFlix - hay que rellenarlo!!!!! :)
	 public void openMovieFlix() {}
	//Men� con switch y m�todos para gestionar pel�culas y usuarios
	//Excepciones
	//salir
}
