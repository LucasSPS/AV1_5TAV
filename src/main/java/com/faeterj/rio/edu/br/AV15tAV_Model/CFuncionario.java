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
    /*public CFuncionario(String plano, int qntDependentes, String empresa, String dtNascimento, String nome) {
        
        plano = plano;
        qntDependentes = qntDependentes;
        empresa = empresa;
        dtNascimento = dtNascimento;
        nome = nome;
    }*/
    
    public String CriaCarteirinha()
    {
        return "COD115-445";
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public int getQntDependentes() {
        return qntDependentes;
    }

    public void setQntDependentes(int qntDependentes) {
        this.qntDependentes = qntDependentes;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getNumCarteirinha() {
        return numCarteirinha;
    }

    public void setNumCarteirinha(String matricula) {
        this.numCarteirinha = matricula;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
