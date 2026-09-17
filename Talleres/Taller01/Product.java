public class Product{

    private  String name = "";
    private double price = 0;
    private int stock = 0;

    public void setPrice(double newprice){
        if (price > 0){
            this.price = newprice;
        }
        else{
            System.out.println("Price not valid");
        }
    }
  
    public boolean setName(String name){
        if(name.isEmpty()){
            return false;
        }
        this.name = name;
        return true;
    }

    public void setStock(int stock){
        if(stock >= 0){
            this.stock = stock;
        }
        System.out.println("Stock not valid");
    }

    public Double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public int getStock(){
        return stock;
    }

}