
package VueloH;

public class cls_persona {
   private String str_nombre;
   private int int_edad;
   
   public cls_persona(String nombre, int edad){
       this.str_nombre = nombre;
       this.int_edad = edad;
   }
   
   //setter y getter

    public String getStr_nombre() {
        return str_nombre;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public int getInt_edad() {
        return int_edad;
    }

    public void setInt_edad(int int_edad) {
        this.int_edad = int_edad;
    }
   
}
