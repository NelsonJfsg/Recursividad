package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Clases.Metodos;

public class Main {
    
    //Clase para leer el teclado.
    public static BufferedReader Lec = new BufferedReader (new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        
        //Variables
        int res = 0;
        int n = 0;
        int sum = 0;
        int nf = 0;
        String palabra = null;
        
        //Titulo.
        System.out.println("Recursividad. v1.0\n");
        
        //Ciclo para repetir el programa.
        while(true){
            System.out.println("-- Menu --");
            System.out.println("Factorial de un numero real. (1)");
            System.out.println("Invertir una palabra. (2)");
            
            //Res = validar opcion.
            do{
                try{
                    System.out.print("Respuesta: ");
                    res = Integer.parseInt(Lec.readLine());
                }catch(NumberFormatException e){
                    System.out.println("Solo valores numericos.");
                    continue;
                }    
                break;
            }while(true);
            
            
            
            //Opcion suma reversiva.
            if(res == 1){

                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

                //Pedir numero.
                do{
                    try{
                        System.out.print("Introduzca un numero natural: ");
                        n = Integer.parseInt(Lec.readLine()); //Leer n.
                    }catch(NumberFormatException e){
                        System.out.println("Solo valores numericos.");
                        continue;
                    }
                    break;
                }while(true);
                
                nf = n;

                //Metodo para obtener el factorial de n!.
                Metodos.factorial(n, sum, nf);

            }else{
                
                //Opcion palabra al reves.
                if(res == 2){
                    
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    
                    //Pedir palabra.
                    System.out.print("Introduzca una palabra: ");
                    palabra = Lec.readLine();

                    //Variable para el metodo.
                    int i = (palabra.length()-1);
                    Metodos.InvertirPalabra(palabra, i);
                    
                }else{
                    
                    //Sin opcion valida.
                    System.out.println("Elija una opcion valida.\n");
                }
            }    
        }
        
    }
}
