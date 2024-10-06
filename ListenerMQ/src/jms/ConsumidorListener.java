/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;
import jakarta.jms.TextMessage;

/**
 *
 * @author migue
 */
public class ConsumidorListener implements MessageListener  {

    @Override
    public void onMessage(Message msg) {
       System.out.println("Recibiendo Mensaje");
       TextMessage mensaje = (TextMessage)msg;
       try {
        System.out.println(mensaje.getText());   
       } catch (JMSException ex) {
           System.out.println("Error Recibiendo");
       }
       System.out.println("Mensaje Recibido");
          
       }       
    }
