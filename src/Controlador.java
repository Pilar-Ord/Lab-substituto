import java.time.LocalDate;
import java.util.ArrayList;

public class Controlador {

    private ArrayList<Sucursal> sucursales;
    private Vista vista;

    public Controlador() {
        sucursales = new ArrayList<>();
        vista = new Vista();
    }

    public void iniciar() {

        int opcion = 0;

        while (opcion != 6) {

            vista.mostrarMenu();
            opcion = vista.leerOpcion();

            switch (opcion) {

                case 1:
                    registrarSucursal();
                    break;

                case 2:
                    registrarEmpleado();
                    break;

                case 3:
                    registrarOrden();
                    break;

                case 4:
                    registrarRepuesto();
                    break;

                case 5:
                    consultarSucursales();
                    break;

                case 6:
                    vista.mostrarMensaje(
                        "Gracias por utilizar Segunda Vida."
                    );
                    break;

                default:
                    vista.mostrarError("Opción no válida.");
                    break;
            }
        }
    }

    private void registrarSucursal() {

        int codigo = vista.leerEntero();

        String nombre = vista.leerTexto("Nombre de la sucursal: ");
        String direccion = vista.leerTexto("Dirección: ");
        String telefono = vista.leerTexto("Teléfono: ");

        Sucursal nueva = new Sucursal(
            codigo, nombre, direccion, telefono
        );

        sucursales.add(nueva);

        vista.mostrarMensaje("Sucursal registrada correctamente.");
    }

    private void registrarEmpleado() {

        Sucursal sucursal = buscarSucursal();

        if (sucursal == null) {
            return;
        }

        int codigo = vista.leerEntero();

        String nombre = vista.leerTexto("Nombre del empleado: ");
        String puesto = vista.leerTexto("Puesto: ");
        String telefono = vista.leerTexto("Teléfono: ");

        Empleado empleado = new Empleado(
            codigo, nombre, puesto, telefono,
            sucursal.getCodigo()
        );

        sucursal.agregarEmpleado(empleado);

        vista.mostrarMensaje("Empleado registrado correctamente.");
    }

    private void registrarOrden() {

        Sucursal sucursal = buscarSucursal();

        if (sucursal == null) {
            return;
        }

        vista.mostrarMensaje("\n--- Datos del cliente ---");

        int codigoCliente = vista.leerEntero();
        String nombre = vista.leerTexto("Nombre: ");
        String telefono = vista.leerTexto("Teléfono: ");
        String correo = vista.leerTexto("Correo: ");

        Cliente cliente = new Cliente(
            codigoCliente, nombre, telefono, correo
        );

        vista.mostrarMensaje("\n--- Datos del aparato ---");

        int codigoAparato = vista.leerEntero();
        String tipo = vista.leerTexto("Tipo de aparato: ");
        String marca = vista.leerTexto("Marca: ");
        String modelo = vista.leerTexto("Modelo: ");
        String problema = vista.leerTexto("Descripción del problema: ");

        Aparato aparato = new Aparato(
            codigoAparato, tipo, marca, modelo, problema
        );

        vista.mostrarMensaje("\n--- Datos de la reparación ---");

        int codigoOrden = vista.leerEntero();
        String descripcion = vista.leerTexto("Descripción: ");
        String estado = "Pendiente";
        double costo = vista.leerDouble();

        Empleado tecnico = null;

        if (!sucursal.getEmpleados().isEmpty()) {

            vista.mostrarMensaje("Empleados disponibles:");

            for (Empleado empleado : sucursal.getEmpleados()) {
                vista.mostrarMensaje(
                    empleado.getCodigo() + " - " + empleado.getNombre()
                );
            }

            int codigoTecnico = vista.leerEntero();

            for (Empleado empleado : sucursal.getEmpleados()) {
                if (empleado.getCodigo() == codigoTecnico) {
                    tecnico = empleado;
                    break;
                }
            }
        }

        OrdenReparacion orden = new OrdenReparacion(
            codigoOrden,
            LocalDate.now(),
            descripcion,
            estado,
            costo,
            cliente,
            aparato,
            tecnico,
            sucursal
        );

        sucursal.agregarOrden(orden);

        vista.mostrarMensaje("Orden registrada correctamente.");
    }

    private void registrarRepuesto() {

        Sucursal sucursal = buscarSucursal();

        if (sucursal == null) {
            return;
        }

        int codigo = vista.leerEntero();
        String nombre = vista.leerTexto("Nombre del repuesto: ");
        String descripcion = vista.leerTexto("Descripción: ");
        double precio = vista.leerDouble();

        Repuesto repuesto = new Repuesto(
            codigo, nombre, descripcion, precio
        );

        vista.mostrarMensaje("Cantidad disponible: ");
        int cantidad = vista.leerEntero();

        ExistenciaRepuesto existencia = new ExistenciaRepuesto(
            codigo, cantidad, repuesto, sucursal
        );

        sucursal.agregarExistencia(existencia);

        vista.mostrarMensaje("Repuesto registrado correctamente.");
    }

    private Sucursal buscarSucursal() {

        if (sucursales.isEmpty()) {
            vista.mostrarError("Primero debe registrar una sucursal.");
            return null;
        }

        vista.mostrarMensaje("\n--- Sucursales disponibles ---");

        for (Sucursal sucursal : sucursales) {
            vista.mostrarMensaje(
                sucursal.getCodigo() + " - " + sucursal.getNombre()
            );
        }

        int codigo = vista.leerEntero();

        for (Sucursal sucursal : sucursales) {
            if (sucursal.getCodigo() == codigo) {
                return sucursal;
            }
        }

        vista.mostrarError("No se encontró la sucursal.");
        return null;
    }

    private void consultarSucursales() {

        if (sucursales.isEmpty()) {
            vista.mostrarMensaje("No hay sucursales registradas.");
            return;
        }

        for (Sucursal sucursal : sucursales) {

            vista.mostrarMensaje("\n====================");
            vista.mostrarMensaje(sucursal.toString());

            vista.mostrarMensaje("\n--- Empleados ---");
            sucursal.mostrarEmpleados();

            vista.mostrarMensaje("\n--- Órdenes ---");
            sucursal.mostrarOrdenes();

            vista.mostrarMensaje("\n--- Repuestos ---");
            sucursal.mostrarExistencias();
        }
    }
}