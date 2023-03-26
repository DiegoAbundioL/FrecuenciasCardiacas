import javax.swing.JOptionPane;
public class PruebaFrecuenciasCardiacas {
    public static void main(String[]args){
        //c
        FrecuenciasCardiacas miCardio = new FrecuenciasCardiacas("Diego", "Abundio", "10", "19", 2003, 19, 168,189);
        
        System.out.println("Escribe tu nombre: ");
        miCardio.getNombre();
        miCardio.getApellido();
        miCardio.getEdad();
        miCardio.getDia();
        miCardio.getMes();
        miCardio.getAnio();
        miCardio.getFrecuenciaMax();
        miCardio.getFrecuenciaEsp();
        
         System.out.printf("Tu nombre es: "+miCardio.getNombre()+" "+miCardio.getApellido()+"Tu edad es: "+ miCardio.getEdad()+"Tu Frecuencia maxima es: "+ miCardio.getFrecuenciaMax()+ 
                "Tu Frecuencia esperada es: "+ miCardio.getFrecuenciaEsp());
         
         String nombre = JOptionPane.showInputDialog("Escribe tu nombre: ");
         miCardio.setNombre(nombre);
         
         String apellido = JOptionPane.showInputDialog("Escribe tu apellido: ");
         miCardio.setApellido(apellido);
         
         String dia = JOptionPane.showInputDialog("Escribe tu dia de nacimiento: ");
         miCardio.setDia(dia);
         
         String mes = JOptionPane.showInputDialog("Escribe tu mes de nacimiento: ");
         miCardio.setMes(mes);
         
         String anio = JOptionPane.showInputDialog("Escribe tu año de nacimiento: ");
         int ani = Integer.parseInt(anio);
         miCardio.setAnio(ani);
         
         miCardio.setEdad(ani);
         miCardio.setFrecuenciaMax(miCardio.getEdad());
         miCardio.setFrecuenciaEsp(miCardio.getFrecuenciaMax());
         
        JOptionPane.showInputDialog(null, "Tu nombre es: "+ miCardio.getNombre()+ " " + miCardio.getApellido()
+ "Tu edad es: " + miCardio.getEdad() + "Tu Frecuencia Maxima es: " +miCardio.getFrecuenciaMax() +
        "Tu frecuencia esperada es: " + miCardio.getFrecuenciaEsp());
    }
    
}