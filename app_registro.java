import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app_registro {
    static LinkedList<cls_productos> productos = new LinkedList<cls_productos>();
    public static void main(String[]args){
        fnt_menu(true);
    }

    private static void fnt_consultar(int codigo_int){
        boolean sw = false;
        int posicion = 0;
        for(int i = 0; i < productos.size(); i++){
            if (productos.get(i).getCodigo_int() == codigo_int) {
                posicion = i;
                sw = true;
            }
        }
        if (sw) {
            JOptionPane.showMessageDialog(null, "Nombre: " + productos.get(posicion).getNombre_str() + "\n" + "Existencias: " + productos.get(posicion).getExistencias_int() + "\n" + "Precio de venta: " + productos.get(posicion).getPrecio_venta_flt() + "\n" + "Ganancia: " + productos.get(posicion).getGanancia_flt(), "CONSULTAR",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Producto no encontrado.","CONSULTAR",JOptionPane.WARNING_MESSAGE);
        }
    }

    private static void fnt_registrar(){
        int codigo_int = Integer.valueOf(JOptionPane.showInputDialog(null, "Código")); 
        String nombre_str = JOptionPane.showInputDialog(null, "Nombre");
        Float ganancia_flt = Float.valueOf(JOptionPane.showInputDialog(null, "Ganancia")); 

        if (codigo_int != 0 && !nombre_str.equals("") && ganancia_flt != 0) {
            productos.add(new cls_productos(codigo_int, nombre_str, ganancia_flt));
            JOptionPane.showMessageDialog(null, "Producto registrado con éxito","Registro",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Debe diligenciar todos los datos","Registro",JOptionPane.WARNING_MESSAGE);
        }
    }

    private static void fnt_menu(boolean m){
        do{
            String menu = JOptionPane.showInputDialog(null,"MENU PRINCIPAL\n\n1. Nuevo producto\n2. Consultar producto\n3. Actualizar producto\n4. Salir");
            if (menu.equals("1")) {
               fnt_registrar();
            }
            if (menu.equals("2")) {
                int codigo_int = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese el código del producto")); 
                fnt_consultar(codigo_int);
            }
            if (menu.equals("3")) {
                m=false;
            }
            if (menu.equals("4")) {
                m=false;
            }

        }while(m);
    }
}
