import java.util.HashMap;
import java.util.LinkedList;

public class CollectionDeque {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(6);
        list.add(2);
        list.add(6);
        list.add(8);
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(4);
        list.add(4);

        System.out.println("intNumber = " + list.size());
        System.out.println("queue = " + list);

        int numbers =0;
        int maxNumbers =3;

        /*A loop to generate all sub arrays of size maxNumbers*/

        for(int i=0; i< numbers-maxNumbers; i++)
        {
            int unique =0;

            /*A Hash function stores items in key/value pairs
            * and you can access them by an index of another type
            * in this case the type will be of LinkedList
            * LinkedList is my index and Integer will be my object (numbers in the list)*/

            HashMap <LinkedList, Integer> map = new HashMap<LinkedList, Integer>();

            for(int j=0; j< i+maxNumbers; j++)
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
        System.out.println("subArraySize = " + maxNumbers);

    }
}
