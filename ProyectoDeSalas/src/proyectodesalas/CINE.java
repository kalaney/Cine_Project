

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectodesalas;

import javax.swing.JOptionPane;

/**
 *
 * @author Kalaney
 */
public class CINE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Pelicula peli= new Pelicula();
      Asiento asiento=new Asiento();
     
      int repeticion=0;
   
        for (int i = 0; i < 100; i++) {
            
        
        String ask="---------------CINE---------------\n1-Administrador.\n2-Empleado.\n0-Salir.\nSeleccione una opcion (0-2)";
        int answer=Integer.parseInt(JOptionPane.showInputDialog(ask));
        if(answer==1){
            String duda="************ADMINISTRADOR***********\n1-Peliculas.\n2-Horas de las Salas\n0-Salir.\nSeleccione una opcion(0-2)\n";
            int configuracion=Integer.parseInt(JOptionPane.showInputDialog(duda));
            switch(configuracion){
             case 1:
                peli.cambiarPelicula();
                 break;
             case 2:
                 peli.horariosSala();
                 break;
             case 0:
                 break;
             default: 
                 JOptionPane.showMessageDialog(null, "Opcion invalida.\n");
                 System.out.println("Opcion invalida.");  
            }
        }else{
            if(answer==2){
                asiento.reservar();
                }
            }if(answer==0){
                i=i+100;
            }else{
                if(answer>2){
                    JOptionPane.showMessageDialog(null, "Opcion invalida.\n");
                    System.out.println("Opcion invalida.");
                }
            }
        }
    }
}
