package aws.demo.catalog;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import aws.demo.repository.CatalogRepository;

@RestController
public class CatalogResource {

	@Autowired	
	private CatalogService service;
	
	@Autowired
	private CatalogRepository repository;
	
	
	
	/*
	 * @GetMapping(path = "/products") public List<Product> findAllProducts(){
	 * return catalogService.findAllProduct(); }
	 */
	
	
	@GetMapping(path = "/myproducts")
	public List<Product> findAllProducts(){
		List<Product> prod= (List<Product>) repository.findAll();
		
		return prod;
	}

	@GetMapping(path = "/products")
	public List<ProductBean> findAllProducts1(){
		return service.findAllProduct();
	}
	
	@PostMapping(path = "/products")
	public ResponseEntity<Object> addProduct1(@RequestBody ProductBean product) {
		service.addProducts(product);
		
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("").buildAndExpand().toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PostMapping(path = "/myproducts")
	public ResponseEntity<Object> addProduct(@RequestBody Product product) {
		
		repository.save(product);
		
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("").buildAndExpand().toUri();
		return ResponseEntity.created(location).build();
	}
	
	
}
