package myCompany.project;
import org.apache.camel.Body;

public class myBean {
	
	public String sayHello(@Body String body) {
		return "Hello my mate" + body;
	}

}
