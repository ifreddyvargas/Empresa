public class ServicioTecnico extends Cliente{
    public ServicioTecnico(String dni, int telefono, String domicilio) {
        super(dni, telefono, domicilio);
    }

    double totalFacturado;

    Impresoras origen;
    Cliente destino;

    public ServicioTecnico(String dni, int telefono, String domicilio, double totalFacturado, Impresoras origen, Cliente destino) {
        super(dni, telefono, domicilio);
        this.totalFacturado = totalFacturado;
        this.origen = origen;
        this.destino = destino;
    }
}
