package tutorial;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CounterTest {
	Counter counter1;
	
   @Before
	public void setUp () { // creates a (simple) test fixture
		counter1 = new Counter();
	}
	
	@Test
	public void testIncrement (){
	assertTrue (counter1.increment() ==1);
	assertTrue (counter1.increment() ==2 );
	}
	
	@Test
	public void testDecrement (){
		assertTrue (counter1.decrement() == -1);
	}
}