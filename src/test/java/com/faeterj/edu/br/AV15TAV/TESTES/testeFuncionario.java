/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.faeterj.edu.br.AV15TAV.TESTES;

import com.faeterj.rio.edu.br.AV15tAV_Model.CFuncionario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lucas
 */
public class testeFuncionario {
    
    @Test
    public void testRegistroCarteirinha()
    {
        CFuncionario func1 = new CFuncionario("Brasil-Alpha-2A", 0, "Eletromidia", "15/02/1974", "Ricardo Messias Junior");
        
        boolean resultado = func1.CriaCarteirinha();
        
        assertTrue(resultado);

    }
    
    @Test
    public void testEmpresaVazia()
    {
        CFuncionario func1 = new CFuncionario("Brasil-Beta-1A", 2, "", "21/06/1997", "Adalberto Soarez");
        
        boolean resultado = func1.CriaCarteirinha();
        
        assertTrue(resultado);

    }
    
    @Test
    public void testPlanoNaoEncontrado()
    {
        CFuncionario func1 = new CFuncionario("Brasil-GAMA-6A", 1, "Tico Teco T.I", "15/02/1974", "Fernanda Guimaraes");
        
        boolean resultado = func1.CriaCarteirinha();
        
        assertTrue(resultado);

    }
    
    @Test
    public void testMaisDe5Dependentes()
    {
        CFuncionario func1 = new CFuncionario("Brasil-Beta-1A", 6, "Chico TI", "10/07/1989", "Gabriel Almeida");
        
        boolean resultado = func1.CriaCarteirinha();
        
        assertTrue(resultado);

    }
    
}
