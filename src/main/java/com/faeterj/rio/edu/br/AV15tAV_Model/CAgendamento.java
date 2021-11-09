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
    public CAgendamento(LocalDate _dataAgendamento, String _local, String _matriculaUsuario, String _procedimento, String NomeMedico, String _motivo) {
        dataAgendamento = _dataAgendamento;
        local = _local;
        matriculaUsuario = _matriculaUsuario;
        procedimento = _procedimento;
        motivo = _motivo;
        nomeMedico = nomeMedico;
    }
    
    public String AgendamentoConsulta () {
        
        return "CON123";
    }
    
    public String AgendamentoExame () {
        
        return "EXA123";
    }
    
    public String AgendamentoInternação () {
        
        return "INT123";
    }
   
    
    public static void main(String[] args) {
        
    }
    

    
    
    
    
    
    
    
    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(LocalDate dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getCodAgendamento() {
        return codAgendamento;
    }

    public void setCodAgendamento(String codAgendamento) {
        this.codAgendamento = codAgendamento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getMatriculaUsuario() {
        return matriculaUsuario;
    }

    public void setMatriculaUsuario(String matriculaUsuario) {
        this.matriculaUsuario = matriculaUsuario;
    }
    
}
