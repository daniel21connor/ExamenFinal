
package menprincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MetodoListas {
    List<String> lisNombreDepar = new ArrayList<>();
        List<String> cantidadLis = new ArrayList<>();
        List<String> cabecera = new ArrayList<>();
        List<Integer> numero=new ArrayList<>();
      static  Scanner scanner=new Scanner (System.in);
    
     public void Departamento(){
      System.out.println("numero de depa");
      int owo=scanner.nextInt();
       System.out.println("Nombre Del Departamento");
       String uwu=scanner.next();
      lisNombreDepar.add(uwu);
      numero.add(owo);
     }
    
     public void mostrarDepartamento(){
      
            for (int i=1; i<lisNombreDepar.size();i++){
                if(lisNombreDepar != null){
               
                    System.out.println("NOMBRES ="+ lisNombreDepar );
                   
                }
            }
            System.out.println("");
            for(String transaccion : lisNombreDepar){
                if(transaccion != null){
                   
                }   
            } 
        }
    
     public void cabecera(){
       System.out.println("La cabecera Del Departamento");
       String uwu=scanner.next();
      cantidadLis.add(uwu);
     }

     public void cantidad(){
       System.out.println("La cantidad de municipio");
       String uwu=scanner.next();
      cantidadLis.add(uwu);
     }
     public void mostrarCantidad(){
      
            for (int i=1; i<cantidadLis.size();i++){
                if(cantidadLis != null){
               
                    System.out.println("MUNICIPIOS ="+ cantidadLis );
                   
                }
            }
            System.out.println("");
            for(String transaccion : cantidadLis){
                if(transaccion != null){
                   
                }   
            } 
        }
       public void mostrarcabecera(){
      
            for (int i=1; i<cabecera.size();i++){
                if(cabecera != null){
               
                    System.out.println("CEBECERA ="+ cabecera );
                   
                }
            }
            System.out.println("");
            for(String transaccion : cabecera){
                if(transaccion != null){
                   
                }   
            } 
        }
     
     
}
