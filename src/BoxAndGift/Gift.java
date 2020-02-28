package BoxAndGift;

import Sweetness.AbstractSweetness;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gift implements Box {
    private AbstractSweetness[] somethingInBox = new AbstractSweetness[10];
    private int index = 0;
    private String description;
    @Override
    public void add(AbstractSweetness o) {
        somethingInBox[index] = o;
        index++;
    }

    @Override
    public void delete(String name) {
        for (int j = 0; j < index; j++) {
            if (somethingInBox[j].getName().equals(name)) {
                List<AbstractSweetness> list = new ArrayList<>(Arrays.asList(somethingInBox));
                list.remove(j);
                somethingInBox = list.toArray(new AbstractSweetness[list.size()]);
                index--;
                break;
            }
        }
        System.out.println(name + " deleted");
    }

    @Override
    public double showWeight() {
        double weight = 0;
        for (int i = 0; i<index; i++){
            weight = weight + somethingInBox[i].getWeight();
        }
        return weight;
    }

    @Override
    public double showCost() {
        double price = 0.00;
        for (int i = 0; i<index; i++){
            price = price + somethingInBox[i].getPrice();
        }
        return price;
    }

    @Override
    public void showDescription() {
        for (int i = 0; i<index; i++){
            description = "Number " + i + " is " + somethingInBox[i].getName() + " and its so "+ somethingInBox[i].getDescription()+ " its weight = "+ somethingInBox[i].getWeight() +
            " its price = " + somethingInBox[i].getPrice();
            System.out.println(description);
        }
    }
    public void reduceWeight(double weight){
        double weightChecker = somethingInBox[0].getWeight();
        while(weight<showWeight()){
        for (int i = 0; i<index; i++){
            if(weightChecker>somethingInBox[i].getWeight()){
                weightChecker = somethingInBox[i].getWeight();
            }
        }
        for(int i = 0; i<index; i++) {
            if (somethingInBox[i].getWeight()==(weightChecker)) {
                List<AbstractSweetness> listToRemove = new ArrayList<>(Arrays.asList(somethingInBox));
                listToRemove.remove(i);
               somethingInBox = listToRemove.toArray(new AbstractSweetness[listToRemove.size()]);
               index--;
               break;
            }
        }
        }
        System.out.println("Weight reduced");
    }
    public void reducePrice(double priceToReduce){
        double priceChecker = somethingInBox[0].getPrice();
        while(priceToReduce<showCost()){
            for (int i = 0; i<index; i++){
                if(priceChecker>somethingInBox[i].getPrice()){
                    priceChecker = somethingInBox[i].getPrice();
                }
            }
            for(int i = 0; i<index; i++) {
                if (somethingInBox[i].getPrice()==(priceChecker)) {
                    List<AbstractSweetness> listToRemove = new ArrayList<>(Arrays.asList(somethingInBox));
                    listToRemove.remove(i);
                    somethingInBox = listToRemove.toArray(new AbstractSweetness[listToRemove.size()]);
                    index--;
                    break;
                }
            }
        }
        System.out.println("Weight reduced");
    }
}
