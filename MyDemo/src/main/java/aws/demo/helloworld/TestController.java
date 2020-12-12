package aws.demo.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import aws.demo.catalog.CatalogService;

@RestController
public class TestController {
	
	

	@GetMapping(path = "/hello")
	public String findAllProducts1(){
		return "hello";
	}
}
