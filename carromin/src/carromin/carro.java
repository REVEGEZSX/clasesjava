package carromin;

public class carro 
{
    private String placa, marca, color;
    private int modelo, kilometraje;
    public carro(String placa, String marca, String color, int modelo, int kilometraje)
    {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }
    public String mostrar()
    {
        String resultado =" ";
        resultado = placa + " " + marca + " " + color + " " + Integer.toString(modelo) + " " + Integer.toString(kilometraje);
        return resultado;
    }
    public void setKilometraje(int kilometraje)
    {
        this.kilometraje = kilometraje;
        System.out.println("Cambio de KILOMETRAJE realizado");
    }
}
