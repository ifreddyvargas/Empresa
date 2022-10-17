import java.util.Date;

public class AltaTecnologia {
    String paisOrigin;
    Date fechaFabricacion;

    public AltaTecnologia(String paisOrigin, Date fechaFabricacion) {
        this.paisOrigin = paisOrigin;
        this.fechaFabricacion = fechaFabricacion;
    }

    public AltaTecnologia() {
    }

    public String getPaisOrigin() {
        return paisOrigin;
    }

    public void setPaisOrigin(String paisOrigin) {
        this.paisOrigin = paisOrigin;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    @Override
    public String toString() {
        return "AltaTecnologia{" +
                "paisOrigin='" + paisOrigin + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                '}';
    }
}
