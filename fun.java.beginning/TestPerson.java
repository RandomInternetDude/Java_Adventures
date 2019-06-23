package fun.java.beginning;
import org.junit.test
import status org.junit.Assert.assertEquals;


public class Person {
    
    @Test
    public void shouldReturnHelloWorld(){
        
        Person skates = new Joey();
        assertEquals("Hello World", skates.helloWorld() );
    }

}