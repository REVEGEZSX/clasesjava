package carromin;
import java.util.*;
public class Carromin 
{
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) 
    {
        String placa, marca, color;
        int kilometraje, modelo;
        carro c1;
        System.out.println("ingrese la placa");
        placa = leer.next();
        System.out.println("ingrese la marca");
        marca = leer.next(); 
        System.out.println("ingrese el color");
        color = leer.next();
        System.out.println("ingrese el kilometraje");
        kilometraje = leer.nextInt(); 
        System.out.println("ingrese el modelo");
        modelo = leer.nextInt();
        c1 = new carro(placa,marca,color,kilometraje,modelo);
        System.out.println(c1.mostrar());
      
        System.out.println("ingrese nuevo kilometraje");
        kilometraje = leer.nextInt();
        System.out.println(c1.mostrar());
    } 
}
