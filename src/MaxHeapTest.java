import static org.junit.Assert.*;
import org.junit.Test;

public class MaxHeapTest {
    @Test
    public void MaxLogND(){
        Integer[] input = {1,3,8,4,5,9};
        Integer[] result = {9,8,5,4,3,1};
        MaxHeap test = new MaxHeap(63);
        test.MaxHeapLogN(input);
        test.display();
        
        for(int i = 0; i < result.length; i++){
            assertEquals(result[i],test.data[i]);
        }
        
    }
    
    @Test
    public void MaxND(){
        Integer[] input = {1,3,8,4,5,9};
        Integer[] result = {9,5,8,4,3,1};
        
        MaxHeap test = new MaxHeap(63);
        test.MaxHeapN(input);
        test.display();
        
        for(int i = 0; i < result.length; i++){
            assertEquals(result[i],test.data[i]);
        }
    }
    
    @Test
    public void addD(){
        Integer[] input = {1,3,8,4,5,9};
        Integer[] preadd = {9,8,5,4,3,1};
        Integer[] result = {9,8,6,4,3,1,5};
        
        MaxHeap test = new MaxHeap(63);
        test.MaxHeapLogN(input);
        
        for(int i = 0; i < preadd.length; i++){
            assertEquals(preadd[i],test.data[i]);
        }
        
        test.add(6);
        
        for(int i = 0; i < result.length; i++){
            assertEquals(result[i],test.data[i]);
        }
    }
    
    @Test
    public void getD(){
        Integer[] input = {1,3,8,4,5,9};
        Integer result = 9;
        
        MaxHeap test = new MaxHeap(63);
        test.MaxHeapLogN(input);
        
        assertEquals(result,test.get());
    }
    
    @Test
    public void popD(){
        Integer[] input = {1,3,8,4,5,9};
        Integer[] result = {8,4,5,1,3};
        Integer output = 9;
        
        MaxHeap test = new MaxHeap(63);
        test.MaxHeapLogN(input);
        
        assertEquals(output,test.pop());
        test.display();
        
        for(int i = 0; i < result.length; i++){
            assertEquals(result[i],test.data[i]);
        }
    }
}