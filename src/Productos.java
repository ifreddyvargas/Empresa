import java.util.Date;

public class Productos extends AltaTecnologia{
    public Productos(String paisOrigin, Date fechaFabricacion) {
        super(paisOrigin, fechaFabricacion);
    }

    String codigo;
    String modelo;

    public Productos(String codigo, String modelo) {
        this.codigo = codigo;
        this.modelo = modelo;
    }

    public Productos() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
