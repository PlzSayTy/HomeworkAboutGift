package BoxAndGift;

import Sweetness.AbstractSweetness;

public interface Box {
    void add(AbstractSweetness o);
    void delete(String name);
    double showWeight();
    double showCost();
    void showDescription();
}
