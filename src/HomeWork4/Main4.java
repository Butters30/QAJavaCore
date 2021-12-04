package HomeWork4;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
//        Set<String> listAnimal = new HashSet<>(Arrays.asList("Cat", "Dog", "Horse", "Cat", "Hamster", "Hamster", "Sheep",
//                "Eagle", "Bull", "Bull", "Cow", "Goat", "Donkey", "Dog", "Mouse", "Goat", "Rat", "Kitten", "Cat", "Horse"));
//        System.out.println(listAnimal);

        String[] listAnimal = new String[] {"Cat", "Dog", "Horse", "Cat", "Hamster", "Hamster", "Sheep",
                "Eagle", "Bull", "Bull", "Cow", "Goat", "Donkey", "Dog", "Mouse", "Goat", "Rat", "Kitten", "Cat", "Horse"};
        Set<String> nameAnimal = new HashSet<>(Arrays.asList(listAnimal));
        System.out.println(nameAnimal);

        Map<String, Integer> nameTimes = new HashMap<>();
        for (String word : listAnimal) {
            nameTimes.put(word, nameTimes.getOrDefault(word, 0) + 1);}
        System.out.println(nameTimes+" - Количество повторов");

     phoneBook pB = new phoneBook();
    pB.addPB("Ivanov","89996661234");
    pB.addPB("Ivanov","89996664321");
    pB.addPB("Suvorov","89216473233");
    pB.addPB("Orlov","89112236522");

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Зарегестрированные номера на запращиваемую фамилию: " + pB.getPhone("Ivanov"));
        System.out.println("Зарегестрированные номера на запращиваемую фамилию: " + pB.getPhone("Suvorov"));
        System.out.println("Зарегестрированные номера на запращиваемую фамилию: " + pB.getPhone("Petrov"));

    }
}