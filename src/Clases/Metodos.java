package Clases;

public class Metodos {
    
    //Metodo factorial.
    public static void factorial(int n, int sum, int nf){
        
        //Validar si el factorial aún no termina.
        if(n >= 0){
            sum = sum + n; //Acumulador.
            n--; 
            factorial(n, sum, nf); //Volver a llamar el metodo.
        }else{
            if(n < 0){
                System.out.println("F(" + nf + "): " + sum + "\n");
            }else{
                if(n == 0){
                    System.out.println("F(0): 1\n");
                }
            }
        }
    } //Fin metodo factorial.
    
    public static void InvertirPalabra(String palabra, int i){
        
        //Variables.
        char[] palabraReves = palabra.toCharArray();
        
        //validar si el arreglo aun no termina.
        if(i >= 0){
            System.out.print(palabraReves[i]);
            i--;
            InvertirPalabra(palabra, i);
        }else{
            if(i < 0){
                System.out.println("\n");
            }
        }
    }
    
}
