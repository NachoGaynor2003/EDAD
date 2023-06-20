package punto5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ignacio Gaynor
 */
public class Persona{
       LocalDate fechaActual;
       LocalDate fechaUsuario;

    public Period calcularEdad() {
        fechaActual= LocalDate.now();
        Period a = Period.between(fechaUsuario, fechaActual);
        return a;
        
    }
    

    public LocalDate getFechaUsuario() {
        return fechaUsuario;
    }

    public void setFechaUsuario(LocalDate fechaUsuario) {
        this.fechaUsuario = fechaUsuario;
       
    }
}
