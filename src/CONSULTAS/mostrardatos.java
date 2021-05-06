package CONSULTAS;

public class mostrardatos extends bateria {
    //Atributos
    private String modbat;
    
    //Metodos set y get
    public void setmodbat(String modbat){
                this.modbat = modbat;
    }    
    public String getmodbat(){
           return modbat;
    }
    
    //Metodo mostrar datos de baterìa
    public void mostrardat(){
        System.out.print("\n=== ESPECIFICACIONES DE LA BATERIA ===\n");
        for(int j=0; j<marca.length ; j++){
            if (modbat.equals(modelo[j])){
               System.out.println("MARCA: "+marca[j]);
               System.out.println("MODELO: "+modelo[j]);
               System.out.println("VOLTAJE: "+voltaje[j]);
               System.out.println("DURACION: "+duracion[j]);
            }
        }
    }
        
    
}
