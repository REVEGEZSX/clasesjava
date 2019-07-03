package inventariocomputadores;

public class computador 
{

    private String marca;
    private String modelo;
    private String procesador;
    private String board;
    private double ram,hdd;

    public computador(String marca,String modelo,String procesador,String board,double ram,double hdd){
        this.marca = marca;
        this.modelo= modelo;
        this.procesador = procesador;
        this.board= board;
        this.ram=ram;
        this.hdd= hdd;
    }
    public String mostrar(){
        String resultado ="";
        resultado = marca + "" + modelo + "" + procesador + "" + board + "" + Double.toString(ram) + "gb" + Double.toString(hdd);
        return resultado;
    }
    public void setProcesador(String Procesador){
    procesador = Procesador;
    System.out.println("Cambio de procesador realizado");
    }
    public void setRam(double ram){
    this.ram= ram;
    System.out.println("Cambio de RAM realizado");
    }
    public void setHDD(double hdd){
    this.hdd = hdd;
    System.out.println("Cambio de HDD realizado");
    }
}
