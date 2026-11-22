import java.time.LocalDate;

public class OrdenReparacion {

    private int codigo;
    private LocalDate fechaIngreso;
    private String descripcion;
    private String estado;
    private double costo;
    private Cliente cliente;
    private Aparato aparato;
    private Empleado tecnico;
    private Sucursal sucursal;

    public OrdenReparacion(int codigo, LocalDate fechaIngreso,
            String descripcion, String estado, double costo,
            Cliente cliente, Aparato aparato, Empleado tecnico,
            Sucursal sucursal) {

        this.codigo = codigo;
        this.fechaIngreso = fechaIngreso;
        this.descripcion = descripcion;
        this.estado = estado;
        this.costo = costo;
        this.cliente = cliente;
        this.aparato = aparato;
        this.tecnico = tecnico;
        this.sucursal = sucursal;
    }

    public int getCodigo() {
        return codigo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public double getCosto() {
        return costo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Aparato getAparato() {
        return aparato;
    }

    public Empleado getTecnico() {
        return tecnico;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setTecnico(Empleado tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "Orden de reparación: " + codigo +
                "\nFecha: " + fechaIngreso +
                "\nDescripción: " + descripcion +
                "\nEstado: " + estado +
                "\nCosto: Q" + costo +
                "\nCliente: " + cliente.getNombre() +
                "\nAparato: " + aparato.getTipo();
    }
}