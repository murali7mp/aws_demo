package aws.demo.catalog;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class CatalogService {
	
	private static List<ProductBean> products = new ArrayList<ProductBean>();
	
	static {
		products.add(new ProductBean("1", "Mobile"));
		products.add(new ProductBean("2", "TV"));
		products.add(new ProductBean("3", "Speakers"));
	}

	
	public List<ProductBean> findAllProduct(){
		return products;
	}
	
	public void addProducts(ProductBean p) {
		products.add(p);
	}
	
	
}
