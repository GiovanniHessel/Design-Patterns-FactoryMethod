/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.limoca.factorymethod.teste;

import br.com.limoca.factorymethod.contrato.Emissor;
import br.com.limoca.factorymethod.emissor.EmissorCreator;
//import br.com.limoca.factorymethod.emissor.EmissorEmail;
//import br.com.limoca.factorymethod.emissor.EmissorJMS;
//import br.com.limoca.factorymethod.emissor.EmissorSMS;

/**
 *
 * @author GIOVANNI
 */
public class TestaEmissores {
    public static void main(String[] args){
        String mensagem = "testando emissores";
        EmissorCreator creator = new EmissorCreator();
        
        //Emissor emissor1 = new EmissorSMS(); -- Antes, desacoplamento
        Emissor emissor1 = creator.create(EmissorCreator.SMS);
        emissor1.envia(mensagem);
        
        //Emissor emissor2 = new EmissorEmail(); -- Antes, desacoplamento
        Emissor emissor2 = creator.create(EmissorCreator.Email);
        emissor2.envia(mensagem);
        
        //Emissor emissor3 = new EmissorJMS(); -- Antes, desacoplamento
        Emissor emissor3 = creator.create(EmissorCreator.JMS);
        emissor3.envia(mensagem);
    }
    
}
//Conclui-se que substituimos 3 acoplamentos por 1