package pnt.problema;

/**
 *
 * @author cs_jo
 */

class Verdura extends Producto {

    private String unidad;

    public Verdura(String marca, double precio, String unidad) {

        super(marca, precio);
        this.unidad = unidad;
    }

    @Override
    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String _unidad) {
        this.unidad = _unidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getMarca() + " /// " + "Precio: $" + super.getPrecio() + " /// " + "Unidad de venta: " + this.unidad;
    }

    @Override
    public double getContenido() {
        return 0;
    }
}