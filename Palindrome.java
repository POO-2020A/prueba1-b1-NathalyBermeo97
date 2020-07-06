import java.util.Scanner;
public class PRUEBA2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe una palabra:");
        String cadena = scanner.nextLine();
        
        esPalindromo(cadena);
        
        System.out.println(esPalindromo(cadena));
    }
    
    public static boolean esPalindromo(String cadena) {
		

	cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
		.replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
		
	String invertida = new StringBuilder(cadena).reverse().toString();
		
	return invertida.equals(cadena);
    }
}
