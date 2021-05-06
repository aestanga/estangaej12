package CONSULTAS;

public class tablets extends bateria {
    //Atributos
    private String modbat, modtab;
    private String tablets [] = {"","Tablet Fire HD 8","Huawei MediaPad T3 10","iPad Mini 5","Galaxy Tab A de 10","iPad Air","Galaxy Tab S6 Lite","Lenovo Tab M10","Huawei MediaPad T5"};
    private String battab [] = {"","a355","a355","a355","a234","a234","a234","a355","a355"};
    //Metodo get
    public int getopc(){
        return opc;
    }
    //Metodo mostrar
    public void mostrararray() {
         System.out.print("\n=== TABLETS ===\n");
         System.out.print("Por favor, elija una opcion:\n");
         for(int i=1; i<tablets.length ; i++){
            System.out.println("("+i+") "+tablets[i]);
         }
    }
    //Metodo mostrar celular elegido
    public void mostrartab() {
         System.out.print("\nTablet seleccionada: "+modtab+"\n");
    }
    //Metodos set y get
    public void setmodbat(){
           for(int i=0; i<battab.length ; i++){
            if (optabl == i){
                modbat = battab[i];
                modtab = tablets[i];
            }
           }           
    }    
    public String getmodbat(){
           return modbat;
    }
}
