import java.util.Arrays;

interface Filter<T> {

    T apply(T o);

}

public class ArrayFilter {

    public static Object[] filter (Object[] array, Filter filter) {
         Object[] result;
         result = Arrays.stream(array).map(x -> filter.apply(x)).toArray();
         return result;

        }

    }





