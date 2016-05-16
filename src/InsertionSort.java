import java.util.Arrays;

/**
 * Created by vshevchenko on 13/05/2016.
 */
public class InsertionSort {
  static int[] TestArr = new int[]{6,4,7,3,2,1};


    public static void main(String[] args) {
        System.out.println(Arrays.toString(TestArr));
        sort(TestArr);
        System.out.println(Arrays.toString(TestArr));

    }

    public static void sort(int[]arr){


        for (int i= 1; i< TestArr.length; i++){

            int newElement = arr[i];
            int location = i - 1;

            while(location >=0 && arr[location]>newElement){
                arr[location + 1] = arr[location];

                location--;
            }

            arr[location + 1] = newElement;

        }


    }

}
