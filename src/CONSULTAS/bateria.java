package CONSULTAS;
import java.util.Scanner;

public class bateria {
    //Atributos
    protected String marca [] = {"Nokia","Samsung","Motorola","LG"};
    protected String modelo [] = {"b234","a355","c430","a234"};
    protected String voltaje [] = {"3000ma","4000ma","7000ma","3500ma"};
    protected String duracion [] = {"5hs","9hs","7hs","12hs"};
    protected int opc, opcel, opjoy, optabl;
    
    Scanner teclado = new Scanner(System.in);
    
    //Metodo mostrar datos de baterìa
    public void mostrar(){
        System.out.println("\nMARCA | MODELO | VOLTAJE | DURACION");
        for(int i=0; i<marca.length ; i++){
            System.out.println(marca[i]+" | "+modelo[i]+" | "+voltaje[i]+" | "+duracion[i]);
        }
    }
    //Metodo entrada datos
    public void Entradatos(){
        System.out.print("\n=== BIENVENIDO ===");
        System.out.print("\nPor favor, elija una opcion:");
        System.out.print("\n(1)CELULARES");
        System.out.print("\n(2)JOYSTICKS");
        System.out.print("\n(3)TABLETS\n");
        opc = teclado.nextInt();
            if (opc>3 || opc<1){
               System.out.print("=== OPCION INVALIDA ===");
               System.exit(0);
            }
        }
    //Metodo opc celular
    public void opcelular() {
        opcel = teclado.nextInt();
            if (opcel>8 || opcel<1){
               System.out.print("\n=== OPCION INVÀLIDA ===\n");
               System.exit(0);
            }
        
    }
    //Metodo opc joystick
    public void opjoystick() {
        opjoy = teclado.nextInt();
            if (opjoy>7 || opjoy<1){
               System.out.print("\n=== OPCION INVÀLIDA ===\n");
               System.exit(0);
            }
        
    }
    //Metodo opc tablets
    public void optablets() {
        optabl = teclado.nextInt();
            if (optabl>8 || optabl<1){
               System.out.print("\n=== OPCION INVÀLIDA ===\n");
               System.exit(0);
            }
        
    }
}
