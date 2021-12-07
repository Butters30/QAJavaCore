package HomeWork5;
import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {

        AppData data = new AppData();
        data.readFile("HW5.csv");
        data.writeFile("new_HW5.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

    }

}

