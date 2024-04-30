
package com.electrika.tech.util;

import java.util.List;

public class Busqueda {
    public static Integer buscarBinario(List<String> list, String valor) {
        
         //Busqueda elementos ascendentes
        int li = 0;
        int ls = list.size() - 1;

        while (li <= ls) {
            int lm = (ls - li) / 2 + li;

            if ((list.get(lm).compareTo(valor)) < 0) {
                li = lm + 1;

            } else if ((list.get(lm).compareTo(valor)) > 0) {
                ls = lm - 1;
            } else {
                return lm;
            }
        }

        //Busqueda elementos descendentes
        li = 0;
        ls = list.size() - 1;
        while (li <= ls) {
            int lm = (ls - li) / 2 + li;
            if ((list.get(lm).compareTo(valor)) > 0) {
                li = lm + 1;
            } else if ((list.get(lm).compareTo(valor)) < 0) {
                ls = lm - 1;
            } else {
                return lm;
            }
        }

        // Búsqueda binaria para elementos double con radio button ascendente
        double valorDouble = Double.parseDouble(valor);

        li = 0;
        ls = list.size() - 1;

        while (li <= ls) {
            int lm = li + (ls - li) / 2;
            double elementoMedio = Double.parseDouble(list.get(lm));

            if (elementoMedio == valorDouble) {
                return lm; // Elemento encontrado
            } else if (elementoMedio < valorDouble) {
                li = lm + 1; // Buscar en la mitad derecha
            } else {
                ls = lm - 1; // Buscar en la mitad izquierda
            }
        }
        
        // Búsqueda binaria para elementos double con radio button descendente
        valorDouble = Double.parseDouble(valor);

        li = 0;
        ls = list.size() - 1;
        
        while (li <= ls) {
            int lm = li + (ls - li) / 2;
            double elementoMedio = Double.parseDouble(list.get(lm));

            if (elementoMedio == valorDouble) {
                return lm; // Elemento encontrado
            } else if (elementoMedio > valorDouble) {
                li = lm + 1; // Buscar en la mitad derecha
            } else {
                ls = lm - 1; // Buscar en la mitad izquierda
            }
        }
        
        return null; // Elemento no encontrado
    }
}
