public class TestProduct {
    
    public static void main(String [] args){
        Product product1 = new Product();

        product1.setName("");
        product1.setPrice(0);
        product1.setStock(-3);
        System.out.println("Product: "+ product1.getName());
        System.out.println("Price: " + product1.getPrice());
        System.out.println("Stock: " +product1.getStock());

    }
}
