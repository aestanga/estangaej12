/*
Realizar un programa en  el cual exista una clase padre llamada batería y 3 clases hijas
(celulares,tablet y joystick  ) con atributos de cada clase.
Crear una clase principal MAIN que consulte a la clases celulares, tablet y joystick
teniendo en cuenta la duración de la batería especificada en la clase padre.

Clase bateria :
Atributos: Marca/Nombre/Voltaje S /Duración
Datos: 
b234   nokia      3000ma  5hs
b121  motorola 4000ma  9hs
q1232 LG          7000ma  12hs
ect...

Nota:  no necesasariamente la marca de la bateria debe ser igual a la marca del celular
 */
package MAIN;
import CONSULTAS.celulares;
import CONSULTAS.joystick;
import CONSULTAS.tablets;
import CONSULTAS.mostrardatos;

public class Estangaej12 {

    public static void main(String[] args) {
        String modbat="";
                
        celulares consul1 = new celulares();
        joystick consul2 = new joystick();
        tablets consul3 = new tablets();
        mostrardatos consul4 = new mostrardatos();
        
        consul1.Entradatos();
        
        if (consul1.getopc() ==1){
            consul1.mostrararray();
            consul1.opcelular();
            consul1.setmodbat();
            modbat = consul1.getmodbat();
            consul1.mostrarcel();
            consul4.setmodbat(modbat);
            consul4.mostrardat();
        }
        if (consul1.getopc() ==2){
            consul2.mostrararray();
            consul2.opjoystick();
            consul2.setmodbat();
            modbat = consul2.getmodbat();
            consul2.mostrarjoy();
            consul4.setmodbat(modbat);
            consul4.mostrardat();
        }
        if (consul1.getopc() ==3){
            consul3.mostrararray();
            consul3.optablets();
            consul3.setmodbat();
            modbat = consul3.getmodbat();
            consul3.mostrartab();
            consul4.setmodbat(modbat);
            consul4.mostrardat();
        }
    }
    
}
