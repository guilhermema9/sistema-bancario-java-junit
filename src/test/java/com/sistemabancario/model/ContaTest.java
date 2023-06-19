package com.sistemabancario.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {

    private Conta conta;
    @Test
    void testAddMovimentacao() {
        //TODO: Você precisa implementar este teste
    }

    @BeforeEach
    void inicializar(){
        conta = new Conta();
    }
/*

    @Test
    void contaCriadaComoContaCorrenteR02(){
        assertTrue(conta.ContaCorrente());
    }
*/
    @Test
    void R01setNumeroInvalido01(){
        assertThrows(IllegalArgumentException.class, () -> conta.setNumero("1234"));
    }

    @Test
    void R01setNumeroInvalido02(){
        assertThrows(IllegalArgumentException.class, () -> conta.setNumero("1234-5"));
    }

    @Test
    void R01setNumeroInvalido03(){
        assertThrows(IllegalArgumentException.class, () -> conta.setNumero("1a34b-6"));
    }

    @Test
    void R01setNumeroValido(){
        final String esperado = "12345-6";
        conta.setNumero(esperado);
        assertEquals(esperado,conta.getNumero());
    }

    @Test
    void R06getSaldoTotalAlto(){
        final double saldo = 1000;
        final double limite = 1000;
        final double esperado = 2000;
        conta.setSaldo(saldo);
        conta.setLimite(limite);
        final double obtido = conta.getSaldoTotal();
        assertEquals(esperado,obtido);
    }

    @Test
    void R06getSaldoTotalBaixo(){
        final double saldo = 0.1;
        final double limite = 0.2;
        final double esperado = 0.3;
        conta.setSaldo(saldo);
        conta.setLimite(limite);
        final double obtido = conta.getSaldoTotal();
        assertEquals(esperado,obtido,0.0001);
    }
}