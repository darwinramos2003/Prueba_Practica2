/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_practica.pkg2;

/**
 *
 * @author Yaqui
 */
class Figura {
     //atributos
    double largo;
    double ancho;
    double alto;

    //constructor
    public Figura(double largo, double ancho, double alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double area(double largo, double ancho, double alto, int opt) {
        double area = 0;
        if (opt == 1) {
            area = 0.5 * (alto * largo);
        } else if (opt == 2) {
            area = (alto * largo);
        } else if (opt == 3) {
            area = (largo * alto);
        }
        return area;

    }

    public double volumen(double largo, double ancho, double alto, int opt) {
        double volumen = 0;
        if (opt == 1) {
            volumen = ((largo * largo) * (alto)) / 3;
        } else if (opt == 2) {
            volumen = (alto * largo * ancho);
        } else if (opt == 3) {
            volumen = (largo * ancho) * alto;
        }

        return volumen;
    }

    @Override
    public String toString() {
        return "Figura{" + "largo=" + largo + ", ancho=" + ancho + ", alto=" + alto + '}';
    }

}

