package model;
 
public enum Genre {
	policiaca(1), rom�ntica(2), aventuras(3), comedia(4), animacion(5) ,thriller(6);

	private int value;
	
	private Genre(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    

}
