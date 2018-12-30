package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {
    public static void main(String[] args) {


        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int length = array.length;

        int indexes = 10;
        int values = 0;

        for (int i = 0; i < length; i++) {
            indexes += i + 1;
            values += array[i];
        }

        int result = indexes - values;

        System.out.println("Missing number is:" + result);
    }
}









