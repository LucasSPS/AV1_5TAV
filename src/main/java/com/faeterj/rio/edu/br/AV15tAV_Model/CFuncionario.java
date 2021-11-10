/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faeterj.rio.edu.br.AV15tAV_Model;

/**
 *
 * @author Lucas
 */
public class CFuncionario {
    private String plano;
    private int qntDependentes;
    private String empresa;
    private String numCarteirinha;
    private String dtNascimento;
    private String nome;
    
    //Criar carteirinha
    public CFuncionario(String _plano, int _qntDependentes, String _empresa, String _dtNascimento, String _nome) {
        
        plano = _plano;
        qntDependentes = _qntDependentes;
        empresa = _empresa;
        dtNascimento = _dtNascimento;
        nome = _nome;
    }
       
    public boolean CriaCarteirinha()
    {
        if(nome.isBlank() || qntDependentes>5 || empresa.isBlank() || dtNascimento.isBlank())
        {
            return false;
        }
        
        switch(plano)
        {
            case "Brasil-Alpha-1A":
                break;
            
            case "Brasil-Alpha-2A":
                break;
            
            case "Brasil-Alpha-3A":
                break;
            
            case "Brasil-Beta-1A":
                break;
            
            case "Brasil-Beta-2A":
                break;
            
            default:
                return false;
        }
        
        
        return true;
        
    }
  
}
