import java.util.*;
public class Examen1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double nota;
System.out.println("Introduzca una nota entre 6 y 10: ");
nota = sc.nextDouble();

 if(nota==10)
System.out.println("El numero es: Diez");
else if (nota == 9)
System.out.println("El numero es: Nueve");
else if (nota == 8)
System.out.println("El numero es: Ocho");
else if (nota == 7)
System.out.println("El numero es: Siete");
else if(nota ==6)
System.out.println("El numero es: Seis");
else if(nota<=5)
System.out.println("Nota Incorrecta!!");
else if(nota>10)
System.out.println("Nota Incorrecta!!");
}
}