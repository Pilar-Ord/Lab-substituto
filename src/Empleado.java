public class Empleado {

    private int codigo;
    private String nombre;
    private String puesto;
    private String telefono;
    private int codigoSucursal;

    public Empleado(int codigo, String nombre, String puesto,
                    String telefono, int codigoSucursal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.puesto = puesto;
        this.telefono = telefono;
        this.codigoSucursal = codigoSucursal;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCodigoSucursal(int codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre +
               "\nCódigo: " + codigo +
               "\nPuesto: " + puesto +
               "\nTeléfono: " + telefono +
               "\nSucursal: " + codigoSucursal;
    }
}