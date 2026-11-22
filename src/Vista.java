
import javax.swing.JOptionPane;

public class Vista {

    private int opcionSeleccionada;

    public void mostrarMenu() {

        String[] opciones = {
            "Registrar sucursal",
            "Registrar empleado",
            "Registrar orden de reparación",
            "Registrar repuesto",
            "Consultar sucursales",
            "Salir"
        };

        opcionSeleccionada = JOptionPane.showOptionDialog(
            null,
            "Bienvenido al sistema de Segunda Vida.\nSeleccione una opción:",
            "Segunda Vida",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );

        if (opcionSeleccionada == -1) {
            opcionSeleccionada = 6;
        } else {
            opcionSeleccionada++;
        }
    }

    public int leerOpcion() {
        return opcionSeleccionada;
    }

    public int leerEntero() {

        while (true) {
            try {
                String dato = JOptionPane.showInputDialog(
                    null,
                    "Ingrese un número entero:",
                    "Segunda Vida",
                    JOptionPane.QUESTION_MESSAGE
                );

                if (dato == null) {
                    return -1;
                }

                return Integer.parseInt(dato);

            } catch (NumberFormatException e) {
                mostrarError("Debe ingresar un número válido.");
            }
        }
    }

    public double leerDouble() {

        while (true) {
            try {
                String dato = JOptionPane.showInputDialog(
                    null,
                    "Ingrese una cantidad:",
                    "Segunda Vida",
                    JOptionPane.QUESTION_MESSAGE
                );

                if (dato == null) {
                    return -1;
                }

                return Double.parseDouble(dato);

            } catch (NumberFormatException e) {
                mostrarError("Debe ingresar una cantidad válida.");
            }
        }
    }

    public String leerTexto(String mensaje) {

        String dato = JOptionPane.showInputDialog(
            null,
            mensaje,
            "Segunda Vida",
            JOptionPane.QUESTION_MESSAGE
        );

        if (dato == null) {
            return "";
        }

        return dato;
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(
            null,
            mensaje,
            "Segunda Vida",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(
            null,
            mensaje,
            "Segunda Vida",
            JOptionPane.ERROR_MESSAGE
        );
    }
}
