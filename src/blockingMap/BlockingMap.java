package blockingMap;
public interface BlockingMap<V> {  
      
    public void put(Integer key, V o) throws InterruptedException;  
      
    public V take(Integer key) throws InterruptedException;  
      
    public V poll(Integer key, long timeout) throws InterruptedException;  
  
}  
  
