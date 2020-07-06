import java.util.Scanner;



public class prueba1 {

    
    public static void main(String[] args) {
        
       Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese un string:");
        String s = scanner.nextLine();
        
        int i=0;
        
        
        for(i=0;i<s.length();i++)
        {
            if(i % 2 ==0)
            {
                
                
                System.out.print(s.toUpperCase());
            }else{
                System.out.print(s.toLowerCase());
                
            }
        }
         
                

        
        
       
    }
    
}
