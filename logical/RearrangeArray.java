package logical;

import java.util.*;

public class RearrangeArray {
    //EPAM- rearrange the numbers in a way that no two adjacent numbers are same
    public static void main(String[] args) {

        int[] numbers = {1,1,2,2,3,3};

        System.out.println(Arrays.toString(rearrangeArray(numbers)));
    }
    public static int [] rearrangeArray(int arr[]){
       Map<Integer,Integer> freqs=new HashMap<>();
       for (int num:arr){
           freqs.put(num,freqs.getOrDefault(num,0)+1);
       }
       List<Integer> sortedNumber=new ArrayList<>(freqs.keySet());
       sortedNumber.sort((a,b)->freqs.get(a)-freqs.get(b));

        int l=arr.length;
        int [] result=new int[l];
        int index=0;

       for (int num:sortedNumber) {
           int count = freqs.get(num);
           for (int i = 0; i < count; i++) {
               if (index >= l)
                   index = 1;
               result[index] = num;
               index += 2;
           }
       }
        return result;
    }
}
