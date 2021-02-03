package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class product {
		private	String prodname;
		private int price;
		public product(String proname, int price) {
			this.prodname=proname;
			this.price=price;
			
		}
		public String getProdname() {
			return prodname;
		}
		public void setProdname(String prodname) {
			this.prodname = prodname;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public List<String> getProductList(){
			List<String> productlist= new ArrayList<>();
			productlist.add("Apple Macbook pro");
			return productlist;
			
		}
}
