/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introducaojunit5;

import static com.mycompany.introducaojunit5.MathUtil.mdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author patricia
 */
public class MathUtilTest {

    //sao  teste da propiedade 1
    @Test
    public void testSomeMethodAparP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = b;
        int obtido = MathUtil.mdd(a, b);
        assertEquals(esperado, obtido);
    }
    //sao  teste da propiedade 1

    void testMdcAImparP1() {
        final int a = 9;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdd(a, b);
        assertEquals(esperado, obtido);

    }
    /////////////////////////////////////////////////////

    ///teste da propiedade 2
    @Test
    void testMdcParesP2() {
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int esperado = 0;
        final int obtido = MathUtil.mdd(a, b);
        //assertEquals (esperado, obtido % divisor);
        assertTrue(obtido % divisor == 0);
    }

    /////////////////////////////////////////////////////
    ///teste da propiedade 3
    @Test
    void testeMdcAPositivoP3() {
        final int a = 15;
        final int b = 0;
        final int esperado = 15;
        final int obtido = MathUtil.mdd(a, b);
        assertEquals(esperado, obtido);
    }
//Mais um teste da propiedade 3

    @Test
    void testeMdcANegativoP3() {
        final int a = -30;
        final int b = 0;
        final int esperado = 30;
        final int obtido = MathUtil.mdd(a, b);
        assertEquals(esperado, obtido);
    }
    ////////////////////////////////////////////////////////

    //teste da propiedade 4
    @Test
    void testMdcMParP4() {
        final int a = 9;
        final int b = 3;
        final int m = 2;
        //mdc(a*m, b*m) == m * mdc(a, b)
        //mdc(18,    6) == 2 * md(9, 3)
        //     6        ==  2 * 3     
        final int esperado = MathUtil.mdd(a * m, b * m);
        final int obtido = m * MathUtil.mdd(a, b);
        assertEquals(esperado, obtido);
    }

    ///////////////////////////////////////////////////////
    //teste da propiedade 5
    @Test
    void testeMdcP5() {
        // se mdc(a, b) == 1, então mdc(a*b, c) == mdc(b,c)
        final int a = 7;
        final int b = 3;
        final int c = 5;

        // 7*3  5
        // 21,  5
        final int esperado = mdd(a * b, c);
        //                       3,5
        final int obtido = mdd(b, c);
        System.out.println("eperado: " + esperado + "obtido: " + obtido);
        assertEquals(esperado, obtido);
    }

    @Test
    void testeMdcP5Resultado1() {
        // se mdc(a, b) == 1, então mdc(a*b, c) == mdc(b,c)
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = 1;

        final int obtido = mdd(b, c);
        System.out.println("eperado: " + esperado + "obtido: " + obtido);
        assertEquals(esperado, 1);
    }
////////////////////////////////////////////////////////////////////////
    //teste da propiedade 6

    @Test
    void testMdcP6() {
        final int a = 8;
        final int b = 2;
        //    mdc(a,b) == mdc(b,a)
        final int esperado = mdd(a, b);
        final int obtido = mdd(b, a);
        assertEquals(esperado, obtido);

    }

    @Test
    void testMdcP7TudoNegativo() {
        final int a = 12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = mdd(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcGeralIndivisiveis() {
        final int a = 30;
        final int b = 12;
        final int esperado = 6;
        final int obtido = mdd(a, b);
        assertEquals(esperado, obtido);

    }

    @Test
    void testMdcMultiplosValores() {
        final int a = 30;
        final int b = 12;
        final int c = 4;
        final int esperado = 2;
        final int obtido = mdd(a, b, c);
    }

    @Test
    void testMdcNenhumParametro() {
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> mdd());
    }
    @Test
    void testMdcNulo(){
        assertThrows(NullPointerException.class,() -> mdd(null));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
