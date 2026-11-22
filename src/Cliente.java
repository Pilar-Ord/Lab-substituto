public class Cliente {

    private int codigo;
    private String nombre;
    private String telefono;
    private String correo;

    public Cliente(int codigo, String nombre, String telefono, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre +
               "\nCódigo: " + codigo +
               "\nTeléfono: " + telefono +
               "\nCorreo: " + correo;
    }
}