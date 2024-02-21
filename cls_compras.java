public class cls_compras {
    private int codigo_int;
    private int cantidad_int;
    private String fecha_str;
    private float precio_compra_flt;
    
    public cls_compras(int codigo_int, int cantidad_int, String fecha_str, float precio_compra_flt) {
        this.codigo_int = codigo_int;
        this.cantidad_int = cantidad_int;
        this.fecha_str = fecha_str;
        this.precio_compra_flt = precio_compra_flt;
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

    public float getPrecio_compra_flt() {
        return precio_compra_flt;
    }

    public void setPrecio_compra_flt(float precio_compra_flt) {
        this.precio_compra_flt = precio_compra_flt;
    }

    
}
