import java.util.*;

public class CollectionDeque {

    public static void main(String[] args) {
        collection(9,3,6,2,6,8,3,7,1,4,4);
    }

    public static int collection(int intNumber, int subArraySize, int... queue) {
        int maxNumbers =0;
        Deque<Object> deque = new ArrayDeque<>();

        for (int i = 0; i <= intNumber-1; i++)
        {
            deque.add(queue[i]); //adding items to the list
        }
        System.out.println("intNumber = " + deque.size());
        System.out.println("queue = " + deque);

        /*
        * HashSet extends the Set Interface
        * Duplicates are not allowed*/

        HashSet <Integer> hashSet = new HashSet<>();

        for(int i=0; i< intNumber-subArraySize; i++) {
            Object[] temp = deque.toArray(); //takes all the elements in the deque array and copies them to a new array called temp;

            for (int j = 0; j <subArraySize; j++){
                hashSet.add((Integer) temp[j]); //adding the elements to the temporary array
        }
            deque.remove();
            if(hashSet.size() > maxNumbers){
                maxNumbers = hashSet.size();
            }
            hashSet.clear();// removes the set but does not delete the set
        }
        System.out.println("subArraySize = " + subArraySize); //dear marker, change the subArraySize under the main function
        System.out.println("Output = " + maxNumbers);

        return maxNumbers;
    }


}
