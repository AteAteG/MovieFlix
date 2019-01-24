package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

//El problema de esto es que son MUY redundantes

public class FilmExceptions extends Exception {
	
private static final long serialVersionUID = 1L; 
	
	private Level level; 

	public FilmExceptions() {

	}

	public FilmExceptions(String message) {
		super(message);
	}

	public FilmExceptions(String message, int importance) {
		super(message);
		setLevel(importance);
	}

	public FilmExceptions(Throwable cause) {

	}

	public FilmExceptions(String message, Throwable cause) {

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
