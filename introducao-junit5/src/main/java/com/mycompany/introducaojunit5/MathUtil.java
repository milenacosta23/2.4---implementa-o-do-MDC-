/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introducaojunit5;

import java.util.Objects;

/**
 *
 * @author patricia
 */
public class MathUtil {

    public static int mdd(int a, int b) {
        //codigo propiedade 7
        a = Math.abs(a);
        b = Math.abs(b);
        //propiedade 6 
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;

        //odigo propiedade 1
        if (b > 0 && a % b == 0) {
            return b;
        }
        //codigo propiedade 3
        if (b == 0) {
            return Math.abs(a);
        }

        return mdd(a - b, b);

    }

    public static int mdd(int... valores) {
        Objects.requireNonNull(valores, "o parametro valores nao pode ser nulo para calcular  o mdc" );
        if (valores.length == 0){  
             throw new IllegalArgumentException(" e preciso indicar ao menos um valor pra calcular o MDC");
          
        }
        
        int a = valores[0];
        for (int b : valores) {
        a = mdd(a, b);
        }
        return a;
    }
}
 