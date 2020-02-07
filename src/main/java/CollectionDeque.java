import java.util.HashMap;
import java.util.LinkedList;

public class CollectionDeque {

    public static void main(String[] args) {
        collection(8,4,2,2,2,2,2,2,2,2);
    }

    public static int collection(int intNumber, int subArraySize, int... queue) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < intNumber; i++)
        {
            list.add(queue[i]); //adding items to the list
        }
        System.out.println("intNumber = " + list.size());
        System.out.println("queue = " + list);

        int maxNumbers =0;

        /*A loop to generate all sub arrays of size maxNumbers*/

        for(int i=0; i< intNumber-subArraySize; i++)
        {
            int unique =0;

            /*A Hash function stores items in key/value pairs
             * and you can access them by an index of another type
             * in this case the type will be of LinkedList
             * LinkedList is my index and Integer will be my object (numbers in the list)*/

            HashMap <LinkedList, Integer> map = new HashMap<LinkedList, Integer>();

            for(int j=0; j< i+subArraySize; j++)
            {
                /*if the key is new to the map
                 * push the key to the list and increment by 1*/

                if(!map.containsKey(list))//checking if the key exists in the map
                {
                    map.put(list,1); //adding elements in my list
                    unique++;

                }

            }

            /*if current unique numbers is greater than the maximum unique numbers
             * if yes, replace current with max*/
            if(unique > maxNumbers){
                maxNumbers = unique;
            }

        }
        System.out.println("subArraySize = " + subArraySize); //dear marker, change the subArraySize under the main function
        System.out.println("Output = " + maxNumbers);

         return maxNumbers;
    }


}
