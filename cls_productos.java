public class cls_productos {

    private int codigo_int;
    private String nombre_str;
    private int existencias_int;
    private float precio_venta_flt;
    private float ganancia_flt;

    public cls_productos(int codigo_int, String nombre_str, float ganancia_flt) {
        this.codigo_int = codigo_int;
        this.nombre_str = nombre_str;
        this.existencias_int = 0;
        this.precio_venta_flt = 0;
        this.ganancia_flt = ganancia_flt;
    }

    public int getCodigo_int() {
        return codigo_int;
    }

    public String getNombre_str() {
        return nombre_str;
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