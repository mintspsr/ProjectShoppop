package Shopop2;


public class Item {

    private String name;

    private String price;

    private String amount;

    private double total;

    Item(String name,String price,String amount) {

        this.name = name;
        this.price = price;
        this.amount = amount;

    }

    public String getName() {
        return name;

    }
    public String getPrice() {
        return price;
    }
    public String getAmount() {
        return amount;
    }
    public double getTotal() {
    	double priceDouble = Double.parseDouble(price);
    	int amountInt = Integer.parseInt(amount);
    	total = priceDouble*amountInt;
        return total;
    }


}