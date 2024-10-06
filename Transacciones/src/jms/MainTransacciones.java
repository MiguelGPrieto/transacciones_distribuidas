package jms;

import jakarta.jms.Connection;
import jakarta.jms.ConnectionFactory;
import jakarta.jms.Destination;
import jakarta.jms.JMSException;
import jakarta.jms.MessageProducer;
import jakarta.jms.Session;
import jakarta.jms.TextMessage;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 *
 * @author migue
 */
public class MainTransacciones {
    public static void main (String[] args) throws JMSException{
        ConnectionFactory cFactory = new ActiveMQConnectionFactory();
        Connection conexion = cFactory.createConnection();
        conexion.start();
        Session sesion = conexion.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Destination cola = sesion.createQueue("mqtemp");
        MessageProducer productor = sesion.createProducer(cola);
        TextMessage mensaje = sesion.createTextMessage("23");
        productor.send(mensaje);
        sesion.close();
        conexion.close();    
}
}


















































































































































