public class ExistenciaRepuesto {

    private int codigo;
    private int cantidad;
    private Repuesto repuesto;
    private Sucursal sucursal;

    public ExistenciaRepuesto(int codigo, int cantidad,
                              Repuesto repuesto, Sucursal sucursal) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.repuesto = repuesto;
        this.sucursal = sucursal;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Repuesto getRepuesto() {
        return repuesto;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }
    }

    public void agregarCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public boolean retirarCantidad(int cantidad) {
        if (cantidad > 0 && cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Existencia: " + codigo +
                "\nRepuesto: " + repuesto.getNombre() +
                "\nCantidad disponible: " + cantidad;
    }
}