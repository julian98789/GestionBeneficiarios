
package Parcial;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.JOptionPane;



public class cls_funciones {
    boolean sw;
    int pos;
    String [] temporal = new String [5];
    List<cls_beneficiarios> lista = new LinkedList<>();
    Queue<cls_beneficiarios> cola = new LinkedList<>(); 
    
   
    
   public void fnt_Agregar (String nombre, String id, String puntaje, String estado) {
       if(nombre.equals("") || id.equals("") || puntaje.equals("") || estado.equals("")){
        
           JOptionPane.showMessageDialog(null, "Debe ingresar la información solicitada",
                   "ERROR",JOptionPane.ERROR_MESSAGE);
       }else{
        cls_beneficiarios beneficiario = new cls_beneficiarios(nombre, id, Integer.parseInt(puntaje), estado);
        lista.add(beneficiario);
        cola.add(beneficiario);
        
         JOptionPane.showMessageDialog(null, "Persona registrada con éxito",
                    "Registrar",JOptionPane.INFORMATION_MESSAGE);
       }
    }
   
   public void fnt_Consultar(String id) {
         pos = 0;
         sw = false;
         for(int i= 0; i<lista.size();i++){
           if(id.equals(lista.get(i).getStr_id())){
               sw = true;
               pos = i;
               break;
           }
       }
         if (sw == false){
           JOptionPane.showMessageDialog(null, "No se encontraron registros");
       }else{
           temporal[0] = lista.get(pos).getStr_id();
           temporal[1] = lista.get(pos).getStr_nombre();
           temporal[2] = "" + lista.get(pos).getInt_puntaje();
           temporal[3] = "" + lista.get(pos).getStr_estado();
           
            }
    }
   
   public void fnt_entrega() {
    if (!cola.isEmpty()) {
        cls_beneficiarios beneficiario = cola.poll();
        
        JOptionPane.showConfirmDialog(null, "Entrega realizada para: " + beneficiario.getStr_nombre());
        beneficiario.setStr_estado("SI");
    } else {
        JOptionPane.showConfirmDialog(null, "No hay beneficiarios en la cola de entrega.");
    }
}
   
    
}
