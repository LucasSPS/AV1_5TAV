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
        /*func1.setEmpresa("Eletromidia");
        func1.setNome("Ricardo Messias Junior");
        func1.setPlano("Brasil-Alpha-2A");
        func1.setQntDependentes(0);
        func1.setDtNascimento("15/02/1974");*/

        
        boolean resultado = func1.CriaCarteirinha();
        
        assertTrue(resultado);

    }
    
}
