package services;

import data.ICustomerManager;
import data.CustomerManager;
import model.Customer;
import utilities.DataReader;
import exceptions.IExceptions; //revisar, hay que hacer clase concreta de la interfaz IExceptions

//this is a concrete class from ICustomerService Interface



public class CustomerServices implements ICustomerServices {
//creamos un objeto de tipo servicios en esta capa para enlazar la capa de datos (esta) con la capa servicios (manager)
	private ICustomerManager CustManager = new CustomerManager();
}
