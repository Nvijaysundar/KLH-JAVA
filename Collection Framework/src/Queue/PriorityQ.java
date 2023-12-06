package Queue;
import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> num=new PriorityQueue<>();
        for(int i=1;i<=20;i++)
        {
            num.add(i);
        }
        System.out.println("Priority queue: "+num);
        
        Boolean contain=num.contains(10);
        System.out.println("Contains: "+contain);//true

        Iterator iter=num.iterator();
        while(iter.hasNext())
        {
            System.out.print(iter.next()+" ");
        }
        System.out.println();
        num.offer(30);
        System.out.println("after offer: "+num);

        System.out.println("Peek: "+num.peek());//1
         int pol=num.poll();//1
        System.out.println("poll: "+pol);

        num.remove(5);
        System.out.println("remove: "+num);
       
        System.out.println("size: "+num.size());//19

               
        for(Integer temp : num)
        	System.out.print(temp + " ");
        System.out.println();
    }
    
}
