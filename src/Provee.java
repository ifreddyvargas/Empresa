import java.util.Date;

public class Provee {
    Date fecha;
    int cantidad;
    Productos destino;
    Proveedores Origen;

    public Provee(Date fecha, int cantidad, Productos destino, Proveedores origen) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.destino = destino;
        Origen = origen;
    }
}
