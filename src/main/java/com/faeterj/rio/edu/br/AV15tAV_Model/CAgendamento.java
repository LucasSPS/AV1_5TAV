/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faeterj.rio.edu.br.AV15tAV_Model;

import java.time.LocalDate;

/**
 *
 * @author Lucas
 */
public class CAgendamento {
    public LocalDate dataAgendamento;
    public String servico;
    public boolean disponivel;
    public String especialidade;
    public String nomeMedico;
    public String codAgendamento;
    public String local;
    public String matriculaUsuario;
    public String procedimento;
    public String motivo; 
    LocalDate diaAtual = LocalDate.now();

    //Consulta
    public CAgendamento(LocalDate _dataAgendamento, String _especialidade, String _nomeMedico, String _local, String _matriculaUsuario) {
        dataAgendamento = _dataAgendamento;
        especialidade = _especialidade;
        nomeMedico = _nomeMedico;
        local = _local;
        matriculaUsuario = _matriculaUsuario;      
    }
    
    //Exame
    public CAgendamento(LocalDate _dataAgendamento, String _local, String _matriculaUsuario, String _procedimento) {
        dataAgendamento = _dataAgendamento;
        local = _local;
        matriculaUsuario = _matriculaUsuario;
        procedimento = _procedimento;     
    }
    
    //Internação
    public CAgendamento(String _local, LocalDate _dataAgendamento, String _matriculaUsuario, String _procedimento, String _motivo) {
        dataAgendamento = _dataAgendamento;
        local = _local;
        matriculaUsuario = _matriculaUsuario;
        procedimento = _procedimento;
        motivo = _motivo;       
    }
    
    public String AgendamentoConsulta () {
       LocalDate diaAtual = LocalDate.now();
        
        switch(especialidade.toLowerCase())
        {
            case "cardiologia":
                break;
            case "ortopedia":
                break;
            case "reumatologia":
                break;
            case "urologia":
                break;
            case "dermatologia":
                break;
            case "clinica medica":
                break;
            default:
                return null;
        }
        
        if(dataAgendamento.isBefore(diaAtual) || nomeMedico=="" || matriculaUsuario=="")
        {
            return null;
        }
        switch(local.toLowerCase())
        {
            case "madureira":
                break;
            case "barra da tijuca":
                break;
            case "copacabana":
                break;
            case "meier":
                break;
            default:
                return null;
        }
        
        return "CON123";
        }
        
    
    public String AgendamentoExame () {
        
        if(dataAgendamento.isBefore(diaAtual) || matriculaUsuario=="")
        {
            return null;
        }
        
        switch(local.toLowerCase())
        {
            case "santa cruz":
                break;
            case "piedade":
                break;
            case "quintino":
                break;
            default:
                return null;
        }
        
        switch(procedimento.toLowerCase())
        {
            case "raio-x":
                break;               
            case "hemograma":
                break;
            case "ultra-ssonografia":
                break;
            case "eletrocardiograma":
                break;
            default:
                return null;
        }
        
        return "EXA123";
    }
    
    public String AgendamentoInternação () {
        if(dataAgendamento.isBefore(diaAtual) || matriculaUsuario=="" || procedimento=="" || motivo=="")
        {
            return null;
        }
        
        switch(local.toLowerCase())
        {
            case "cascadura":
                break;
            case "barra da tijuca":
                break;
            case "bangu":
                break;
            default:
                return null;
        }
        
        return "INT123";
    }
   
    
    public static void main(String[] args) {
        
    }
}