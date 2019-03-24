package pnt.problema;

/**
 *
 * @author cs_jo
 */

public abstract class Producto implements Comparable<Producto> {

    private String marca;
    private double precio;

    public Producto(String marca, double precio) {

        this.marca = marca;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double _precio) {
        this.precio = _precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String _marca) {
        this.marca = _marca;
    }

    public abstract double getContenido();

    public abstract String getUnidad();

    @Override
    public abstract String toString();
            
    @Override
    public int compareTo(Producto producto) {
        
        int resultado = 0;

        if (this.precio > producto.getPrecio()) {            
            resultado = -1;
            
        } else if (this.precio < producto.getPrecio()) {            
            resultado = 1;
            
        } else {            
            resultado = 0;
        }

        return resultado;
    }
}