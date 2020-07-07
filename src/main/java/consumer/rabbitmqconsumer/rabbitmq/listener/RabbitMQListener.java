package consumer.rabbitmqconsumer.rabbitmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQListener {
	
	//@Autowired
	//private BankLedger bankLedger;
	
	@RabbitListener(queues = "${queue.rabbitmq.queue}")
	public void recievedMessage(String message) {
		System.out.println("Received message is "+message);
		
	}	 
}