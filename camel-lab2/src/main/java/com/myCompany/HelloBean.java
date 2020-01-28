package com.myCompany;
import org.apache.camel.Exchange;

public class HelloBean {
	
	public String sayHello(Exchange exchange) {
		String body = (String) exchange.getIn().getBody();
		return "Hello World" + body;
	}

}
