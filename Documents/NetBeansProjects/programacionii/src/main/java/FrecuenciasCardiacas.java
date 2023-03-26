import javax.swing.JOptionPane;

public class FrecuenciasCardiacas {
    private String nombre, apellido, mes, dia;
    private int anio, edad, FreMax, FreEsp;
    
     public FrecuenciasCardiacas(String n, String a, String m, String d, int y, int e, int FM, int FE){
         nombre = n;
         apellido = a;
         dia = d;
         mes = m;
         anio = y;
         edad = e;
         FreMax = FM;
         FreEsp = FE;
         
     }
     
     public void setNombre(String n){
         nombre = n;
     }
     
     public String getNombre(){
         return nombre;
     }
      public void setApellido(String a){
         apellido = a;
     }
     
     public String getApellido(){
         return apellido;
     }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int e) {
        edad = 2023-anio;
    }
     
     public void setFrecuenciaMax(int edad){
         FreMax = 220-edad;    
     
     }
     public int getFrecuenciaMax(){
         return FreMax;
     }
     public void setFrecuenciaEsp(int FE){
         FreEsp = FreMax*100/85;
     }
     public int getFrecuenciaEsp(){
         return FreEsp;
         
     }
}    

