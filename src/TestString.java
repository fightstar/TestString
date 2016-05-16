/**
 * Created by vshevchenko on 11/05/2016.
 */
public class TestString {
    static final String TEST_STRING = " Test string is mine and consists of nine  words   ";
    public static void main(String[] args) {
        String[] str = TEST_STRING.trim().split("\\s+");
        int count = 0;
        for (String a : str){
           count++;
        }
        System.out.println("Count " + count);
    }
}
