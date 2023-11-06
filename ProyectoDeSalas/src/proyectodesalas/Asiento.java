/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodesalas;

import javax.swing.JOptionPane;

/**
 *
 * @author Kalaney
 */
public class Asiento {
    String sala[][];
    Pelicula peli=new Pelicula();
    
    public void reservar(){
        String duda="--------------CARTELERA--------------\n1-"+peli.nombre+"\n2-"+peli.nombre+"\n3-"+peli.nombre+"\n0-Salir.\nSeleccione una opcion(0-2)";
        int configuracion=Integer.parseInt(JOptionPane.showInputDialog(duda));
        switch(configuracion){
            case 1:
            String duda1="-------------TANDAS-------------\n1-"+peli.hora+"\n2-"+peli.hora+"\n3-"+peli.hora+"\n0-Salir";
            int seleccion= Integer.parseInt(JOptionPane.showInputDialog(duda1));
            if(seleccion==1){
                String pantalla="-------------ASIENTOS-------------\nPelicula:"+peli.nombre+"\nO: Ocupado\n\n  _____________PANTALLA\nA  L L L L L L\nB  L L L L L L\nC  L L L L L L\nD  L L L L L L\n    1 2 3 4 5 6\n";
                String fila=JOptionPane.showInputDialog(pantalla+"- Ingrese la fila:");
                int campo=Integer.parseInt(JOptionPane.showInputDialog(pantalla+"Ingrese el numero de asiento"));
                JOptionPane.showMessageDialog(null, "-------------BOLETO--------------\nPelicula:"+peli.nombre+"\n-Hora:"+peli.hora+"\n-Sala 1\n-Fila:"+fila+"\n-Asiento:"+campo);
            }else{
                if(seleccion==1){
                    String pantalla="-------------ASIENTOS-------------\nPelicula:"+peli.nombre+"\nO: Ocupado\n\n  _____________PANTALLA\nA  L L L L L L\nB  L L L L L L\nC  L L L L L L\nD  L L L L L L\n    1 2 3 4 5 6\n";
                    String fila=JOptionPane.showInputDialog(pantalla+"- Ingrese la fila:");
                    int campo=Integer.parseInt(JOptionPane.showInputDialog(pantalla+"Ingrese el numero de asiento"));
                    JOptionPane.showMessageDialog(null, "-------------BOLETO--------------\nPelicula:"+peli.nombre+"\n-Hora:"+peli.hora+"\n-Sala 2\n-Fila:"+fila+"\n-Asiento:"+campo);
                }
            }if(seleccion==1){
                String pantalla="-------------ASIENTOS-------------\nPelicula:"+peli.nombre+"\nO: Ocupado\n\n  _____________PANTALLA\nA  L L L L L L\nB  L L L L L L\nC  L L L L L L\nD  L L L L L L\n    1 2 3 4 5 6\n";
                String fila=JOptionPane.showInputDialog(pantalla+"- Ingrese la fila:");
                int campo=Integer.parseInt(JOptionPane.showInputDialog(pantalla+"Ingrese el numero de asiento"));
                JOptionPane.showMessageDialog(null, "-------------BOLETO--------------\nPelicula:"+peli.nombre+"\n-Hora:"+peli.hora+"\n-Sala 3\n-Fila:"+fila+"\n-Asiento:"+campo);
            }else{
                    if(seleccion==0){
                        break;
                    }
                }if(seleccion>2){
                    JOptionPane.showMessageDialog(null, "Opcion invalida.\n");
                    System.out.println("Opcion invalida.");
                }
            break;
            case 2:
                String duda2="-------------TANDAS-------------\n1-"+peli.hora+"\n2-"+peli.hora+"\n3-"+peli.hora+"\n0-Salir";
                int seleccion2= Integer.parseInt(JOptionPane.showInputDialog(duda2));
                if(seleccion2==1){
                    String pantalla="-------------ASIENTOS-------------\nPelicula:"+peli.nombre+"\nO: Ocupado\n\n  _____________PANTALLA\nA  L L L L L L\nB  L L L L L L\nC  L L L L L L\nD  L L L L L L\n    1 2 3 4 5 6\n";
                    String fila=JOptionPane.showInputDialog(pantalla+"- Ingrese la fila:");
                    int campo=Integer.parseInt(JOptionPane.showInputDialog(pantalla+"Ingrese el numero de asiento"));
                    JOptionPane.showMessageDialog(null, "-------------BOLETO--------------\nPelicula:"+peli.nombre+"\n-Hora:"+peli.hora+"\n-Sala 1\n-Fila:"+fila+"\n-Asiento:"+campo);
                }else{
                    if(seleccion2==2){
                        String pantalla="-------------ASIENTOS-------------\nPelicula:"+peli.nombre+"\nO: Ocupado\n\n  _____________PANTALLA\nA  L L L L L L\nB  L L L L L L\nC  L L L L L L\nD  L L L L L L\n    1 2 3 4 5 6\n";
                        String fila=JOptionPane.showInputDialog(pantalla+"- Ingrese la fila:");
                        int campo=Integer.parseInt(JOptionPane.showInputDialog(pantalla+"Ingrese el numero de asiento"));
                        JOptionPane.showMessageDialog(null, "-------------BOLETO--------------\nPelicula:"+peli.nombre+"\n-Hora:"+peli.hora+"\n-Sala 2\n-Fila:"+fila+"\n-Asiento:"+campo);
                    }
                }if(seleccion2==3){
                    String pantalla="-------------ASIENTOS-------------\nPelicula:"+peli.nombre+"\nO: Ocupado\n\n  _____________PANTALLA\nA  L L L L L L\nB  L L L L L L\nC  L L L L L L\nD  L L L L L L\n    1 2 3 4 5 6\n";
                    String fila=JOptionPane.showInputDialog(pantalla+"- Ingrese la fila:");
                    int campo=Integer.parseInt(JOptionPane.showInputDialog(pantalla+"Ingrese el numero de asiento"));
                    JOptionPane.showMessageDialog(null, "-------------BOLETO--------------\nPelicula:"+peli.nombre+"\n-Hora:"+peli.hora+"\n-Sala 3\n-Fila:"+fila+"\n-Asiento:"+campo);
                }else{
                    if(seleccion2==0){
                        break;
                    }
                }if(seleccion2>2){
                    JOptionPane.showMessageDialog(null, "Opcion invalida.\n");
                    System.out.println("Opcion invalida.");
                }
                break;
            case 3:
                String duda3="-------------TANDAS-------------\n1-"+peli.hora+"\n2-"+peli.hora+"\n3-"+peli.hora+"\n0-Salir";
                int seleccion3= Integer.parseInt(JOptionPane.showInputDialog(duda3));
                if(seleccion3==1){
                    String pantalla="-------------ASIENTOS-------------\nPelicula:"+peli.nombre+"\nO: Ocupado\n\n  _____________PANTALLA\nA  L L L L L L\nB  L L L L L L\nC  L L L L L L\nD  L L L L L L\n    1 2 3 4 5 6\n";
                    String fila=JOptionPane.showInputDialog(pantalla+"- Ingrese la fila:");
                    int campo=Integer.parseInt(JOptionPane.showInputDialog(pantalla+"Ingrese el numero de asiento"));
                    JOptionPane.showMessageDialog(null, "-------------BOLETO--------------\nPelicula:"+peli.nombre+"\n-Hora:"+peli.hora+"\n-Sala 1\n-Fila:"+fila+"\n-Asiento:"+campo);
                }else{
                    if(seleccion3==1){
                        String pantalla="-------------ASIENTOS-------------\nPelicula:"+peli.nombre+"\nO: Ocupado\n\n  _____________PANTALLA\nA  L L L L L L\nB  L L L L L L\nC  L L L L L L\nD  L L L L L L\n    1 2 3 4 5 6\n";
                        String fila=JOptionPane.showInputDialog(pantalla+"- Ingrese la fila:");
                        int campo=Integer.parseInt(JOptionPane.showInputDialog(pantalla+"Ingrese el numero de asiento"));
                        JOptionPane.showMessageDialog(null, "-------------BOLETO--------------\nPelicula:"+peli.nombre+"\n-Hora:"+peli.hora+"\n-Sala 2\n-Fila:"+fila+"\n-Asiento:"+campo);
                    }
                }if(seleccion3==1){
                    String pantalla="-------------ASIENTOS-------------\nPelicula:"+peli.nombre+"\nO: Ocupado\n\n  _____________PANTALLA\nA  L L L L L L\nB  L L L L L L\nC  L L L L L L\nD  L L L L L L\n    1 2 3 4 5 6\n";
                    String fila=JOptionPane.showInputDialog(pantalla+"- Ingrese la fila:");
                    int campo=Integer.parseInt(JOptionPane.showInputDialog(pantalla+"Ingrese el numero de asiento"));
                    JOptionPane.showMessageDialog(null, "-------------BOLETO--------------\nPelicula:"+peli.nombre+"\n-Hora:"+peli.hora+"\n-Sala 3\n-Fila:"+fila+"\n-Asiento:"+campo);
                }else{
                    if(seleccion3==0){
                        break;
                    }
                }if(seleccion3>2){
                    JOptionPane.showMessageDialog(null, "Opcion invalida.\n");
                    System.out.println("Opcion invalida.");
                }
                break;
            case 0:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida.\n");
                System.out.println("Opcion invalida.");
        }
       
    }
}
