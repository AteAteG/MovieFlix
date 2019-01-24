package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

//La Interface no sirve en este caso porque necesitamos heredar de la clase Exception (propia de Java), no me di cuenta
//Por eso he creado una clase base para excepciones y que customer y films hereden de ella
//Pero estaba mirando si tiene que ser abstract (para tener metodos sin especificar) o una normal
//Porque realmente exceptuando los getters/setters y el toString, todos son constructores

public abstract class BaseExceptions extends Exception {

	private static final long serialVersionUID = 1L; //Throwable, clase padre de Exception, implementa la interfaz serializable
	
	private Level level; 

	public BaseExceptions() {

	}

	public BaseExceptions(String message) {
		super(message);
	}

	public BaseExceptions(String message, int importance) {
		super(message);
		setLevel(importance);
	}

	public BaseExceptions(Throwable cause) {

	}

	public BaseExceptions(String message, Throwable cause) {

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
