/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadclone;

/**
 *
 * @author Usuario
 */
public class ActividadClone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Celulares");
        
        Huawei objeto = new Huawei();
        objeto.setColor("blanco");
        System.out.println(objeto.getColor());
        objeto.setSerial("52656565");
        System.out.println(objeto.getSerial());
        
       System.out.println("Dayana cuesta zamora");
        Memoria objeto3 = new Memoria();
        objeto3.setMarca("SanDisk");
        System.out.println(objeto3.getMarca());
    }
    
}
