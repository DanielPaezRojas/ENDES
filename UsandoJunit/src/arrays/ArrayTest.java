package arrays;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;

public class ArrayTest {
	
	@Disabled
    @Test
    public void testSumar() {
    	MisArrays arra= new MisArrays();
    	int[] array1= new int[]{2,4,5};
    	int[] array2= new int[]{1,1,1};
    	int[] resul= new int[]{3,5,6};
    	assertArrayEquals(resul,arra.sumar(array1, array2));
    } 
    
    @Test
    public void testSumar2() {
    	MisArrays arra= new MisArrays();
    	int[] array1= new int[]{1,2,3,4,5};
    	int[] array2= new int[]{5,4,3,2,1};
    	int[] resul= new int[]{6,6,6,6,0};
    	assertArrayEquals(resul,arra.sumar(array1, array2));
    }
}
