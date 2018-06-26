package ds6.dpc.fisc.utp.arus.BaseDatos;

public class formulario_data {
    private Integer id ;
    private String nombre;
    private String num_cliente;
    private String tipo;
    private String telefono;
    private String cantidad;
    private String direccion;

    public formulario_data(Integer id, String nombre, String num_cliente, String tipo, String telefono, String cantidad, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.num_cliente = num_cliente;
        this.tipo = tipo;
        this.telefono = telefono;
        this.cantidad = cantidad;
        this.direccion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(String num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
