/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.limoca.factorymethod.emissor;

import br.com.limoca.factorymethod.contrato.Emissor;

/**
 *
 * @author GIOVANNI
 */
public class EmissorSMS implements Emissor {

    public void envia(String mensagem) {
        System.out.println("Enviando por SMS a mensagem");
        System.out.println(mensagem);
    }
}
