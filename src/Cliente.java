public class Cliente {
    String dni;
    int telefono;
    String domicilio;

    public Cliente(String dni, int telefono, String domicilio) {
        this.dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", telefono=" + telefono +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }
}
