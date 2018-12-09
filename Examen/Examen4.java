import java.util.*;
public class Examen4{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
  int num,cubo;       
  System.out.print("Introduzca número: ");      
  num=sc.nextInt();
   while(num>=0){ 
    cubo=num*num*num; 
  System.out.println(num + " es igual a "+ cubo);   
  System.out.print("Introduzca otro número: ");      
      num=sc.nextInt();
        }  
       } 
}