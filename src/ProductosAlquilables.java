public class ProductosAlquilables extends Productos {
    public ProductosAlquilables(String codigo, String modelo) {
        super(codigo, modelo);
    }

    Double precioHora;

    public ProductosAlquilables(Double precioHora) {
        this.precioHora = precioHora;
    }

    public Double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(Double precioHora) {
        this.precioHora = precioHora;
    }

    @Override
    public String toString() {
        return "ProductosAlquilables{" +
                "precioHora=" + precioHora +
                '}';
    }
}
