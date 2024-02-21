public class cls_productos {

    private int codigo_int;
    private String nombre_str;
    private int existencias_int;
    private float precio_venta_flt;
    private float ganancia_flt;

    public cls_productos(int codigo_int, String nombre_str, int existencias_int, float precio_venta_flt,
            float ganancia_flt) {
        this.codigo_int = codigo_int;
        this.nombre_str = nombre_str;
        this.existencias_int = existencias_int;
        this.precio_venta_flt = precio_venta_flt;
        this.ganancia_flt = ganancia_flt;
    }

    public int getCodigo_int() {
        return codigo_int;
    }
    public void setCodigo_int(int codigo_int) {
        this.codigo_int = codigo_int;
    }
    public String getNombre_str() {
        return nombre_str;
    }
    public void setNombre_str(String nombre_str) {
        this.nombre_str = nombre_str;
    }
    public int getExistencias_int() {
        return existencias_int;
    }
    public void setExistencias_int(int existencias_int) {
        this.existencias_int = existencias_int;
    }
    public float getPrecio_venta_flt() {
        return precio_venta_flt;
    }
    public void setPrecio_venta_flt(float precio_venta_flt) {
        this.precio_venta_flt = precio_venta_flt;
    }
    public float getGanancia_flt() {
        return ganancia_flt;
    }
    public void setGanancia_flt(float ganancia_flt) {
        this.ganancia_flt = ganancia_flt;
    }
    
}