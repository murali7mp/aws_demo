package aws.demo.catalog;

public class ProductBean {
	
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProductBean(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	
	

}
