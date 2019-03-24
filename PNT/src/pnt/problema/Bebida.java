package pnt.problema;

/**
 *
 * @author cs_jo
 */

class Bebida extends Producto {

    private double contenido;

    public Bebida(String marca, double contenido, double precio) {

        super(marca, precio);
        this.contenido = contenido;
    }

    @Override
    public double getContenido() {
        return contenido;
    }

    public void setContenido(double _contenido) {
        this.contenido = _contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getMarca() + " /// " + "Litros: " + this.contenido + " /// " + "Precio: $" + super.getPrecio();
    }

    @Override
    public String getUnidad() {
        return "Litro";
    }
}