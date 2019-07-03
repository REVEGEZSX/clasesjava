package inventariocomputadores;
import java.util.*;
public class Inventariocomputadores 
{
    
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) 
    {
        String marca, modelo, procesador, board; 
        double ram, hdd;
        computador pc1,pc2;
        System.out.println("Ingrese la marca");
        marca =leer.next();
        System.out.println("Ingrese el modelo");
        modelo =leer.next();
        System.out.println("Ingrese el procesador");
        procesador =leer.next();
        System.out.println("Ingrese la board");
        board = leer.next();
        System.out.println("Ingrese la  RAM");
        ram = leer.nextDouble();
        System.out.println("Ingrese la capacidad del hdd");
        hdd = leer.nextDouble();
        pc1 = new computador(marca,modelo,procesador,board,ram,hdd);
        System.out.println("");
    }   
}
