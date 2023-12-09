
package Parcial;


public class cls_beneficiarios {
    private String str_nombre;
    private String str_id;
    private int int_puntaje;
    private String str_estado;

    public cls_beneficiarios(String str_nombre, String str_id, int int_puntaje, String str_estado) {
        this.str_nombre = str_nombre;
        this.str_id = str_id;
        this.int_puntaje = int_puntaje;
        this.str_estado = str_estado;
    }

    public String getStr_nombre() {
        return str_nombre;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public String getStr_id() {
        return str_id;
    }

    public void setStr_id(String str_id) {
        this.str_id = str_id;
    }

    public int getInt_puntaje() {
        return int_puntaje;
    }

    public void setInt_puntaje(int int_puntaje) {
        this.int_puntaje = int_puntaje;
    }

    public String getStr_estado() {
        return str_estado;
    }

    public void setStr_estado(String str_estado) {
        this.str_estado = str_estado;
    }

}
