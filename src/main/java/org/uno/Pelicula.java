package org.uno;

public class Pelicula implements Entregable {
    private String titulo;
    private int anio;
    private boolean entregado = false;
    private String genero = "no definido";
    private String director;

    public Pelicula() {
    }

    public Pelicula( String titulo, String director ) {
        this.titulo = titulo;
        this.director = director;
    }

    public Pelicula( String titulo, int anio, String genero, String director ) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo( String titulo ) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio( int anio ) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero( String genero ) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector( String director ) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", anio='" + anio + '\'' +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", director='" + director + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public int compareTo( Object o ) {
        return anio - ( ( Pelicula ) o ).anio;
    }
}
