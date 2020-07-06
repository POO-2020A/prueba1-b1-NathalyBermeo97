import java.util.ArrayList;

import java.util.Scanner;
public class PRUEBA2 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>numbers=new ArrayList<>();
        System.out.println("Ingrese un numero:");
        int first= Integer.valueOf(scanner.nextLine());
        System.out.println("Ingrese otro numero:");
        int second= Integer.valueOf(scanner.nextLine());
        printNumbers(numbers,first,second);
        
        
    }
    public static void printNumbers(ArrayList<Integer> numbers, int first, int second){
        int i=0;
        int suma=0;
        
        
        for(i=first;i<=second;i++)
        {
           if(i%2 !=0)
           {
              
               suma=suma+i;
               
           }
            
            
        }
        System.out.println("");    
        System.out.println("La suma de los numeros impares es:"+ suma);
        
        
        
    }
    
}
