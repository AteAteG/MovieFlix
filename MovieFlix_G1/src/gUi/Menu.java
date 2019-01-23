package gUi;

public class Menu {

	public static void showMainMenu () {
        System.out.println(" ");
        System.out.println(" 			MOVIEFLIX ");
        System.out.println(" ");
        System.out.println("************************************************");
        System.out.println("*  Por favor, escoja una opcion: ");
        System.out.println("*    1.-Gestión de USUARIOS");
        System.out.println("*    2.-Gestión de PELÍCULAS");
        System.out.println("*	 0.-Terminar sesión");
        System.out.println("************************************************");
        System.out.println(" ");
        System.out.print(">> ");



	}
	
	public static void showFilmMenu() {
		  System.out.println(" ");
		    System.out.println(" 			MOVIEFLIX ");
	        System.out.println(" ");
	        System.out.println("************************************************");
	        System.out.println("*  Por favor, escoja una opcion: ");
	        System.out.println("*    1.-Dar de alta un usuario");
	        System.out.println("*    2.-Eliminar un usuario");
	        System.out.println("*    3.-Listar los usuarios registrados");
	        System.out.println("*    4.-Comprobar si un usuario está registrado");
	        System.out.println("*    5.-Modificar datos de un usuario registrado");
	        System.out.println("*    6.-Casos de prueba");
	        System.out.println("*    0.-Terminar sesión");
	        System.out.println("************************************************");
	        System.out.println(" ");
	        System.out.print(">> ");
	}
	
//por rellenar con opciones coherentes (esto es copipeist del supermercado.
	public static void showCustomerMenu() {
		  System.out.println(" ");
		    System.out.println(" 			MOVIEFLIX ");
	        System.out.println(" ");
	        System.out.println("************************************************");
	        System.out.println("*  Por favor, escoge una opcion: ");
	        System.out.println("*    1.-Dar de alta un producto");
	        System.out.println("*    2.-Eliminar un producto");
	        System.out.println("*    3.-Listar los productos existentes");
	        System.out.println("*    4.-Indicar el stock de un producto concreto");
	        System.out.println("*    5.-Productos con existencias < 5 unidades");
	        System.out.println("*    6.-Casos de prueba");
	        System.out.println("*    7.-Guardar stock en fichero");
	        System.out.println("*    8.-Recoger stock de fichero");
	        System.out.println("*    0.-Terminar sesion");
	        System.out.println("************************************************");
	        System.out.println(" ");
	        System.out.print(">> ");
	}
}