package com.mycompany.luisquizz;
/**
 *
 * @author Luis
 */
public class Prestamos {
    public class Prestamo implements Comparable <Prestamo> {
    
    private int isbn;
    private String titulo;
    private String autor;
    private int year;
    
    public Prestamo () {}
    
    public Prestamo (int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
    }
    
    public int getISBN () {
        return this.isbn;
    }
    
    public int getYear () {
        return this.year;
    }
    
    public String getAutor () {
        return this.autor;
    }
    
    public String getTitulo () {
        return this.titulo;
    }
    
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor (String autor) {
        this.autor = autor;
    }
    
    public void setYear (int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Prestamo p1) {
        if ( this.getYear() < p1.getYear() ) {
            return 1;
        }
        else if ( this.getYear() > p1.getYear() ){
            return -1;
        }
        else {
            return 0;
        }
    }
    }
}