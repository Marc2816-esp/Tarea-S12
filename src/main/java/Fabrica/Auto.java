/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabrica;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Auto extends Caracteristicas {
    private int anio;
    private int kilometraje;
    private String color;


public Auto(){

}

    public Auto(int anio, int kilometraje, String color) {
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

public void  imprimirDatos(){
JOptionPane.showMessageDialog(null,"La marca es: "+getMarca()
+"\n El modelo es: "+getModelo()
+"\n El año es: "+anio
+"\n El kilometraje es: "+kilometraje+ " KM"
+"\n El color es: "+color);
}


 public static void main(String[] args){

  Auto carro= new Auto();
  int limite,i;
  limite= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad autos: "));

for (i=1; i<=limite; i++){
  carro.setMarca(JOptionPane.showInputDialog("Ingrese la marca del auto: "));
  carro.setKilometraje(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje del auto: ")));
  carro.setModelo(JOptionPane.showInputDialog("Ingrese el modelo del auto: "));
  carro.setColor(JOptionPane.showInputDialog("Ingrese el color del auto: "));
  carro.setAnio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del auto: ")));
  carro.imprimirDatos();
}
}
}
