package com.faeterj.edu.br.AV15TAV.TESTES;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.faeterj.rio.edu.br.AV15tAV_Model.CAgendamento;
import com.faeterj.rio.edu.br.AV15tAV_Model.CMedico;
import java.time.LocalDate;
import java.time.Month;
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
        LocalDate dataAgendamento = LocalDate.of(2021, 11, 15);
        
        //Arrange
        CMedico medico = new CMedico("Marcos Ximenes", "ortopedia", "crm-45741");        
        CAgendamento agendarConsulta = new CAgendamento(dataAgendamento, medico.especialidade, medico.nome, "copacabana", "123456");
           
        //Act
        String resultado = agendarConsulta.AgendamentoConsulta();
        
        //Assert
        assertTrue(resultado!=null);
        
    }
    
    @Test
    public void agendarConsultaComCarteirinhaInvalida() {
        LocalDate dataAgendamento = LocalDate.of(2021, 11, 15);
        
        //Arrange
        CMedico medico = new CMedico("Renata Fernanda", "cardiologia", "crm-11284");        
        CAgendamento agendarConsulta = new CAgendamento(dataAgendamento, medico.especialidade, medico.nome, "Meier", "");
           
        //Act
        String resultado = agendarConsulta.AgendamentoConsulta();
        
        //Assert
        assertTrue(resultado!=null);
        
    }
    
    @Test
    public void agendarConsultaPediatra() {
        LocalDate dataAgendamento = LocalDate.of(2021, 9, 15);
        
        //Arrange
        CAgendamento agendarConsulta = new CAgendamento(dataAgendamento, "pediatria", "", "Madureira", "123456");
           
        //Act
        String resultado = agendarConsulta.AgendamentoConsulta();
        
        //Assert
        assertTrue(resultado!=null);
    }
    
    @Test
    public void agendarExameRaioXComDataAnteriorAtual() 
    {
        LocalDate dataAgendamento = LocalDate.of(2020, 05, 16);
        
        //Arrange
        CAgendamento agendarExame = new CAgendamento(dataAgendamento, "piedade", "32580", "Raio-X");
           
        //Act
        String resultado = agendarExame.AgendamentoExame();
        
        //Assert
        assertTrue(resultado!=null);
        
    }
    
    @Test
    public void agendarInternação() 
    {
        LocalDate dataAgendamento = LocalDate.of(2022, 05, 16);
        
        //Arrange
        CAgendamento agendarInternação = new CAgendamento("cascadura", dataAgendamento, "148752", "Internação CTI", "Paciente com Pneumonia apto para cirurgia");
        
        //Act
        String resultado = agendarInternação.AgendamentoInternação();
        
        //Assert
        assertTrue(resultado!=null);       
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
