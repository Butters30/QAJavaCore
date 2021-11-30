package HomeWork3;



import java.util.Arrays;

public class Main3 {
    public static void main(String[] args){
        String[] arr = {"One","Two","Three","Four"};
        System.out.println("Исходный вариант "+ Arrays.toString(arr));
        swapObject(arr,0,1);
        nFR();}

    public static void nFR() {
        Box<Orange> orBox1 = new Box<>(200);
        Box<Orange> orBox2 = new Box<>(200);
        Box<Apple> apBox = new Box<>(100);

         for(int i = 0; i < 5; i++){orBox1.addFr(new Orange());
                                    orBox2.addFr(new Orange());
                                    apBox.addFr(new Apple());
                                    }
                                    orBox1.addFr(new Orange());

        System.out.println("Вес коробки с апельсинами " + orBox1.getWeightBox() + " грамм");
        System.out.println("Вес коробки с яблоками " + apBox.getWeightBox() + " грамм");
        System.out.println("Масса коробок одинаковая? : " + apBox.compare(orBox1));
        orBox1.addFruits(orBox2);
        }


    public static void swapObject(Object[] arr, int elementOne, int elementTwo){ // ЗАДАНИЕ 1
        Object swap = arr[elementOne];
        arr[elementOne] = arr[elementTwo];
        arr[elementTwo] = swap;
        System.out.println("Вариант после замены "+ Arrays.toString(arr));
        System.out.println("--------------------------------------------");
    }

}
