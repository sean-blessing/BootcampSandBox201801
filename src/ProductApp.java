
public class ProductApp {

	public static void main(String[] args) {
		System.out.println("Product App");
		Product p1 = new Product();
		p1.setCode("java");
		p1.setDescription("Murach's Java");
		p1.setPrice(57.50);
		System.out.println(p1.getProductSummary());
		
		Product p2 = new Product("test","a fake book", 11.11);
		System.out.println(p2.getProductSummary());
		System.out.println("bye");
	}

}
