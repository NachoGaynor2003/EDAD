/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Ignacio Gaynor
 */
public class punto5
        
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona nuevo= new Persona();
        Scanner leer = new Scanner(System.in);
        LocalDate fechaUsuario;
        System.out.println("INGRESE LA FECHA EN LA QUE NACIO");
        System.out.println("EN EL SIGUIENTE ORDEN");
        System.out.println("DIA-MES-AÑO");
        String fecha;
        fecha=leer.nextLine();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        fechaUsuario= LocalDate.parse(fecha, formato);
        nuevo.setFechaUsuario(fechaUsuario);
        System.out.println("La edad es:"+ nuevo.calcularEdad().getYears());
        
        
        
        
    }
    
}
