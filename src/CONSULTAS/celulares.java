package CONSULTAS;

public class celulares extends bateria {
    //Atributos
    private String modbat, modcel;
    private String celulares [] = {"","Samsgung S10","Samsung A7","Moto G5","Nokia Z10","Moto G8","LG K51","LG K72","Samgung J7"};
    private String batcel [] = {"","b234","a355","c430","a234","c430","b234","b234","c430"};
    //Metodo get
    public int getopc(){
        return opc;
    }
    //Metodo mostrar
    public void mostrararray() {
         System.out.print("\n=== CELULARES ===\n");
         System.out.print("Por favor, elija una opcion:\n");
         for(int i=1; i<celulares.length ; i++){
            System.out.println("("+i+") "+celulares[i]);
         }
    }
    //Metodo mostrar celular elegido
    public void mostrarcel() {
         System.out.print("\nCelular seleccionado: "+modcel+"\n");
    }
    //Metodos set y get
    public void setmodbat(){
           for(int i=0; i<batcel.length ; i++){
            if (opcel == i){
                modbat = batcel[i];
                modcel = celulares[i];
            }
           }           
    }    
    public String getmodbat(){
           return modbat;
    }
}
