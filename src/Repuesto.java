public class Repuesto {

    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;

    public Repuesto(int codigo, String nombre,
                    String descripcion, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Repuesto: " + nombre +
               "\nCódigo: " + codigo +
               "\nDescripción: " + descripcion +
               "\nPrecio: Q" + precio;
    }
}