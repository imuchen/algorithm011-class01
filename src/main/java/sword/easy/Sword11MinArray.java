package sword.easy;

/**
 * Created by tianguoxing on 2021/3/5 19:16.
 */
public class Sword11MinArray {
    public int minArray(int[] numbers) {
        int p = 0;
        int q = numbers.length-1;
        while (p<q) {
            int mid = (p + q) / 2;
            if (numbers[mid] > numbers[q]) {
                p = mid+1;
            } else if(numbers[mid] < numbers[p]) {
                q = mid;
            } else{
                q--;
            }
        }
        return numbers[q];
    }

    public static void main(String[] args) {
//        int[] x = {2, 2, 2, 3, 0, 1, 2};
        int[] x = {3, 1};
        System.out.println(new Sword11MinArray().minArray(x));
    }
}
