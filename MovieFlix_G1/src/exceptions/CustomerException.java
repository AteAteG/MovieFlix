package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

//He probado con una clase base (BaseException)
//Pero obtenia un resultado similar de redundancia. Lo unico que no haria falta importar lo de arriba. 

public class CustomerException extends Exception {
	
private static final long serialVersionUID = 1L; 
	
	private Level level; 

	public CustomerException() {

	}

	public CustomerException(String message) {
		super(message);
	}

	public CustomerException(String message, int importance) {
		super(message);
		setLevel(importance);
	}

	public CustomerException(Throwable cause) {

	}

	public CustomerException(String message, Throwable cause) {

	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(int importance) {
		switch(importance) {
		case 1:
			level = Level.SEVERE;
			break;
		case 2:
			level = Level.WARNING;
			break;
		case 3:
			level = Level.INFO;
			break;
		default:
			level = Level.INFO;
			break;
		}
	}
	
	@Override
	public String toString() {
		Logger.getLogger(BaseExceptions.class.getName()).log(level, super.getMessage());
		return super.getMessage();
	}

	
}
