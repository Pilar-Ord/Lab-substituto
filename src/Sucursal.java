import java.util.ArrayList;

public class Sucursal {

    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Empleado> empleados;
    private ArrayList<OrdenReparacion> ordenes;
    private ArrayList<ExistenciaRepuesto> existencias;

    public Sucursal(int codigo, String nombre,
                    String direccion, String telefono) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;

        empleados = new ArrayList<>();
        ordenes = new ArrayList<>();
        existencias = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<OrdenReparacion> getOrdenes() {
        return ordenes;
    }

    public ArrayList<ExistenciaRepuesto> getExistencias() {
        return existencias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarOrden(OrdenReparacion orden) {
        ordenes.add(orden);
    }

    public void agregarExistencia(ExistenciaRepuesto existencia) {
        existencias.add(existencia);
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
            System.out.println("----------------");
        }
    }

    public void mostrarOrdenes() {
        for (OrdenReparacion orden : ordenes) {
            System.out.println(orden);
            System.out.println("----------------");
        }
    }

    public void mostrarExistencias() {
        for (ExistenciaRepuesto existencia : existencias) {
            System.out.println(existencia);
            System.out.println("----------------");
        }
    }

    @Override
    public String toString() {
        return "Sucursal: " + nombre +
                "\nCódigo: " + codigo +
                "\nDirección: " + direccion +
                "\nTeléfono: " + telefono;
    }
}