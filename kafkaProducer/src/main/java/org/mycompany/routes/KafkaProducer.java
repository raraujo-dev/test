package org.mycompany.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("direct:start")
	    .setBody(constant("Message from Camel"))          // Message to send
	    .to("kafka:test?brokers=my-cluster-kafka-bootstrap:9092");
		
	}

	

	
	
	
}
