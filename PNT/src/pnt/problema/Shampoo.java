package pnt.problema;

/**
 *
 * @author cs_jo
 */

class Shampoo extends Producto {

    private double contenido;

    public Shampoo(String marca, double contenido, double precio) {

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
        return "Nombre: " + super.getMarca() + " /// " + "Contenido: " + this.contenido + "ml" + " /// " + "Precio: $" + super.getPrecio();
    }

    @Override
    public String getUnidad() {
        return "Ml";
    }
}