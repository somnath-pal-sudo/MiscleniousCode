package AmazonImplementation;

public class Search {
	public String displayproduct(product product) {
		if(product.getProductList().contains(product.getProdname())) {
			return product.getProdname();
		}
		return null;
	}
	

}
