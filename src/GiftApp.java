import BoxAndGift.Gift;
import Sweetness.*;

public class GiftApp {
    public static void main(String[] args){
        Twix twix = new Twix("Twix", 1.2,5.5,"tasty");
        Bounty bounty = new Bounty("Bounty", 2.2,4.5, "sweet");
        Mars mars = new Mars("Mars", 3.1, 1.2, "amazing");
        Rafaello rafaello = new Rafaello("Rafaello", 1.8,3.5, "perfect");
        Twix twix1 = new Twix("Twix1", 3.2,2.5,"tasty");
        Bounty bounty1 = new Bounty("Bounty1", 4.2,1.5, "sweet");
        Mars mars1 = new Mars("Mars1", 3.1, 1.2, "amazing");
        Rafaello rafaello1 = new Rafaello("Rafaello1", 3.8,5.5, "perfect");
        Gift gift = new Gift();
        gift.add(twix);
        gift.add(bounty);
        gift.add(mars);
        gift.add(rafaello);
        gift.add(twix1);
        gift.add(bounty1);
        gift.add(mars1);
        gift.add(rafaello1);
        gift.showDescription();
        System.out.println("the weight of gift is " + gift.showWeight());
        System.out.println("the cost of gift is " + gift.showCost());
        gift.delete("Mars");
        gift.showDescription();
        System.out.println("the weight of gift is " + gift.showWeight());
        System.out.println("the cost of gift is " + gift.showCost());
        gift.reduceWeight(18.00);
        gift.showDescription();
        System.out.println("the weight of gift is " + gift.showWeight());
        System.out.println("the cost of gift is " + gift.showCost());
        gift.reducePrice(15.00);
        System.out.println("the weight of gift is " + gift.showWeight());
        System.out.println("the cost of gift is " + gift.showCost());
    }
}
