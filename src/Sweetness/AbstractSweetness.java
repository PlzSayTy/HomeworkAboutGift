package Sweetness;

public abstract class AbstractSweetness {
    private String name;
    private double weight;
    private double price;
    private String description;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
