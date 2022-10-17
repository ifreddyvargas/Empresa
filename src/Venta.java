import java.util.Date;

public class Venta {
    Date fecha;
    Cliente destino;
    Impresoras Origen;

    public Venta(Date fecha, Cliente destino, Impresoras origen) {
        this.fecha = fecha;
        this.destino = destino;
        Origen = origen;
    }
}
