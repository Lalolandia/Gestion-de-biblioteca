package com.mycompany.Main_Biblio;
/**
 *
 * Programa para gestionar una biblioteca virtual, con lista de libros, y prestamos de los mismos,
 * clasificacion por genero y mostrar los prestamos con nombre de cliente y numero.
 */
 //import Clases.Prestamos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_Biblio {

public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
		
	int menu=0;//OPCION DE MENÚ 
	long ISBN; //DATOS DE LIBRO
	String titulo = null, editorial, anno, datosLibro; //DATOS DE LIBRO
	ArrayList libros = new ArrayList(); //DATOS DE LIBRO
		
	do {
                    System.out.println("MENU:");
                    System.out.println("1. Agregar libro al Inventario.");
                    System.out.println("2. Eliminar libro del Inventario.");
                    System.out.println("3. Ver Inventario de Libros.");
                    System.out.println("4. Hacer prestamo de libro(s).");
                    System.out.println();
                    System.out.println("ELIJA EL NUMERO DE OPCION QUE DESEE REALIZAR.");
		
                    menu = obj.nextInt();

                    if (menu == 1 || menu == 2 || menu == 3 || menu == 4) {
                            if (menu == 1) {
                                    boolean repetir=true;
                                    String respuesta;
                                    do {
                                    System.out.println("OPCION 1: AGREGAR LIBRO AL INVENTARIO.");
                                    System.out.println("POR FAVOR AGREGUE LA INFORMACION QUE SE LE SOLICITA DEL LIBRO.");
                                    System.out.println();
                                    System.out.println("Titulo del libro.");
                                    titulo = obj.next();
                                    System.out.println("Codigo ISBN del libro.");
                                    ISBN = obj.nextInt();
                                    System.out.println("Editorial del libro.");
                                    editorial = obj.next();
                                    System.out.println("Año en que se publico el libro");
                                    anno = obj.next();
                                    datosLibro = "Titulo: " + titulo + ", ISBN: " + ISBN + ", Editorial: " + editorial + ", Anno: " + anno;
                                    System.out.println(datosLibro);
                                    libros.add(datosLibro);

                                    System.out.println("¿Desea agregar otro libro? Responda con 'si' o 'no' ");
                                    respuesta = obj.next();
                                    if (respuesta == "si" || respuesta == "Si" ) {
                                            repetir= true;
                                    }else if (respuesta == "no" || respuesta == "No") {
                                            repetir = false;
                                            break;
                                    }else {
                                        
                                    }
                                    }while(repetir==true);
                                    break;
                            }
                            else if (menu == 2) {
                                    System.out.println("OPCION 2: ELIMINAR LIBRO DEL INVENTARIO.");
                                    System.out.println("Lista de Libros");
                                    for(Integer libros : titulos){
                                    
                                    System.out.printf();
                                    }
                                    
                                    
                                    
                                    break;
                                    
                            }
                            else if(menu == 3) {
                                    System.out.println("OPCION 3: VER INVENTARIO DE LIBROS.");

                                    break;
                            }
                            else if (menu == 4) {
                                    System.out.println("OPCION 4: HACER PRESTAMO DE LIBRO(S)");

                                    break;
                            }
                    } 

                    else if (menu != 1 || menu != 2 || menu != 3 || menu != 4) {
                            System.out.println();
                            System.out.println("ERROR!! ELIJA UNA OPCION VALIDA.");
                            System.out.println();
                    }
                    }while (menu != 1 || menu != 2 || menu != 3 || menu != 4);

            }

    }
