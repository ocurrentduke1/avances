
package pub;


public class Cerveza {
   
    private String nombre;
    private String marca;
    private int cantidad;
    private int tamano;
    private float alchol;
    public Cerveza next;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void setAlchol(float alchol) {
        this.alchol = alchol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getTamano() {
        return tamano;
    }

    public float getAlchol() {
        return alchol;
    }

    public Cerveza getNext() {
        return next;
    }

    public void setNext(Cerveza next) {
        this.next = next;
    }
    
    

    public Cerveza() {
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad = cantidad;
        this.tamano = tamano;
        this.alchol = alchol;
        this.next = next;
    }
    
    
}
