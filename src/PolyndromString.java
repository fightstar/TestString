import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by vshevchenko on 16/05/2016.
 */
public class PolyndromString {

    static final String POLYNDROM = "polydrom string";

    public static void main(String[] args) {
        char[]arr = POLYNDROM.toCharArray();

        List<Character> list = new ArrayList<Character>();

        for(char c : arr){
            list.add(c);
        }

        Collections.reverse(list);

        StringBuilder builder = new StringBuilder();

        for(Character c : list){
            builder.append(c);
        }

        System.out.println(builder.toString());
    }


}
