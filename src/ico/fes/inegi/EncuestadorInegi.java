/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.inegi;

import ico.fes.dispositivos.SmartPhone;

/**
 *
 * @author YUGEN
 */
public class EncuestadorInegi {
    private String nombre;
    private SmartPhone dispositivo;

    public EncuestadorInegi() {
    }

    public EncuestadorInegi(String nombre, SmartPhone dispositivo) {
        this.nombre = nombre;
        this.dispositivo = dispositivo;
    }

    public void setDispositivo(SmartPhone cel2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
