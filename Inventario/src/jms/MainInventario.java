/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jms;

import jakarta.jms.Connection;
import jakarta.jms.ConnectionFactory;
import jakarta.jms.Destination;
import jakarta.jms.JMSException;
import jakarta.jms.MessageConsumer;
import jakarta.jms.Session;
import jakarta.jms.TextMessage;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 *
 * @author migue
 */
public class MainInventario {
    public static void main (String[] args) throws JMSException{
        ConnectionFactory cFactory = new ActiveMQConnectionFactory();
        Connection conexion = cFactory.createConnection();
            conexion.start();
            Session sesion = conexion.createSession(false, Session.AUTO_ACKNOWLEDGE);
                Destination cola = sesion.createQueue("mqtemp");
                MessageConsumer consumidor = sesion.createConsumer(cola);
                TextMessage mensaje;
                mensaje = (TextMessage)consumidor.receive();
                System.out.println(mensaje.getText());
                sesion.close();
                conexion.close();
            }
        }  
        
 
    
    
