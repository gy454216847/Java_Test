package junit.demo;

import module.Count;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCount {
    @Test
    public void testAdd(){
        int z = new Count().add(3,5);
        assertEquals(z,9);
    }
}
