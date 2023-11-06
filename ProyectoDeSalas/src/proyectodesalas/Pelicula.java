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
public class Pelicula {

     String nombre[];
     String hora[];

     
//------------------------------------------------------------SET UP PARA CAMBIAR EL NOMBRE DE PELICULAS-----------------------------------------------------------------------------  

     
     public String incresePelicula1 () {
        this.nombre= new String[3];
        nombre[0]= JOptionPane.showInputDialog("************PELICULAS***********\nIngrese el nombre de la nueva pelicula 1: ");
        JOptionPane.showMessageDialog(null, "Nombre de la Nueva Pelicula 1: "+nombre[0]);
        System.out.println("Nombre de la Nueva Pelicula 1:"+nombre[0]);
        return nombre[0];
    
     }
       public String  incresePelicula2 () {
        this.nombre= new String[3];
        nombre[1]= JOptionPane.showInputDialog("************PELICULAS***********\nIngrese el nombre de la nueva pelicula 2: ");
        JOptionPane.showMessageDialog(null, "************PELICULAS***********\nNombre de la Nueva Pelicula 2: "+nombre[1]);
        System.out.println("************PELICULAS***********\nNombre de la Nueva Pelicula 2:"+nombre[1]);
        return nombre[1];
    
     }
         public String  incresePelicula3 () {
        this.nombre= new String[3];
        nombre[2]= JOptionPane.showInputDialog("************PELICULAS***********\nIngrese el nombre de la nueva pelicula 3: ");
        JOptionPane.showMessageDialog(null, "************PELICULAS***********\nNombre de la Nueva Pelicula 3: "+nombre[2]);
        System.out.println("************PELICULAS***********\nNombre de la Nueva Pelicula 3:"+nombre[2]);
        return nombre[2];
    
     }
    
//-----------------------------------------------------------------------SET UP PELICULAS AMINISTRADOR---------------------------------------------------------------------------

//    public Pelicula() {this.nombre= new String[3];
//         nombre[0]= JOptionPane.showInputDialog("Ingrese el nombre de la nueva pelicula: ");
//         JOptionPane.showMessageDialog(null, "Nombre de la Nueva Pelicula : "+nombre[i]);
//             System.out.println("Nombre de la Nueva Pelicula :"+nombre[i]);  
         
        
    
     public String[] cambiarPelicula(){
        this.nombre= new String[3];
        String pregunta="************PELICULAS***********\n1-Sala 1.\n2-Sala 2.\n3-Sala 3.\n0-Salir.\n-Seleccione una opcion para cambiar las Peliculas de las Salas (0-3)";
        int opcion=Integer.parseInt(JOptionPane.showInputDialog(pregunta)) ;
        switch (opcion){
          case 1:
              incresePelicula1 ();
              break;
          case 2:
              incresePelicula2 ();
              break;
          case 3:
              incresePelicula3 ();
              break;
          case 0:
              break;
          default:  
              JOptionPane.showMessageDialog(null, "Opcion invalida.\n");
              System.out.println("Opcion invalida.");  
        }
         return nombre;
     }
    

////--------------------------------------------------------------------------SET UP DEL Cartelera de la pelicula-----------------------------------------------------------------
    public String carteleraPelicula(){
        this.nombre= new String[3];
        int pelicula;
              String pregunta1="Catartelera:\nIngrese el numero de la pelicula que desea ver: \n1-"+ nombre[0] + "\n2-" + nombre[1] + "\n3-"+nombre[2]+"\n0-Salir.";
              int opcion0=Integer.parseInt(JOptionPane.showInputDialog(pregunta1));
              switch(opcion0){
                case 1:
                 JOptionPane.showMessageDialog(null, nombre[0]);
                 break;
                 
              case 2:
                  incresePelicula2();
                 break;
              case 3:
                  incresePelicula3();
                 break;
              case 0:
                  break;
              default:
                  JOptionPane.showMessageDialog(null, "Opcion invalida.\n");
                  System.out.println("Opcion invalida.");  
              }
         return nombre[0];
    }
//-----------------------------------------------------------------------------------Configuracion de Horas para las Salas de cada pelicula----------------------------------------------------------------------------------------------------
    public void horariosSala(){
        this.hora = new String[3];
        String custion="************ADMINISTRADOR***********\n1-Horario 1.\n2-Horaio 2.\n3-Horario 3.\n0-Salir.\n-Seleccione una opcion para cambiar los Horarios de la Salas (0-3)";
        int opcion=Integer.parseInt(JOptionPane.showInputDialog(custion));
        switch(opcion){
            case 1:
             String pregunta1=JOptionPane.showInputDialog("************HORARIO***********\nIngrese el Horario 1:");
             hora[0]=pregunta1;
             JOptionPane.showMessageDialog(null, "************HORARIO***********\nHorario 1 estableciodo para las:"+hora[0]);
             System.out.println("************HORARIO***********\nHorario 1 estableciodo para las: "+hora[0]);
                break;
            case 2:
             String pregunta2=JOptionPane.showInputDialog("************HORARIO***********\nIngrese el Horario 2:");
             hora[1]=pregunta2;
             JOptionPane.showMessageDialog(null, "************HORARIO***********\nHorario 2 estableciodo para las:"+hora[1]);
             System.out.println("************HORARIO***********\nHorario 2 estableciodo para las: "+hora[1]);
                break;
            case 3:
             String pregunta3=JOptionPane.showInputDialog("************HORARIO***********\nIngrese el Horario 3:");
             hora[2]=pregunta3;
             JOptionPane.showMessageDialog(null, "************HORARIO***********\nHorario 3 estableciodo para las:"+hora[2]);
             System.out.println("************HORARIO***********\nHorario 3 estableciodo para las: "+hora[2]);
                break;
            case 0:
                break;
            default:
             JOptionPane.showMessageDialog(null, "Opcion invalida.\n");
             System.out.println("Opcion invalida.");     
        }   
    }
//    public void horariosSala2(){
//         String custion="Seleccione un numero para cambiar los Horarios de la Sala 2:\n1-Horario 1.\n2-Horaio 2.\n3-Horario 3.\n0-Salir.";
//        int opcion=Integer.parseInt(JOptionPane.showInputDialog(custion));
//        switch(opcion){
//            case 1:
//             String pregunta1=JOptionPane.showInputDialog("Ingrese el Horario 1 para la Sala 2:");
//             String resultado1=pregunta1;
//             JOptionPane.showMessageDialog(null, "Horario 1 estableciodo para las:"+resultado1);
//             System.out.println("Horario 1 estableciodo para las: "+resultado1);
//                break;
//            case 2:
//             String pregunta2=JOptionPane.showInputDialog("Ingrese el Horario 2 para la Sala 2:");
//             String resultado2=pregunta2;
//             JOptionPane.showMessageDialog(null, "Horario 2 estableciodo para las:"+resultado2);
//             System.out.println("Horario 2 estableciodo para las: "+resultado2);
//                break;
//            case 3:
//             String pregunta3=JOptionPane.showInputDialog("Ingrese el Horario 3 para la Sala 2:");
//             String resultado3=pregunta3;
//             JOptionPane.showMessageDialog(null, "Horario 3 estableciodo para las:"+resultado3);
//             System.out.println("Horario 3 estableciodo para las: "+resultado3);
//                break;
//            case 0:
//                break;
//            default:
//             JOptionPane.showMessageDialog(null, "Opcion invalida.\n");
//             System.out.println("Opcion invalida.");     
//        }
//    }
//     String pregunta1;
//     String pregunta2;
//     String pregunta3;
//    public void horariosSala3(){
//        String custion="Seleccione un numero para cambiar los Horarios de la Sala 3:\n1-Horario 1.\n2-Horaio 2.\n3-Horario 3.\n0-Salir.";
//        int opcion=Integer.parseInt(JOptionPane.showInputDialog(custion));
//       
//        switch(opcion){
//            case 1:
//             String pregunta1=JOptionPane.showInputDialog("Ingrese el Horario 1 para la Sala 3:");
//             String resultado1=pregunta1;
//             JOptionPane.showMessageDialog(null, "Horario 3 estableciodo para las:"+resultado1);
//             System.out.println("Horario 1 estableciodo para las: "+resultado1);
//             
//                break;
//            case 2:
//             String pregunta2=JOptionPane.showInputDialog("Ingrese el Horario 2 para la Sala 3:");
//             String resultado2=pregunta2;
//             JOptionPane.showMessageDialog(null, "Horario 3 estableciodo para las:"+resultado2);
//             System.out.println("Horario 2 estableciodo para las: "+resultado2);
//                break;
//            case 3:
//             String pregunta3=JOptionPane.showInputDialog("Ingrese el Horario 3 para la Sala 3:");
//             String resultado3=pregunta3;
//             JOptionPane.showMessageDialog(null, "Horario 3 estableciodo para las:"+resultado3);
//             System.out.println("Horario 3 estableciodo para las: "+resultado3);
//                break;
//            case 0:
//                break;
//            default:
//             JOptionPane.showMessageDialog(null, "Opcion invalida.\n");
//             System.out.println("Opcion invalida."); 
//         
//        }
//     hora3="Los horarios para la Sala 3 son:\n1-"+pregunta1+"\n2-"+pregunta2+"\n3-"+pregunta3;
//    }
//------------------------------------------------------------------MENU PARA HORAS DE LAS PELICULAS CLIENTE---------------------------------------------------------------------
//     public void seleccionHorario(){
//        String pregunta="Seleccione un numero para cambiar los Horarios de las Salas:\n1-Sala 1.\n2-Sala 2.\n3-Sala 3.\n.\n0-Salir.";
//        int opcion=Integer.parseInt(JOptionPane.showInputDialog(pregunta)) ;
//        switch (opcion){
//          case 1:
//              horariosSala1 ();
//              break;
//          case 2:
//              horariosSala2 ();
//              break;
//          case 3:
//              horariosSala3 ();
//              break;
//          case 0:
//              break;
//          default:  
//              JOptionPane.showMessageDialog(null, "Opcion invalida.\n");
//              System.out.println("Opcion invalida.");  
//        }
//    }
//--------------------------------------------------------------------------ESPACIOS----------------------------------------------------------------------------------------------------------




} 

    
    




     