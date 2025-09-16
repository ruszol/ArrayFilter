import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Object[] testArray = {"hello", "world","test1", "test2", "test3"};
        Filter<String> upFilter = o -> (String)o.toUpperCase();

        Object[] testArray2 = {2,3,7,1,6};
        Filter<Integer> plusTwoFilter = o -> o+2;

        System.out.println(Arrays.toString(testArray)+"\n"+
                "   |      |      |     |       |"+"\n"+
                "   V      V      V     V       V"+"\n"
                +Arrays.toString(ArrayFilter.filter(testArray, upFilter)));

        System.out.println("====================================");

        System.out.println(Arrays.toString(testArray2)+"\n"+
                " |  |  |  |  |"+"\n"+
                " V  V  V  V  V"+"\n"
                +Arrays.toString(ArrayFilter.filter(testArray2, plusTwoFilter)));

    }

}
