import fruits.Fruit;

import java.util.ArrayList;
import java.util.Objects;

public class Box<T extends Fruit> {

    private final ArrayList<T> fruits = new ArrayList<>();
    private Float boxWeight = 0.0f;
    private T fruitType;

    public Box(T type) {
        this.boxWeight = 0.0f;
        fruitType = type;
    }

    private void emptyBox() {
        this.fruits.clear();
        this.boxWeight = 0.0f;
    }

    public void addFruits(int count) {
        for (int fruitCount = 0; fruitCount < count; fruitCount++) {
            fruits.add(fruitType);
            boxWeight = boxWeight + fruitType.getWeight();
        }
    }

    public int getFruits() {
        return fruits.size();
    }

    public boolean compareWeight(Box<? extends Fruit> box) {
//        System.out.println("Коробки равны по весу? ");
        return Objects.equals(box.getBoxWeight(), this.getBoxWeight());
    }

    public Float getBoxWeight() {
        return boxWeight;
    }

    public void fillBox(Box<T> box) {
        box.addFruits(this.fruits.size());
        this.emptyBox();
    }



}