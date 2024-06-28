
package queue;


public class Demo {
    
    
    public static<T> void showQueue(ArrayQueue<T> s){
        ArrayQueue<T> temp = new ArrayQueue<>();
        while(!s.isEmpty()){
            System.out.println(s.front());
            temp.enqueue(s.front());
            s.dequeue();
            
        }
        // s is empty
        // temp contains the elements
        while(!temp.isEmpty()){
            s.enqueue(temp.front());
            temp.dequeue();
        }
    }
    
    
    public static void main(String[] args) {
        ArrayQueue<Integer> myQueue = new ArrayQueue<>();
        myQueue.enqueue(20);
        myQueue.enqueue(3);
        myQueue.enqueue(5); 
        
     showQueue(myQueue);   
     
      //  System.out.println(myQueue.front());
        
    }
}
