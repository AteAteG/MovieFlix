package exceptions;

import exceptions.BaseExceptions;
import exceptions.CustomerException;

//un ejemplo para mostrar como se usan las excepciones personalizadas, para borrar en Github antes de subir al master

public class EjemploException {
	public void noSeQuePoner() throws CustomerException {
		int numClientes = -1;
		CustomerException exception;

		if (numClientes <= 0) {
			throw new CustomerException("Sin clientes"); //como usar Scanner sin tener que declararlo en una variable
		} else if (numClientes > 1000) {
			exception = new CustomerException("Superado el aforo", 1); //declarada una variable
		}		
	}

	public void otroEjemplo() throws BaseExceptions {
		//el metodo es capaz de lanzar una excepcion, pero nada la esta atrapando
		//se puede relegar esta excepcion, por ejemplo usando un metodo de otra clase que si se encarga
	}
	
	public void prueba() throws CustomerException {
		int suegno = 1000;
		
		if (suegno > 1000) {
			throw new CustomerException("Me muero");
		}
	}

	public void ejemploConTry() {
		try {
			throw new CustomerException("Holi");
		} catch (CustomerException e) {
			e.toString();
		}
	}

	
}
