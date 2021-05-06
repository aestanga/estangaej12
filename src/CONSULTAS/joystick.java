package CONSULTAS;

public class joystick extends bateria {
    //Atributos
    private String modbat, modjoy;
    private String joystick [] = {"","Stratus XL","Nacon Revolution Pro","Razer Wolverine Ultimate","GameSir G4s","KROM Kaiser","Microsoft Xbox One Gamepad","Sony Dualshock 4 V2"};
    private String batjoy [] = {"","c430","c430","c430","b234","b234","b234","b234"};
    //Metodo get
    public int getopc(){
        return opc;
    }
    //Metodo mostrar
    public void mostrararray() {
         System.out.print("\n=== JOYSTICKS ===\n");
         System.out.print("Por favor, elija una opcion:\n");
         for(int i=1; i<joystick.length ; i++){
            System.out.println("("+i+") "+joystick[i]);
         }
    }
    //Metodo mostrar celular elegido
    public void mostrarjoy() {
         System.out.print("\nJoystick seleccionada: "+modjoy+"\n");
    }
    //Metodos set y get
    public void setmodbat(){
           for(int i=0; i<batjoy.length ; i++){
            if (opjoy == i){
                modbat = batjoy[i];
                modjoy = joystick[i];
            }
           }           
    }    
    public String getmodbat(){
           return modbat;
    }
}
