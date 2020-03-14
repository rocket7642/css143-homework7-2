import static org.junit.Assert.*;
import org.junit.Test;

public class MaxHeapTest {
    @Test
    public void MaxLogND(){
        Integer[][] input = {{1,3,8,4,5,9},{},{1,3,8,4,5,9,9},{1,7,7,7,4,3}};
        Integer[][] result = {{9,8,5,4,3,1},{},{9,9,8,5,4,3,1},{7,7,7,4,3,1}};
        MaxHeap[] test = {new MaxHeap(63),new MaxHeap(63),new MaxHeap(63),new MaxHeap(63)};
        
        for(int i = 0; i < input.length; i++){
            test[i].MaxHeapLogN(input[i]);
        }

        for(int j = 0; j < test.length; j++){
            for(int i = 0; i < result.length; i++){
                if(j != 1){ //only here as it trys to check of array 0, it does heap correctly
                    assertEquals(result[j][i],test[j].data[i]);
                }
            }
        }

    }

    @Test
    public void MaxND(){
        Integer[][] input = {{1,3,8,4,5,9},{},{1,3,8,4,5,9,9},{1,7,7,7,4,3}};
        Integer[][] result = {{9,5,8,4,3,1},{},{9,5,9,4,3,8,1},{7,7,7,1,4,3}};

        MaxHeap[] test = {new MaxHeap(63),new MaxHeap(63),new MaxHeap(63),new MaxHeap(63)};
        for(int i = 0; i < input.length; i++){
            test[i].MaxHeapN(input[i]);
            test[i].display();
        }

        for(int j = 0; j < test.length; j++){
            for(int i = 0; i < result.length; i++){
                if(j != 1){ //only here as it trys to check of array 0, it does heap correctly
                    assertEquals(result[j][i],test[j].data[i]);
                }
            }
        }
    }

    @Test
    public void addD(){
        Integer[][] input = {{1,3,8,4,5,9},{},{1,3,8,4,5,9,9},{1,7,7,7,4,3}};
        Integer[][] preadd = {{9,8,5,4,3,1},{},{9,9,8,5,4,3,1},{7,7,7,4,3,1}};
        Integer[][] result = {{9,8,6,4,3,1,5},{7},{9,9,8,5,4,3,1,3},{11,7,7,4,3,1,7}};

        MaxHeap[] test = {new MaxHeap(63),new MaxHeap(63),new MaxHeap(63),new MaxHeap(63)};
        for(int i = 0; i < input.length; i++){
            test[i].MaxHeapLogN(input[i]);
        }

        for(int j = 0; j < test.length; j++){
            for(int i = 0; i < preadd[j].length; i++){
                if(j != 1){ //only here as it trys to check of array 0, it does heap correctly
                    assertEquals(preadd[j][i],test[j].data[i]);
                }
            }
        }
        
        int[] holder = {6,7,3,11};
        
        for(int i = 0; i < holder.length; i++){
            test[i].add(holder[i]);
        }
        //test.add(6);

        for(int j = 0; j < test.length; j++){
            for(int i = 0; i < result[j].length; i++){
                assertEquals(result[j][i],test[j].data[i]);
            }
        }
    }

    @Test
    public void getD(){
        Integer[][] input = {{1,3,8,4,5,9},{},{1,3,8,4,5,9,9},{1,7,7,7,4,3}};
        Integer[] result = {9,null,9,7};

        MaxHeap[] test = {new MaxHeap(63),new MaxHeap(63),new MaxHeap(63),new MaxHeap(63)};
        for(int i = 0; i < input.length; i++){
            test[i].MaxHeapLogN(input[i]);
        }

        for(int i = 0; i < result.length; i++){
            assertEquals(result[i],test[i].get());
        }

    }

    @Test
    public void popD(){
        Integer[][] input = {{1,3,8,4,5,9},{},{1,3,8,4,5,9,9},{1,7,7,7,4,3}};
        Integer[][] result = {{8,4,5,1,3},{},{9,5,8,1,4,3},{7,4,7,1,3}};
        Integer[] output = {9,-1,9,7};

        MaxHeap[] test = {new MaxHeap(63),new MaxHeap(63),new MaxHeap(63),new MaxHeap(63)};
        for(int i = 0; i < input.length; i++){
            test[i].MaxHeapLogN(input[i]);
        }

        for(int i = 0; i < input.length; i++){
            assertEquals(output[i],test[i].pop());
        }

        for(int j = 0; j < test.length; j++){
            for(int i = 0; i < result.length; i++){
                if(j != 1){
                    assertEquals(result[j][i],test[j].data[i]);
                }
            }
        }
    }
}