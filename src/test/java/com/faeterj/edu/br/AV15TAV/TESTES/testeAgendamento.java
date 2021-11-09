package com.faeterj.edu.br.AV15TAV.TESTES;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.faeterj.rio.edu.br.AV15tAV_Model.CAgendamento;
import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lucas
 */
public class testeAgendamento {
    
    @Test
    public void agendarConsultaOrtopedista() {
        LocalDate dataAgendamento = LocalDate.now();
        
        //Arrange
        CAgendamento agendarConsulta = new CAgendamento(dataAgendamento, "Ortopedista", "Gabriel Souza", "Madureira", "123456");
           
        //Act
        String resultado = agendarConsulta.AgendamentoConsulta();
        
        //Assert
        assertTrue(resultado=="CON123");
        
    }
    
    @Test
    public void agendarExameRaioX() 
    {
        LocalDate dataAgendamento = LocalDate.now();
        
        //Arrange
        CAgendamento agendarExame = new CAgendamento(dataAgendamento, "Madureira", "888888", "Raio-X");
           
        //Act
        String resultado = agendarExame.AgendamentoExame();
        
        //Assert
        assertTrue(resultado=="EXA555");
        
    }
    
    public void agendarInternação() 
    {
        LocalDate dataAgendamento = LocalDate.now();
        
        //Arrange
        CAgendamento agendarInternação = new CAgendamento(dataAgendamento, "Madureira", "888888", "Internação CTI", "Rodrigo Martins", "Paciente com Pneumonia e risco de morte");
           
        //Act
        String resultado = agendarInternação.AgendamentoInternação();
        
        //Assert
        assertTrue(resultado=="EXA555");
        
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
