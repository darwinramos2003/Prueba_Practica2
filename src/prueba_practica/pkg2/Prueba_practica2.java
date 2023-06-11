/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_practica.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Yaqui
 */
public class Prueba_practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             int salir = 1;
        ArrayList<String> Figuras = new ArrayList();
        while (salir == 1) {

            Scanner entrada = new Scanner(System.in);
            System.out.println("----MENU----");
            System.out.println("Selecciona la figura");
            System.out.println("1. Triangulo");
            System.out.println("2)Rectangulo");
            System.out.println("3)Cuadrado");
            System.out.println("4)Salir");
            int opt = entrada.nextInt();

            switch (opt) {
                case 1: {

                    System.out.println("Calculando el area....");
                    System.out.println("Ingrese la altura: ");
                    double alto = entrada.nextDouble();
                    System.out.println("Ingrese el largo: ");
                    double largo = entrada.nextDouble();

                    Figura datos = new Figura(largo, 0, alto);

                    System.out.println("El area es: " + datos.area(largo, 0, alto, opt));

                    System.out.println("Calculando volumen (Piramide)....");

                    System.out.println("El volumen es: " + datos.volumen(largo, 0, alto, opt));

                    Figuras.add(opt + " Triangulo ;" + "Area: " + datos.area(largo, alto, alto, opt) + " Volumen: " + datos.volumen(largo, alto, alto, opt));
                    break;

                }
                case 2: {

                    System.out.println("Calculando el area....");
                    System.out.println("Ingrese la altura: ");
                    double alto = entrada.nextDouble();
                    System.out.println("Ingrese el largo: ");
                    double largo = entrada.nextDouble();

                    Figura datos = new Figura(largo, 0, alto);

                    System.out.println("El area es: " + datos.area(largo, alto, alto, opt));
                    System.out.println("Calculando volumen (Prisma Rectangular)....");
                    System.out.println("Ingrese el ancho del prisma: ");
                    double ancho = entrada.nextDouble();

                    System.out.println("El volumen es: " + datos.volumen(largo, ancho, alto, opt));
                    Figuras.add(opt + " Rectangulo; Area: " + datos.area(largo, ancho, alto, opt) + " Volumen: " + datos.volumen(largo, ancho, alto, opt));

                    break;
                }
                case 3: {

                    System.out.println("Calculando el area....");
                    System.out.println("Ingrese el largo: ");
                    double largo = entrada.nextDouble();

                    Figura datos = new Figura(largo, 0, largo);

                    System.out.println("El area es: " + datos.area(largo, largo, largo, opt));
                    System.out.println("Calculando volumen (Cubo)....");
                    System.out.println("Ingrese el ancho: ");
                    double ancho = entrada.nextDouble();
                    System.out.println("El volumen es: " + datos.volumen(largo, ancho, largo, opt));

                    Figuras.add(opt + " Cuadrado; Area: " + datos.area(largo, ancho, ancho, opt) + " Volumen: " + datos.volumen(largo, ancho, largo, opt));
                    break;
                }
                case 4: {
                    System.out.println("Lista de figuras calculadas: ");
                    listarFiguras(Figuras);
                    System.out.println("Saliendo.....");
                    salir++;
                    break;
                }
                default: {
                    System.out.println("Opcion no valida");
                    break;
                }
            }
        }

    }

    public static void listarFiguras(ArrayList Figuras) {
        for (int i = 0; i < Figuras.size(); i++) {
            System.out.println(Figuras.get(i));
        }
    }
    }
    

