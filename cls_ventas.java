public class cls_ventas {

    private int codigo_int;
    private int cantidad_int;
    private String fecha_str;
    
    public cls_ventas(int codigo_int, int cantidad_int, String fecha_str) {
        this.codigo_int = codigo_int;
        this.cantidad_int = cantidad_int;
        this.fecha_str = fecha_str;
    }

    public int getCodigo_int() {
        return codigo_int;
    }

    public void setCodigo_int(int codigo_int) {
        this.codigo_int = codigo_int;
    }

    public int getCantidad_int() {
        return cantidad_int;
    }

    public void setCantidad_int(int cantidad_int) {
        this.cantidad_int = cantidad_int;
    }

    public String getFecha_str() {
        return fecha_str;
    }

    public void setFecha_str(String fecha_str) {
        this.fecha_str = fecha_str;
    }

    
}
