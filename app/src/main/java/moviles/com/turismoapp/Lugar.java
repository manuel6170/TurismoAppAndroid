package moviles.com.turismoapp;

public class Lugar {

    private String nombre;
    private int descripcion;
    private int thumbnail;
    private boolean favorito;

    public Lugar(){}

    public Lugar(String nombre, int descripcion, int thumbnail, boolean favorito) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.thumbnail = thumbnail;
        this.favorito = favorito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
}
