package Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
class QpriorityComp {
    public static void main(String[] args) {
        // Creating a priority queue
    	Comparator<Integer> com = new Comparator<Integer>() {
    		public int compare(Integer i1 , Integer i2)
    		{
    			int values = i1.compareTo(i2);
    			if (values >0)
    				return -1;
    			else if(values <0)
    				return 1;
    			else 
    				return 0;
    		}
    	};
        PriorityQueue<Integer> numbers = new PriorityQueue<>(com);
        numbers.add(4);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
       
        System.out.print("PriorityQueue: " + numbers);
    }
}

/*
swapping concept
 v1>v2 : return 1 -swap  45 >34 
 v1<v2: return -1 -not swap  //23<30
 v1==v2 :- return 0  
 */
