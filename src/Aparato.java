public class Aparato {

    private int codigo;
    private String tipo;
    private String marca;
    private String modelo;
    private String descripcionProblema;

    public Aparato(int codigo, String tipo, String marca,
                   String modelo, String descripcionProblema) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcionProblema = descripcionProblema;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDescripcionProblema() {
        return descripcionProblema;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }

    @Override
    public String toString() {
        return "Aparato: " + tipo +
               "\nCódigo: " + codigo +
               "\nMarca: " + marca +
               "\nModelo: " + modelo +
               "\nProblema: " + descripcionProblema;
    }
}