package HomeWork3;

import java.util.ArrayList;

public class Box<F>{
 ArrayList<F> fruits = new ArrayList();
    private final int weightFr;
    public <F> Box(int weightFr){
         this.weightFr = weightFr;}
    public void addFr(F fruit){
         fruits.add(fruit);}
    public int getWeightBox(){return fruits.size() * weightFr;}
    public void addFruits(Box<F> BoxFr2){
      System.out.println(fruits.size() + " апельсинов в первой коробке"); System.out.println(BoxFr2.fruits.size() + " апельсинов во второй коробке");
        fruits.addAll(BoxFr2.fruits);
        BoxFr2.fruits.clear();
        BoxFr2.fruits.trimToSize();
      System.out.println(fruits.size() + " апельсинов в первой коробке после пересыпания");System.out.println(BoxFr2.fruits.size() + " апельсинов осталось во второй коробке");
    }
    public boolean compare(Box<?> box){
       return Math.abs(getWeightBox() - box.getWeightBox()) < 0.0001;
    }
}
