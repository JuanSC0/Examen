import java.util.*;
public class Examen3{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int num, suma, elementos;
 float prom; 
System.out.print("Introduzca un número: ");
 num= sc.nextInt();

 suma= 0;
 elementos= 0;

 while(num>=0) 
 {
 suma+=num;
 elementos++;
 System.out.print("Introduzca otro número: ");
 num= sc.nextInt();
 }
 if (elementos == 0) 
 System.out.println("Imposible hacer la media");
 else
 {
 prom=suma/elementos;
 System.out.println("El promedio es de: " + prom);
 }
 }
}